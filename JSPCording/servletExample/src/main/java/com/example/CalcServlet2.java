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
//@WebServlet("/calcServlet2")
public class CalcServlet2 extends HttpServlet {
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
		int paramNum1,paramNum2,result;
		String operator;
		
		response.setContentType("text/plain; charset=UTF-8");
		PrintWriter out = response.getWriter(); //출력스트림 생성
		
		paramNum1 = Integer.parseInt(request.getParameter("num1"));
		paramNum2 = Integer.parseInt(request.getParameter("num2"));
		operator = request.getParameter("operator");
		result = calc(paramNum1,paramNum2, operator);
		
		out.println(result);
		out.close();
	}
	
	public int calc(int num1,int num2, String op) {
		int result =0;
		switch (op){
			case "+":
				result = num1+ num2;
				break;
			case "-":
				result = num1- num2;
				break;
			case "*":
				result = num1* num2;
				break;
			case "/":
				if(num2 != 0) {
					result = Math.round(num1/num2);
				}
				
				break;
		}
		return result; 
	}

}
