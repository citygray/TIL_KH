package com.scope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SetAttribute
 */
@WebServlet("/setAttribute")
public class SetAttribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String ctxMsg ="context에 바인딩됩니다.";
		String sesMsg ="session에 바인딩됩니다.";
		String reqMsg ="request에 바인딩됩니다.";
		
		ServletContext application = request.getServletContext();
		application.setAttribute("context",ctxMsg);
		
		HttpSession session = request.getSession();
		session.setAttribute("session", sesMsg);
		
		request.setAttribute("request", reqMsg);
		
		out.println("<!DOCTYPE html><html>");
		out.println("<head><meta charset='UTF-8'/>");
		out.println("<title>ServletContext 예제</title>");
		out.println("<body>");
		
		//바인딩이란 웹프로그램 실행 시 자원(데이터)를 서블릿 관련 객체에 저장하는 방법.
		// 목적은 서블릿에서 다른 서블릿(JSP)로 데이터를 공유하거나 전달하고자 할때
		out.println("<div>바인딩을 수행합니다.</div>");
		out.println("</body></html>");
		
		RequestDispatcher dispatch = request.getRequestDispatcher("getAttribute");
		dispatch.forward(request, response);
		out.close();
	}


}
