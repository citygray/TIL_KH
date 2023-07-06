package com.forward.dispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstDispatcherServlet
 */
@WebServlet("/firstDispatcher")
public class FirstDispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		//get방식
		//RequestDispatcher dispatch = request.getRequestDispatcher("secondDispatcher?language=java");
		//dispatch.forward(request,response);
		
		//바인딩
		request.setAttribute("language","java");
		request.setAttribute("name","홍길동");
		request.setAttribute("address","서울특별시 강남구 테헤란로 14길 6");
		
		RequestDispatcher dispatch = request.getRequestDispatcher("secondDispatcher");
		dispatch.forward(request,response);
		
		
		
	}


}
