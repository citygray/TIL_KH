function open1(){
    window.open('open.html');
}

function open2(){
    window.open('open.html','','width=450,height=380,resizable=no');
}

function open3(url){
    window.open(url,'mywin','width=800,height=580,scrollbar=no,toolbar=no,menubar=no,status=no,location=no');
}

function open_window(){
    let win;
    let url = propt("원하는 URL 주소를 입력하시오");
    if(url!=""){
        window.open(url,'mywin','width=800,height=580,scrollbar=no,toolbar=no,menubar=no,status=no,location=no');
        if(win == null){
            alert("팝업이 차단되어있습니다. 팝업 차단을 해제해 주세요")
        }
    }
}