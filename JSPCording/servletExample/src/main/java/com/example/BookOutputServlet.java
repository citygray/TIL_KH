package com.example;

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
@WebServlet("/bookOutput")
public class BookOutputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(req, resp);
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		//get방식
		//String language = request.getParameter("language");
		
		//각각 바인딩 
		/*
		String title = (String)req.getAttribute("title");
		String author = (String)req.getAttribute("author");
		String publisher = (String)req.getAttribute("publisher");
		*/
		BookVo book = (BookVo)req.getAttribute("book");
		
		
		out.println("<!DOCTYPE html><html>");
		out.println("<head><meta charset='UTF-8'/>");
		out.println("<title>Dispatcher 바인딩 예제</title>");
		out.println("<link rel='icon' href='data:,'></head>");
		out.println("<body>");
		
		out.println("<div style='text-align:center'>책정보</div><ul>");
		out.println("<li>책제목: "+ book.getTitle()+"</li>");
		out.println("<li>저자:  "+ book.getAuthor()+"</li>");
		out.println("<li>출판사: "+ book.getPublisher()+"</li>");
		
		out.println("</ul></body></html>");
		out.close();
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
