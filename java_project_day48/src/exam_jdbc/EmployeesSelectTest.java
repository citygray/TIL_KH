package exam_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//사원번호, 사원이름, 급여 ,입사일, 부서명을 조회하여 출력해주세요.
public class EmployeesSelectTest {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

	
			con = ConnectDatabase.makeConnection("hr","hr1234");
			try {
				stmt = con.createStatement();
			
			
			StringBuffer sql = new StringBuffer();
			sql.append("select employee_id,first_name,salary,hire_date,d.department_name ");
			sql.append("from employees e inner join departments d ");
			sql.append("on e.department_id = d.department_id");
			rs = stmt.executeQuery(sql.toString());
			
			System.out.println("쿼리문 확인: "+ sql);
			
			System.out.println("****** 사원 테이블 정보 출력*******");
			while(rs.next()) {
				System.out.print(rs.getString("employee_id") + "\t");
				System.out.print(rs.getString("first_name") + "\t");
				System.out.print(rs.getInt("salary") + "\t");
				System.out.print(rs.getString("hire_date") + "\t");
				System.out.print(rs.getString("department_name") + "\n");
			}
			
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if(rs != null) rs.close();
					if(stmt != null) stmt.close();
					if(con != null) con.close();
				}catch(Exception en){
					en.printStackTrace();
				}
			}
			
		
	}

}
