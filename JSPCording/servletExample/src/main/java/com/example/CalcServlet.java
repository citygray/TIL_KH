package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		
		int paramNum1 = Integer.parseInt(request.getParameter("num1"));
		int paramNum2 = Integer.parseInt(request.getParameter("num2"));
		String[] operator = request.getParameterValues("operator");
		
		int result =0;
		switch (operator[0]){
			case "+":
				result = paramNum1+ paramNum2;
				break;
			case "-":
				result = paramNum1- paramNum2;
				break;
			case "*":
				result = paramNum1* paramNum2;
				break;
			case "/":
				result = Math.round(paramNum1/paramNum2);
				break;
		}
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html><html>");
		out.println("<head><meta charset='UTF-8'/>");
		out.println("<title>Post date</title>");
		out.println("<link rel='icon' href='data:,'></head>");
		out.println("<body>");
		
		out.println("<div style='text-align:center'>결과는? <strong>");
		out.println(result);
		
		out.println("</strong></div></html>");
		
		out.close();
	}

}
