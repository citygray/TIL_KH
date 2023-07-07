$(function(){
	
	$("#btn_sumit").click(function(){
		let numberPattern = /^\d{1,3}$/;
		
				
		if($("#score").val().replace(/\s/g,"")==""){
			alert("숫자를 입력해주세요");
			$("#score").val("");
			$("#score").focus();
			return;
		}else if(!numberPattern.test($("#score").val())){
			alert("점수는 숫자만 입력해주세요");
			$("#score").val("");
			$("#score").focus("");
			return;
		}else if($("#score").val<0 || $("#score").val()>100){
			alert("점수는 0~100 사이로 입력해주세요");
			$("#score").val("");
			$("#score").focus("");
			return;
		}
	
		$("#form").attr({
		"method":"post",
		"action":"score.jsp"
		});
		$("#form").submit();
		
	});
});