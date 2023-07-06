package com.forward.location;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstLocationServlet
 */
@WebServlet("/FirstLocationServlet")
public class FirstLocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html><html>");
		out.println("<head><meta charset='UTF-8'/>");
		out.println("<title>refresh 예제</title>");
		out.println("<link rel='icon' href='data:,'></head>");
		out.println("<script type='text/javascript'>");
		out.println("	location.href='secondLocation?name=HongGilDong&age=20';");
		out.println("</script>");
		out.println("<body></body></html>");
		out.close();
	}

}
