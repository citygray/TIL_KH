window.onload = function(){
    document.getElementById("form1").addEventListener("submit",(evnet)=>{
        evnet.preventDefault();
        doSubmit();
    })
}

function doSubmit(){
    //폼객체
    const frm  = document.form1;

    //공백제어 안됨
    /*
    if(frm.user_name.value==""){
        alert("이름을 입력해주세요.");
        //frm.user_name.value="";
        frm.user_name.focus();
        return false;
    }
    */
    

    //text요소의 입력여부 검사
    if(frm.user_name.value.replace(/\s/g,"")==""){
        alert("이름을 입력해주세요.");
        frm.user_name.value ="";
        frm.user_name.focus();
        return false;
    }

    //라디오 버튼의 입력여부 검사.
    if(!frm.gender[0].checked && !frm.gender[1].checked){
        alert("성별을 선택해 주세요.");
        frm.job.focus();
        return false;
    }

    //체크박스의 선택여부 검사
    //console.log(frm.hobby[0].value)
    let chk = false;
    for(let i = 0; i<frm.hobby.length;i++){
        if(frm.hobby[i].checked){
            chk = true;
            break;
        }
    }

    if(!chk){
        alert("취미를 선택해 주세요");
        frm.hobby[0].focus();
        return false;
    }

    let str = inputData(frm);
    str += "\n\n 입력하신 내용이 맞습니까?\n[취소를 누르면 모든 데이터가 없어집니다.]";
    //입력확인하기
    if(confirm(str)){
        return false;
    }else{
        frm.reset(); //데이터 삭제
        return false;
    }

}


function inputData(frm){
    let result ="▶ 이름 : "+ frm.user_name.value;
    let user_gender;
    for(let i =0;i<frm.gender.length;i++){
        if(frm.gender[i].checked){
            user_gender = frm.gender[i].value;
        }
    }
    result +="\n▶ 성별 : "+ frm.user_gender;
    result +="\n▶ 직업 : "+ frm.job.value;

    let hby ="";
    for(let i =0;i<frm.hobby.length;i++){
        if(frm.hobby[i].checked){
            hby += frm.hobby[i].value+" ";
        }
    }
    result +="\n▶ 취미 : "+ hby;

    return result;
       
}