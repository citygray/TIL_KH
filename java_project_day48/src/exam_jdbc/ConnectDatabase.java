package exam_jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectDatabase {
	public static Connection makeConnection(String id, String password) {
		//18C
		//jdbc:oracle:thin:@127.0.0.01:1512/xepdb1
					     //서버위치:포트번호/서비스이름
		// jdbc를 thin타입으로 ip주소는 127.0.0.1 (localhost를 말한다.)
		//21c
		String url = "jdbc:oracle:thin:@127.0.0.1:1521/xepdb1";
		Connection con = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("드라이버 적재 성공");
			
			con = DriverManager.getConnection(url,id,password);
			//System.out.println("데이터베이스 연결 성공");
		}catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("연결에 실패하였습니다.");
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String arg[]) throws SQLException{
		Connection con = makeConnection("javauser","JAVA1234");
		con.close();
	}
	//executeQuery(String sql) - SQL문이 select일 경우
	/*
	Statement s = conn.createStatement();
	String sql = "SELECT EMPLOYEE ID";
	
	ResultSet rs = s.executeQuery(sql);
	*/
	/*
	Statement stmt = con.createStatemaent();
	StringBuffer sb = new StringBuffer();
	sb.append("Select employee_id,first_name ");
	sb.append("From employees");
	ResultSet rs = stmt.executeQuery(sb.toString());
	
	int empno = rs.getInt("employee_id");
	String ename = rs.getString("first name");
	//메서드의 매개변수로 컬럼명으로 접근할 수 있고, 쿼리문 작성시 컬럼 순번으로 접근할 수 있다.
	int empno = rs.getInt(1);
	String ename = rs.getString(2);
	*/
}
