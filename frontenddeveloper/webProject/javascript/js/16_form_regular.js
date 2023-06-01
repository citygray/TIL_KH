window.onload = function(){

    document.getElementById("btn1").addEventListener("click",function(){
        const div1 = document.getElementById("div1");
        div1.innerHTML = ""; //내용 모두 삭제

        //a(일반문자열) : 문자열 내에 a라는 문자열이 존재하는지 검색
        const regExp1 = /a/;
        div1.innerHTML += "/a/,apple:" + regExp1.test("apple") + "<hr>";
        div1.innerHTML += "/a/,price:" + regExp1.test("price") + "<hr>";

        //[a,b,c] : 문자열 내에 a,b,c,d 중 하나라도 일치하는 문자가 있는지 검색
        let regExp2 = /[abcd]/;
        div1.innerHTML += "/[abcd]/ , apple" + regExp2.test("apple") +"<hr>"; 
        div1.innerHTML += "/[abcd]/ , sub" + regExp2.test("sub") +"<hr>"; 
        div1.innerHTML += "/[abcd]/ , qwert" + regExp2.test("qwert") +"<hr>"; 
        regExp2 = /[^abcd]/;
        div1.innerHTML += "/[^abcd]/ , html" + regExp2.test("html") +"<hr>"; 

        //^(캐럿) : 문자열의 시작을 의미
        const regExp3 = /^group/; //문자열의 시작이 "group"인지 확인
        div1.innerHTML += "/^group/, group100 : " +regExp3.test("group100") +"<hr>";
        div1.innerHTML += "/^group/, 100group : " +regExp3.test("100group") +"<hr>";

        //$ : 문자열의 끝을 의미
        const regExp4 =  /group$/; 
        div1.innerHTML += "/group$/, group100 : " +regExp4.test("group100") +"<hr>";
        div1.innerHTML += "/group$/, 100group : " +regExp4.test("100group") +"<hr>";

    })

    document.getElementById("inputName").addEventListener("keyup",function(){
        //결과 출력용 span
        const span = document.getElementById("inputNameResult");

        //한글 2~5글자
        let regExp =  /^[가-힣]{2,5}$/; 
        if(regExp.test(this.value)){
            span.innerText ="유효한 이름 형식입니다.";
            span.style.color="green";
            span.style.fontWeight ="bold";
        }else{
            span.innerText ="이름 형식이 유효하지 않습니다.";
            span.style.color="red";
            span.style.fontWeight ="bold";
        }
        // 빈칸인지 검사
        // 빈칸이면 span에 작성된 내용 초기화
        if(this.value.length == 0){
            span.innerText = "";
        }
    })

    document.getElementById("inputPno").addEventListener("keyup",function(){
        const span = document.getElementById("inputPnoResult");

        //주민등록번호 
        
    })

    document.getElementById("idCheck").addEventListener("click",function(){
        let mid = document.getElementById("mid");
        //전체길이 5~8
        //아이디 첫글자 영문자로, 나머지는 숫자와 영문자만
        let regExp =  /^[a-zA-Z][0-9a-zA-Z]{4,7}/; 
        if(regExp.test(mid.value)){
            alert("유효한 아이디 입니다.")
        }else{
            alert("유효한 아이디가 아닙니다.")
        }
        
    })

    document.getElementById("nameCheck").addEventListener("click",function(){
        //값이 입력되지 않았을때 값(이름)을 입력
        if(document.getElementById("user_name").value.replace(/\s/g,"")==""){
            document.getElementById("msg").innerHTML ="이름을 입력해주세요.";
            document.getElementById("msg").style.color ="red";
            document.getElementById("user_name").value ="";
        }
  
    })

    document.getElementById("user_name").addEventListener("focus",function(){
        document.getElementById("msg").innerHTML ="";
    })

}