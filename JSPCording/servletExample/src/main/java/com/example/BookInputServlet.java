package com.example;

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
@WebServlet("/bookReg")
public class BookInputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
	
		//doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String publisher = request.getParameter("publisher");
		
		System.out.println(title);
		System.out.println(author);
		System.out.println(publisher);
		
		//바인딩
		
		//각각 설정
//		request.setAttribute("title",title);
//		request.setAttribute("author",author);
//		request.setAttribute("publisher",publisher);
		
		//VO(value Object)로 설정하여 전달
		BookVo book = new BookVo();
		book.setTitle(title);
		book.setAuthor(author);
		book.setPublisher(publisher);
		
		request.setAttribute("book",book);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("bookOutput");
		dispatch.forward(request,response);
		
	
	}


}
