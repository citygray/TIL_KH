$(function(){

	
	$("#btn_submit").click(function(){
			
		if(!chkData("#fdate","날짜를")){ return; }
		else{
			$("#form").attr({
			"method":"post",
			"action":"colordate.jsp"
		});
		$("#form").submit();	
		}
	});
	
	
});

