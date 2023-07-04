<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="example.MinAndMax" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
		<title>Insert title here</title>
	</head>
	<body>
		<!-- 숫자를 저장한 변수 3개(7,5,9)를 정의하고 최대값 구하기 -->
		<%
			
			MinAndMax minAndMax = new MinAndMax();
			int[] arr = {7,5,9};
			int maxNum = minAndMax.max(arr);
			int minNum = minAndMax.min(arr);
		%>
		<p>(7,5,9)의 최대값은 <%=maxNum %></p>
		<p>(7,5,9)의 최소값은 <%=minNum %></p>
	</body>
</html>