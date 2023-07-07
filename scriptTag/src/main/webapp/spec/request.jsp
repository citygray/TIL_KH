<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%  request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String birth = request.getParameter("birth");
	String scholarship = request.getParameter("scholarship");
	String major = request.getParameter("major");
	String platform = request.getParameter("platform");
	String language = request.getParameter("language");
	
	String Encoding = request.getCharacterEncoding();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
		<title>Insert title here</title>
		<style type="text/css">
			span{display:inline-block;width:60px;}
		</style>
	</head>
	<body>
		<form>
			<fieldset>
				<legend>기술 정보 이력서</legend>
				<%--    
				<div>이름: <%= name%></div>
				<div>생년월일: <%= birth%></div>
				--%>
				
				<div><span>학력: </span><%= scholarship%></div>
				<div><span>학과: </span><%= major%></div>
				<div><span>플랫폼: </span><%= platform%></div>
				<div><span>언어: </span><%= language%></div>
			</fieldset>
			<br>
			<fieldset>
				<legend>요청 정보</legend>
				<div><span>인코딩: </span><%= Encoding%></div>
			</fieldset>
		</form>
	</body>
