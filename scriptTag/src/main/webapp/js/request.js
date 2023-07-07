$(function(){
	const arr1 = ["일반고","특성화고","특목고"];	
	const arr2 = ["정보통신학과","국문학과","기계공학과","회계학과","전기전자학과"];
		
	$("input[name='scholarship']").change(function(){
		
		$("#major").empty();
		let scholarship = $(this).val();
				
		let eleStr = "";
		if(scholarship=="고졸"){
			eleStr = makeList(arr1);
		}else{
			eleStr = makeList(arr2);
		}
		
		$("#major").html(eleStr);		
	});
	
	
	$("#sendBtn").click(function(){
				
		if($("#name").val().replace(/\s/g,"")==""){
			alert("이름를 입력해주세요");
			$("#name").val("");
			$("#name").focus();
			return;
		}
		
		
		if(!$('input[name="language"]').is(":checked") == true){
			alert("사용가능 언어를 선택하세요");
		}
	

		$("#dataForm").attr({
		"method":"post",
		"action":"request.jsp"
		});
		$("#dataForm").submit();
	
	});
	
	$("#resetBtn").click(function(){
		$("#dataForm").each(function(){
			this.reset();
		});
		$("input[name='scholarship']:eq(0)").prop("checked","true");
		$("input[name='scholarship']:eq(0)").click();
	})
	
});

function makeList(arr){
	let str="";
	$.each (arr,function(index, item) {
		str +="<option>"+item+"</option>";
	});
	return str
}