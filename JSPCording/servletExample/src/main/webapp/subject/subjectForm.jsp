<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
		<script type="text/javascript" src="/servletExample/js/jquery-3.7.0.min.js"></script>
		<script type="text/javascript" src="/servletExample/js/common.js"></script>
		<script type="text/javascript" src="/servletExample/js/subjectform.js"></script>
		<title>Insert title here</title>
	</head>
	<body>
		<h1>subject 학과정보 등록</h1>
		<hr>
		<form name="subject" id="subject">
			<table>
				<colgroup>
					<col width="100"></col>
					<col width="300"></col>
				</colgroup>
				<thead>
					<tr>
						<th colspan="2">학과 정보 등록</th>
					<tr>
				</thead>
				<tbody>
					<tr>
						<td>학과번호</td>
						<td><input type="text" name="s_num" id="s_num" readonly="readonly" /></td>
					</tr>
					<tr>
						<td>학과명</td>
						<td><input type="text" name="s_name" id="s_name"/></td>
					</tr>
				</tbody>
				<tfoot>
					<tr>
						<td colspan="2" class="text-center">
							<input type="button" id="insertBtn" value="입력완료"/>
							<input type="button" id="resetBtn" value="다시쓰기"/>
							<input type="button" id="listBtn" value="목록"/>
						</td>
					<tr>
				</tfoot>
			</table>
		</form>
	</body>
</html>