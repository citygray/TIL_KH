
$(function() { 
    
    //이메일 select 선택시
    $("#emailAddress").on("change",function(){
        
        let emailAddress = $(this).val();

        if($("#emailAddress >option:selected").index()==5){
            $("#emailDomain").removeAttr("readonly");
            $("#emailDomain").val("");
            $("#emailDomain").focus();
        }else{
            $("#emailDomain").prop("readonly","readonly");
            $("#emailDomain").val(emailAddress);
        }
    })

    // 취미 전체선택시
    /*
    $("#all_check").on("change",function(){
        if($("#all_check").is(":checked")){
            $(".hobby_check").each(function() {
                $(this).prop("checked",true);              
            });
        }else{
            $(".hobby_check").each(function() {
                $(this).prop("checked",false);              
            });
        }
    })
    */

    $("#all_check").change(function(){
        let is_check =$(this).is(":checked");
        $(".hobby_check").prop("checked",is_check);
    })

   

    $("#upload_file_check").change(function(){
        let is_check = $(this).is(":checked");
        $("#upload_file").prop("disabled",!is_check);
    })


    // id 속성이 join인 <form>태그 안의 submit 버튼을 누른 경우
    // $("버튼요소").click(function(){ if(조건문) {실행문; return;}})

    $("#join").submit(function(e){
        e.preventDefault();

        //아이디 입력 검사
        let userid = $("input[name='user_id']").val();
        if(userid.replace(/\s/g,"")==""){
            alert("아이디를 입력하세요");
            $("input[name='user_id']").val("");
            $("input[name='user_id']").focus();
            return false;
        }
        let regExp = /^[a-z0-9][a-zA-Z0-9]{8,15}$/;
        if(!regExp.test(userid)){
            $("input[name='user_id']").val("");
            $("input[name='user_id']").focus();
            return false;
        }
        
        //비밀번호 확인
        if($("input[name='user_pw']").val().replace(/\s/g,"")==""){
            alert("비밀번호를 입력하세요");
            $("input[name='user_pw']").val("");
            $("input[name='user_pw']").focus();
            return false;
        }
        if($("input[name='user_pw2']").val().replace(/\s/g,"")==""){
            alert("비밀번호를 입력하세요");
            $("input[name='user_pw2']").val("");
            $("input[name='user_pw2']").focus();
            return false;
        }

        if($("#user_pw").val() != $("#user_pw2").val()){
            alert("비밀번호와 비밀번호 확인은 일치해야 합니다.");
            $("input[name='user_pw2']").val("");
            $("input[name='user_pw2']").focus();
            return false;
        }

        //이름 확인
        if($("#user_name").val().replace(/\s/g,"")==""){
            alert("이름을 입력하세요.");
            $("#user_name").val("");
            $("#user_name").focus();
            return false;
        }
        let regNameExp = /^[가-힣]{2,20}$/;
        if(!regNameExp.test($("#user_name").val())){
            $("#user_name").val("");
            $("#user_name").focus();
            return false;
        }

        //생년월일 확인
        if($("#birth").val().replace(/\s/g,"")==""){
            alert("생년월일을 입력하세요.");
            $("#birth").val("");
            $("#birth").focus();
            return false;
        }

        //라디오 버튼 선택여부 검사
        if(!$("input[name='gender']").is(":checked")){
            alert("성별을 선택해주세요.");
            return false;
        }

        //이메일 입력여부 검사
        if($("input[name='email']").val().replace(/\s/g,"")==""){
            alert("이메일 주소를 입력하세요");
            $("input[name='email']").val("");
            $("input[name='email']").focus();
            return false;
        }

        //이메일 입력여부 검사
        if($("input[name='emailDomain']").val().replace(/\s/g,"")==""){
            alert("이메일 주소를 입력하세요");
            $("input[name='emailDomain']").val("");
            $("input[name='emailDomain']").focus();
            return false;
        }

        // 핸드폰 번호 입력여부 검사
        if($("input[name='hpno']").val().replace(/\s/g,"")==""){
            alert("핸드폰 번호를 입력하세요");
            $("input[name='hpno']").val("");
            $("input[name='hpno']").focus();
            return false;
        }

        //체크박스 선택여부 검사
        if(!$("input[name='hobby']").is(":checked")){
            alert("취미을 선택해주세요.");
            $("input[name='hobby']:eq(0)").focus();
            return false;
        }

        /** select 선택여부 검사 
         * $("select의 셀렉터 > option:selected").index() : 선택된 항목의 index번호
         * $("select의 셀렉터 > option:selected").val() : 선택된 항목의 값
         * $("select의 셀렉터").val()
         * 
        */

        // 직업 선택여부 검사
        if($("#job>option:selected").index()<1){
            alert("직업을 선택해주세요");
            $("#job").focus();
            return false;
        }

        //입력 내용을 화면에 출력해 봅니다.
        let result =  "<h3>회원가입 입력 데이터</h3><ul>"
        result += "<li>아이디: "+$("#user_id").val()+"</li>";
        result += "<li>비밀번호: "+$("#user_pw").val()+"</li>";
        result += "<li>이름: "+$("#user_name").val()+"</li>";
        result += "<li>생년월일: "+$("#birth").val()+"</li>";
        result += "<li>성별: "+$("input[name='gender']:checked").val()+"</li>";
        
        let email = $("#email").val()+$("#emailDomain").val();
        result += "<li>이메일: "+email+"</li>";
        result += "<li>핸드폰: "+$("#hpno").val()+"</li>";

        let hobby = $(".hobby_check:checked");
        let select_hobby ="";

        hobby.each(function() {
            select_hobby += $(this).val()+" ";
        });
        result += "<li>취미: "+select_hobby+"</li>";
        result += "<li>직업: "+$("#job>option:selected").val()+"</li>";
        result += "</ul>";


        $("#formResult").show();
        $("#formResult").html(result);
    });

    $("#resetBtn").click(function(){
        $("#join").each(function(){
            this.reset();
        });
        $("#formResult").hide();
    })

    $("#sendBtn").click(function(){
        //아이디 입력 검사
        let userid = $("input[name='user_id']").val();
        if(userid.replace(/\s/g,"")==""){
            alert("아이디를 입력하세요");
            $("input[name='user_id']").val("");
            $("input[name='user_id']").focus();
            return;
        }
        let regExp = /^[a-z0-9][a-zA-Z0-9]{8,15}$/;
        if(!regExp.test(userid)){
            $("input[name='user_id']").val("");
            $("input[name='user_id']").focus();
            return;
        }
    })
})