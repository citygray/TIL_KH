package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBConnectServlet
 */
@WebServlet("/connect")
public class DBConnectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		
		out.println("<!DOCTYPE html><html>");
		out.println("<head><meta charset='UTF-8'/>");
		out.println("<title>데이터 베이스 연동</title>");
		out.println("<body>");
		out.println("<div>데이터베이스 드라이버와 Oracle 서버 연결 점검 프로그램</div>");

		Connection con = null;
		try {
			String driverName = "oracle.jdbc.driver.OracleDriver";
			String dbURL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
			
			Class.forName(driverName);
			con = DriverManager.getConnection(dbURL,"javauser","JAVA1234");
			
			out.println("Oracle 서버에 성공적으로 접속했습니다.");
			out.println("</body></html>");
			out.close();
		}catch(Exception e) {
			out.println("Oracle 서버 접속에 문제가 있습니다.");
			out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			try {
				if(con != null) {
					con.close();
				}
			} catch(Exception e2) {
				out.println(e2.getMessage());
			}
		}
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		doGet(req,resp);
	}

	
}
