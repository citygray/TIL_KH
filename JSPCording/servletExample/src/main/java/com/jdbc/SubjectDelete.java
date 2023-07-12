package com.jdbc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.subject.SubjectVO;

/**
 * Servlet implementation class SubjectInsert
 */
@WebServlet("/delete")
public class SubjectDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		SubjectVO vo = new SubjectVO();
		vo.setNo(Integer.parseInt(request.getParameter("no")));
				
		SubjectService subjectService = SubjectService.getInstance();
		boolean result = subjectService.subjectDelete(vo);
		
		if(result) {
			response.sendRedirect("/servletExample/list");
		}else {
			request.setAttribute("message", "게시글 삭제 실패");
			RequestDispatcher dispatcher = request.getRequestDispatcher("error/viewErrorMessage.jsp");
			dispatcher.forward(request, response);
		}
	}

}
