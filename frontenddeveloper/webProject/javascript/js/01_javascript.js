function btnClick2(){
    alert("외부 알림창 출력");
}

//confirm확인
function fnConfirm(){
    const confirmBtn = document.getElementById("confirmBtn");
    if(confirm("버튼 배경색을 오렌지색으로 바꾸시겠습니까?")){
        confirmBtn.style.backgroundColor ="orange";
    }else{
        confirmBtn.style.backgroundColor ="green";
    }
}

function fnPrompt1(){
    txt = prompt();
    const area2 = document.getElementById("area2");
    area2.innerText = txt;
}

function fnInput(){
    const id = document.getElementById("userId").value;
    const pw = document.getElementById("userPwd").value;
    const result = document.getElementById("result");

    if(id != "" && pw != ""){
        result.value = "id: "+id+" ,pw:"+pw;
    }else{
        result.value ="다시 확인해주세요";
    }

    id.value ="";
    pw.value ="";
}

function fnChange(){
    const input1 = document.getElementById("input1");
    const input2 = document.getElementById("input2");
    const temp = input2.value;
    input2.value = input1.value;
    input1.value = temp;
}