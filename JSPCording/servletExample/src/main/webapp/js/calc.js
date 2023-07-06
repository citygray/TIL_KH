$(function(){
	
	$("#btn").click(function(){
		const numberPattern = /^\d+$/g;
		
				
		if($("#num1").val().replace(/\s/g,"")==""){
			alert("첫번째 숫자를 입력해주세요");
			$("#num1").val("");
			$("#num1").focus();
			return;
		}else{
			if($("#num1").val().search(numberPattern) < 0){
				alert("문자를 입력할 수 없습니다.");
				$("#num1").val("");
				$("#num1").focus("");
				return;
			}
			 
		}
		
		if($("#num2").val().replace(/\s/g,"")==""){
			alert("첫번째 숫자를 입력해주세요");
			$("#num1").val("");
			$("#num1").focus();
			return;
		}else{
			if($("#num1").val().search(numberPattern) < 0){
				alert("문자를 입력할 수 없습니다.");
				$("#num1").val("");
				$("#num1").focus("");
				return;
			}
			 
		}
		
		
		
		if($("#operator").val()=="/"){
			if($("#num2").val()==0){
				alert("나누기의 분모의 값은 0이 될수 없습니다.");
				return;	
			}	
		}
		
		// 속성추가방식(페이지 전환됨)
		/*
		$("#form").attr({
			"method":"post",
			"action":"/servletExample/calcServlet"
		});
		$("#form").submit();
		*/
		//폼전체 데이터 전송
		//data : $("#form").serialize(),
		
		//함수를 사용하지 않을 경우
		//data에 값을 하나하나 넣어줘야함. 
		
		$.ajax({
			url:"/servletExample/calcServlet2",//context root/@WebServlet명   요청 URL
			type:"post",					   //전송방식(get/post)
			data:$("#form").serialize(),	   //서버에 전달한 파라미터(serialize():폼 전체 테이터 전송)
			dataType :"text",				   //서버로 부터 응답 받을 문서타입(text/json/xml)
			success : function(data){
				$("#result").val(data);	
			},
			error: function(xhr, textStatus, errorThrown){
				alert(textStatus + "(HTTP - " + xhr.status + " / " + errorThrown);
			}
		})
		
	});
});