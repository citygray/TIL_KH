package exam_jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.internal.OracleTypes;

public class CallableStatementTest2 {

	public static void main(String[] args) {
		Connection con = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		
		try {
			con = ConnectDatabase.makeConnection("javauser", "JAVA1234");
			cstmt = con.prepareCall("{call books_select(?)}");
			cstmt.registerOutParameter(1,OracleTypes.CURSOR);
			cstmt.executeQuery();
			
			rs = (ResultSet)cstmt.getObject(1);
			
			System.out.println("******* books 테이블 검색 데이터 ********");
			System.out.printf("%30s %s\n","책제목","책가격");
			while(rs.next()) {
				System.out.printf("%-28s\t %s\n",rs.getString("title"),rs.getInt("price"));
			}
		}catch(SQLException s) {
			System.out.println("오라클 서버 연동 루 쿼리 실행에 문제가 발생하였습니다");
		}catch(Exception e) {
			System.out.println("ERROR("+e.getMessage()+")");
		}finally {
			try {
				if(cstmt != null) { cstmt.close();}
				if(con != null) {con.close();}
			}catch(Exception e) {
				System.out.println("연결 해제 오류");
				e.printStackTrace();
			}
		}

	}

}
