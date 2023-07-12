$(function(){
	
	$.ajax({
		url:"/servletExample/subjectNumber",
		type:"post",
		dataType:"text",
		success: function(data){
			$("#s_num").val(data);
		},
		error: function(xhr, textStatus, errorThrown){
			alert(textStatus + "(HTTP - "+xhr.status+"/"+errorThrown);
		}
	});
	
	$("#insertBtn").click(function(){
	
		if(!chkData("#s_num","학과번호를 ")) return;
		else if (!chkData("#s_name","학과명를 ")) return;
		else{
			$("#subject").attr({
				"method":"post",
				"action":"/servletExample/insert"
			});
		$("#subject").submit();
		}
	});
	
	$("#resetBtn").click(function(){
		$("#subject").each(function(){
			this.reset();
		});
	});
	
	$("#listBtn").click(function(){
		location.href="/servletExample/list";
	});
	
});