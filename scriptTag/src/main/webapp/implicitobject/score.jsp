<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String data = request.getParameter("score");
	int score = 0;
	if(data != null){
		score = Integer.parseInt(data);
	}
		
%>
	
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
		<title>Insert title here</title>
	</head>
	<body>
		<% 
			String hakjum ="";
			if(score>=90 && score<=100){
				hakjum = "A";
			}else if(score>=80){
				hakjum = "B";
			}else if(score>=70){
				hakjum = "C";
			}else if(score>=60){
				hakjum = "D";
			}else{
				hakjum = "F";
			}
		%>
		<div>입력한 점수는 <%= score%></div>
		<div>학점은 <%= hakjum%></div>
	</body>
</html>