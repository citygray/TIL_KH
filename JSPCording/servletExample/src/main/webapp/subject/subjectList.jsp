<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, com.subject.SubjectVO" %>
<%
	@SuppressWarnings("unchecked")
	ArrayList<SubjectVO> list = (ArrayList<SubjectVO>)request.getAttribute("list");
	int counter = list.size();
%>
<!-- view
사용자에게 보여줄 화면 담당
jsp가 화면 기능 담당
Model에서 처리한 결과를 화면에 표시
 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
		<!--  <link rel="stylesheet" type="text/css" href="/servletExample/css/subject.css"/>-->
		<script type="text/javascript" src="/servletExample/js/jquery-3.7.0.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$("#subjectInsert").click(function(){
					location.href ="<%= request.getContextPath()%>/subject/subjectForm.jsp";
				});
				
								
				$(".deleteBtn").click(function(){
					let no = $(this).parents().parents().data("no");
							
					console.log(no);
					$.ajax({
						url:"/servletExample/delete",
						type:"post",
						dataType:"text",
						data: {no:no},
						success: function(data){
							alert("삭제성공");
						},
						error: function(xhr, textStatus, errorThrown){
							alert(textStatus + "(HTTP - "+xhr.status+"/"+errorThrown);
						}
					});
				})
			})
		</script>
		
		<title>자바 빈즈를 이용한 subject테이블 조회 예제 : subjectList.jsp</title>
	</head>
	<body>
		<div id="container">
			<h1>자바 빈즈 SubjectDAO를 통해 subject테이블 조회 프로그램</h1>
			<hr/>
			<div id="subjectList">
				<div class="text-right">
					<input type="button" value="학과정보등록" id="subjectInsert"/>
				</div>
				<table>
					<thead>
						<tr>
							<th>번호</th>
							<th>학과번호</th>
							<th>학과명</th>
							<th colspan="2">삭제 여부</th>
						</tr>
					</thead>
				
					<tbody>
					<% if (counter > 0) { 
						for( SubjectVO sub : list ) {
						
					%>
							<tr class="text-center" data-no="<%= sub.getNo()%>">
								<td><%= sub.getNo()%></td>
								<td><%= sub.getS_num()%></td>
								<td><%= sub.getS_name()%></td>
								<td><%= sub.getDeletable()%></td>
								<td>
									<input type="button" class="deleteBtn" value="삭제"/>
								</td>
							</tr>
					<%
						}
					}else{
					%>
						<tr>
							<td colspan="4" class="text-center">
								조회된 학고 정보가 존재하지 않습니다.
							</td>
						</tr>
					<%} %>
					</tbody>
				</table>
				<div class="text-right">
					조회된 학과 수는 <span id="counter"><%=counter %></span>입니다.
				</div>
			</div>
		</div>
	</body>
</html>