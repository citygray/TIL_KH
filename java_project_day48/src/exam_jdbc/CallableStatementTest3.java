package exam_jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

public class CallableStatementTest3 {

	public static void main(String[] args) {
		Connection con = null;
		CallableStatement cstmt = null;
		
		ResultSet rs = null;
		
		try {
			con = ConnectDatabase.makeConnection("hr", "hr1234");
			cstmt = con.prepareCall("{call HIREYEAR(?)}");
			cstmt.registerOutParameter(1,OracleTypes.CURSOR);
			cstmt.executeQuery();
			
			rs = (ResultSet)cstmt.getObject(1);
			
			System.out.println("******* hire date ************");
			while(rs.next()) {
				String DEPARTMENT_ID = rs.getString("DEPARTMENT_ID");
				String DEPARTMENT_NAME = rs.getString("DEPARTMENT_NAME");
				int Y2001 = rs.getInt("Y2001");
				int Y2002 = rs.getInt("Y2002");
				int Y2003 = rs.getInt("Y2003");
				int Y2004 = rs.getInt("Y2004");
				int Y2005 = rs.getInt("Y2005");
				System.out.println(DEPARTMENT_ID+" / "+DEPARTMENT_NAME +" / "+ Y2001+" / "+Y2002 +" / "+Y2003  +" / "+ Y2004 +" / "+ Y2005);
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
