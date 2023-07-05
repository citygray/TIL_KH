package com.example;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FirstServlet() {
		System.out.println("FirstServlet 객체 생성");
	}
	
	/**
	 * @see Servlet#init(ServletConfig)
	 * init()메서드는 서블릿이 최초로 호출되었을때 서블릿 컨터이너가 자동실행.
	 * 서블릿 객체 생성 후 단 한번만 실행.
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 메서드 호출");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 * service() 메서드는 클라이언트 요청이 있을 때마다 매번 서블릿 컨테이너가 자동실행
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service(ServletRequest, ServletResponse)메서드 호출");
	}

}
