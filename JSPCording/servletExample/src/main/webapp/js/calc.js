$(function(){
	
	$("#btn").click(function(){
		if($("#num1").val().replace(/\s/g,"")==""){
			alert("첫번째 숫자를 입력해주세요");
			$("#num1").val("");
			$("#num1").focus();
			return;
		}
		
		if($("#num2").val().replace(/\s/g,"")==""){
			alert("두번째 숫자를 입력해주세요");
			$("#num2").val("");
			$("#num2").focus();
			return;
		}
		
		
		$("#form").attr({
			"method":"post",
			"action":"/servletExample/calcServlet"
		});
		$("#form").submit();
		
		
	});
});