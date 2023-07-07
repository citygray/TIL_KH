<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 사용자 소스에서 빈줄 제거 -->
<%@ page trimDirectiveWhitespaces="true" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
		<title>JSP예제 - scriptlet</title>
	</head>
	<body>
	<h4>JSP로 구현한 구구단 - 단을 입력받아 해당하는 단만 출력</h4>
	<%
	int dan = 2;
	if(request.getParameter("dan") != null){
		dan = Integer.parseInt(request.getParameter("dan"));
	}
	
	if(dan >= 1 && dan <=9){
		for(int i = 1; i<=9; i++){
	%>
			<%=dan %> X <%=i %> = <%=dan*i %><br/>
	<% 
		}
	%>
	<hr/>
	<%
		for(int i =1;i<=9;i++){
			out.print(dan + " X " + i +" = "+ dan*i+ "<br>");
		}
	} else{
	%>
		<h5 style="color:red">1에서 9사이의 값을 입력해주세요</h5>
	<%	
	}
	%>
	<h4>스크립트릿을 이용한 구구단  2~9단까지 출력</h4>	
	<% 
		for(int i =2;i<=9;i++){
			
			for(int j=1;j<=9;j++){
				out.print(i + " X " + j +" = "+ i*j+ "<br>");
			}
			out.println("------------------------------<br>");
		}
	%>
	</body>
</html>