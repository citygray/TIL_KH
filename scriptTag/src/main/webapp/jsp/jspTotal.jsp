<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
		<title>JSP 종합 예제</title>
	</head>
	<body>
		<h2>종합예제</h2>
		<hr>
		<%!
			String[] members = {"김길동","홍길동","하길동","김사랑"};
			int num1 = 10;
			
			int calc(int num2){
				return num1 + num2;
			}
		%>
		<h3>
			1.JSP주석
			<!-- html 주석 -->
			<%-- JSP 주석 --%>
		</h3>
		
		<h3>
			2.calc(10)메서드 실행 결과:
			<%=calc(10) %>
		</h3>
		<hr>
		<h3>
			3.include:hello.jsp
			<%@ include file="hello.jsp" %>
		</h3>
		<hr>
		<h3>
			4.스크립트(배열 데이터 출력)
		</h3>
		<ul>
			<%
				for(String name : members){
			%>
				<li><%= name%></li>			
			<%
			} 
			%>
		</ul>
	</body>
</html>