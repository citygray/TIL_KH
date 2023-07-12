<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  request.setCharacterEncoding("utf-8");
	String color = request.getParameter("color");
	String date = request.getParameter("date");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
		<script src="../js/jquery-3.7.0.min.js"></script>
		<script src="../js/common.js"></script>
		<script src="../js/colordate.js"></script>
		<title>Insert title here</title>
	</head>
	<body>
		<% if(request.getMethod().equals("GET")) {%>
			
		<h1>원하는 색상과 날짜를 선택하세요</h1>
		<form id="form">
			<p><label for="fcolor">색상: </label><input type="color" id="fcolor" name="fcolor"/></p>
			<p><label for="fdate">날짜: </label><input type="date" id="fdate" name="fdate"/></p>
			<p><input type="button" value="전송" id="btn_submit"/></p>
		</form>
		
		<%} else { %>
			<script type="text/javascript">
				$(function(){
					$("span").css("color","<%= request.getParameter("fcolor")%>");
				})	
			</script>
			<p>선택날짜는 <span><%= request.getParameter("fdate")%></span>입니다.</p>
		
		<% } %>
	</body>
</html>