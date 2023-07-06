$(function(){
	$("#regBtn").on("click",()=>{
		if(!chkData($("#title"),"제목을")) return;
		else if(!chkData($("#author"),"저자를")) return;
		else if(!chkData($("#publisher"),"출판사명을")) return;
		else{
			$("#bookForm").attr({
			"method":"post",
			"action":"/servletExample/bookReg"
			});
			$("#bookForm").submit();	
		}
	});
});