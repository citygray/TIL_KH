package exam_jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CallableStatementTest {

	public static void main(String[] args) {
		int book_id;
		Scanner input = null;
		Connection con = null;
		CallableStatement cstmt = null;
		
		try {
			input = new Scanner(System.in);
			System.out.println("책번호 입력 : ");
			book_id = input.nextInt();
			
			con = ConnectDatabase.makeConnection("javauser", "JAVA1234");
			cstmt = con.prepareCall("{call book_proc(?,?)}");
			cstmt.setInt(1,book_id);
			cstmt.registerOutParameter(2,Types.VARCHAR);
			cstmt.executeQuery();
			
			System.out.printf("책제목: %s",cstmt.getString(2));
			
		}catch(InputMismatchException i) {
			System.out.println("입력값이 잘못되었습니다.");
		}catch(SQLException s) {
			System.out.println("오라클 서버 연동 후 쿼리 실행에 문제가 발생하였습니다.");
		}catch(Exception e) {
			System.out.println("Error("+e.getMessage()+")");
		}finally {
			try {
				
			}catch(Exception e) {
				System.out.println("연결 해제 오류");
				e.printStackTrace();
			}
		}

	}

}
