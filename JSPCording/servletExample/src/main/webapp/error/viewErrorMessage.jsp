<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--@ page isErrorPage = "true" --%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
		<title>viewErrorMessage.jsp</title>
				
		<link rel="shortcut icon" href="../image/icon.png" />
		<link rel="apple-touch-icon" href="../image/icon.png" />
		
		<!--[if lt IE 9]>
		<script src="../js/html5shiv.js"></script>
		<![endif]-->
		
	</head>
	
	<body>
		<div id="wrapper">
			<p>요청 처리 과정에서 예외가 발생하였습니다.<br />
			빠른 시간 내에 문제를 해결하도록 하겠습니다.</p>
			<%-- <div id="imgView">
				<label>에러 타입: </label>
				<%= exception.getClass().getName() %><br />
				<label>에러 메시지:</label>
				<strong><%=exception.getMessage() %></strong>
			</div> --%>
		</div>
	</body>
</html>