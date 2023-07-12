package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.subject.SubjectDAO;
import com.subject.SubjectVO;

/**
 * Servlet implementation class SubjectServlet2
 */
@WebServlet("/SubjectServlet2")
public class SubjectServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		SubjectDAO dao = new SubjectDAO();
		ArrayList<SubjectVO> list = dao.getSubjectTotal(null);
		int counter = list.size();
		
		out.println("<!DOCTYPE html><html>");
		out.println("<head><meta charset='UTF-8'/>");
		out.println("<title>학과 리스트 예제</title>");
		out.println("<body>");
		out.println("<h3>학과 리스트</h3>");
		
		out.println("<div id='subjectList'><table>");
		out.println("<thead><tr>");
		out.println("<th>일련번호</th>");
		out.println("<th>학과번호</th>");
		out.println("<th>학과명</th>");
		out.println("</tr></thead>");
		out.println("<tbody>");
		if(counter >0) {
			for(SubjectVO svo :list) {
				out.println("<tr class='text-center'>");
				out.println("<td>"+svo.getNo()+"</td>");
				out.println("<td>"+svo.getS_num()+"</td>");
				out.println("<td>"+svo.getS_name()+"</td>");
				out.println("</tr>");
				
			}
		}
		out.println("</tbody></table>");
		out.println("</div>");
		out.println("</body></html>");
		out.close();
	}


}
