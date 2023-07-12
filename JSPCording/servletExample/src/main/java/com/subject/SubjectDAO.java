package com.subject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import static com.common.JDBCTemplate.*;

public class SubjectDAO {
	/**********************************************
	 * getSubjectTotal(SubjectVO vo)메서드:학과 테이블에서 모든 테이블에서 모든 레코드를 반환 메서드
	 * 검색 시 검색값을 vo로 전달 받음.
	 * @return ArrayList<SubjectVO> 자료형 리턴.
	 */
	public ArrayList<SubjectVO> getSubjectTotal(SubjectVO vo){
		StringBuffer sql = new StringBuffer();
		sql.append("select no,s_num,s_name,deletable from subjectselect ");
		if(vo!=null) {
			sql.append("where s_name like ?");
		}
		sql.append("order by no");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		SubjectVO svo = null;
		ArrayList<SubjectVO> list = new ArrayList<SubjectVO>();
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql.toString());
			if(vo != null) {
				pstmt.setString(1,"%"+vo.getS_name() +"%");
			}
			rs = pstmt.executeQuery(); 
			
			//ResultSet의 결과에서 모든 행을 각각의SubjectVO 객체에 저장
			while(rs.next()) {
				//한 행의 학과 정보를 저장할 VO객체 생성
				svo = new SubjectVO();
				//한 행의 학과 정보를 VO객체에 저장
				svo.setNo(rs.getInt("no"));
				svo.setS_num(rs.getString("s_num"));
				svo.setS_name(rs.getString("s_name"));
				svo.setDeletable(rs.getString("deletable"));
				
				//ArrayList 객체에 원소로 추가
				list.add(svo);
			}
		}catch(SQLException se) {
			System.out.println("조회에 문제가 있어 잠시 후에 진행해 주세요");
			se.printStackTrace();
		}catch(Exception e) {
			System.out.println("error= ["+e+"]");
		}finally {
			close(rs);
			close(pstmt);
			close(con);
		}
		return list;
	}

	/**********************************************
	 * subjectInsert(SubjectVO svo)메서드: 학과 테이블에 데이터 입력.
	 * @return boolean 자료형 리턴.
	 */
	public boolean subjectInsert(SubjectVO svo) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into subject(no,s_num,s_name) ");
		sql.append("values (subject_seq.nextval,?,?)");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean success = false;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, svo.getS_num());
			pstmt.setString(2, svo.getS_name());
			
			int i = pstmt.executeUpdate();
			if(i == 1) {
				success = true;
				commit(con);
			}
		}catch(SQLException se) {
			System.out.println("입역에 문제가 있어 잠시 후에 다시 진행해 주세요");
			rollback(con);
			se.printStackTrace(); //오류발생시
		}catch(Exception e) {
			System.out.println("error=["+e+"]");
			rollback(con);
		}finally {
			close(pstmt);
			close(con);
		}
		
		return success;
	}
	
	 /***********************************************************
     * getSubjectNum() 메서드: 학과번호 자동 구하기.
     * @return String 자료형 리턴.
     ***********************************************************/
    public String getSubjectNum() {
    	StringBuffer sql = new StringBuffer();
    	
    	//쿼리문을 작성해 주세요
    	sql.append("SELECT nvl(lpad(max(to_number(LTRIM(s_num,'0')))+1,2,'0'),'01')");  
    	sql.append("AS subjectNum FROM SUBJECT");
    	
    	Connection con= null;
    	PreparedStatement pstmt = null;
    	ResultSet rs = null;
    	String subjectNum = "";
    	try {
    		con = getConnection();
    		pstmt = con.prepareStatement(sql.toString());
    		rs = pstmt.executeQuery();
    		
    		if(rs.next()) {
    			subjectNum = rs.getString("subjectNum"); //별칭을 쓰거나
    			//subjectNum = rs.getString(1); //숫자를 쓰거나
    		}
    		
    	}catch(SQLException se) {
            System.out.println("조회에 문제가 있어 잠시 후에 다시 진행해 주세요.");
            se.printStackTrace();
        }catch (Exception e){
            System.out.println("error = [ "+e+" ]");
        }finally{
           close(rs);
           close(pstmt);
           close(con);
        }
    	
    	return subjectNum;
    	
    }
    
    
    public boolean subjectDelete(SubjectVO svo) {
		StringBuffer sql = new StringBuffer();
       	
    	sql.append("delete FROM SUBJECT ");
    	sql.append("WHERE no = ?");
    	
    	Connection conn = null;
    	PreparedStatement pstmt = null;
    	boolean success = false;
    	
    	try {
    		conn = getConnection();
    		pstmt = conn.prepareStatement(sql.toString());
    		pstmt.setInt(1,svo.getNo());//일련번호
    		
    		int i = pstmt.executeUpdate();// 쿼리문 실행 - 결과값은 입력된 행의 수 반환
    		if(i==1) {
    			success = true;
    		}
    		
    	 }catch(SQLException se) {
             System.out.println("입력에 문제가 있어 잠시 후에 다시 진행해 주세요.");
             se.printStackTrace(); //오류 발생 시 확인
         }catch (Exception e){
             System.out.println("error = [ "+e+" ]");
         } finally{
             try{
                 if (pstmt != null) pstmt.close( );
                 if (conn != null) conn.close( );
             }catch(SQLException e){
                 System.out.println("디비 연동 해제 error = [ "+e+" ]");
             }
         }
         return success;
	}
    
    
    /***********************************************************
     * validationDel() 메서드: 삭제가능 여부 확인.
     * @return boolean 자료형 리턴.
     ***********************************************************/
    public int getDeletable(int no) {
    	StringBuffer sql = new StringBuffer();
    	sql.append("select count(*)from SUBJECT SB inner join STUDENT ST ");
    	sql.append("on sb.s_num = st.s_num where sb.no = ?");
    	   	
    	
    	
    	Connection conn= null;
    	PreparedStatement pstmt = null;
    	ResultSet rs = null;
    	int deletable = 0;
    	try {
    		conn = getConnection();
    		pstmt = conn.prepareStatement(sql.toString());
    		pstmt.setInt(1,no);//참조되어있는 학생수
    		rs = pstmt.executeQuery();
    		
    		if(rs.next()) {
    			deletable = rs.getInt(1);
    		}
    		
    	}catch(SQLException se) {
            System.out.println("조회에 문제가 있어 잠시 후에 다시 진행해 주세요.");
            se.printStackTrace();
        }catch (Exception e){
            System.out.println("error = [ "+e+" ]");
        }finally{
            try{
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            }catch(SQLException e){
                System.out.println("디비 연동 해제 error = [ "+e+" ]");
            }
        }
    	
    	return deletable;
    	
    }
}
