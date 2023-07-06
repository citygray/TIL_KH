package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class firstRedirectServlet
 */
@WebServlet("/firstRedirectServlet")
public class FirstRedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//같은 context명을 사용하기에 생략가능
		//response.sendRedirect("/servletExample/secondRedirect?name=Younghee");
		response.sendRedirect("secondRedirect?name=Younghee&LastName=Kim");
	}

}
