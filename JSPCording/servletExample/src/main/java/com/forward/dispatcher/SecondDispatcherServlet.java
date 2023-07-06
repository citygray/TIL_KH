package com.forward.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondDispatcherServlet
 */
@WebServlet("/secondDispatcher")
public class SecondDispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//get방식
		//String language = request.getParameter("language");
		
		//바인딩 
		String language = (String)request.getAttribute("language");
		String name = (String)request.getAttribute("name");
		String address = (String)request.getAttribute("address");
		
		out.println("<!DOCTYPE html><html>");
		out.println("<head><meta charset='UTF-8'/>");
		out.println("<title>Dispatcher 바인딩 예제</title>");
		out.println("<link rel='icon' href='data:,'></head>");
		out.println("<body>");
		
		out.println("<div style='text-align:center'>Dispatcher 바인딩를 이용한 redirect 실습입니다.</div>");
		out.println("<div>우리가 배우는 언어는 "+ language+" 입니다.</div>");
		out.println("<div>이름는 "+ name+" 입니다.</div>");
		out.println("<div>주소는 "+ address+" 입니다.</div>");
		
		out.println("</body></html>");
		out.close();
	}

}
