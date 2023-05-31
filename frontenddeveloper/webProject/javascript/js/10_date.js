window.onload = function(){
    let div = document.getElementById("area");
    let timearea = document.getElementById("timeArea");
    
    //Date 객체의 생성
    let mydate = new Date();

    //년,월,일,시간,분,초를 리턴받기
    let yy = mydate.getFullYear();
    let mm = mydate.getFullYear();
    let dd = mydate.getDate();

    //요일의 이름을 저장하고 있는 배열의 생성
    let days = ["일","월","화","수","목","금","토"];
    let i = mydate.getDay();
    let day = days[i];

    let hh = mydate.getHours();
    let mi = mydate.getMinutes();
    let ss = mydate.getSeconds();

    let result ="오늘은 " +yy+"년 "+mm+"월 "+ dd +"일 " + day+"요일 입니다.";
    result += "현재 시간은 "+ hh +"시 "+mi+"분 "+ss+"초 입니다.";
    div.innerHTML = "<h1>현재 날짜와 시간 출력</h1>";
    div.innerHTML += "<h3>"+ result +"</h3>";

    div.innerHTML += "<h1>toXXXString() 메서드 예제</h1>";
    div.innerHTML += "<h3>"+ mydate.toLocaleDateString()  +"</h3>"
    div.innerHTML += "<h3>"+ mydate.toLocaleTimeString()  +"</h3>"
    div.innerHTML += "<h3>"+ mydate.toLocaleString()  +"</h3>"

    document.querySelector("#btn").addEventListener("click",()=>{
        startTime();
    })

}

function startTime(){
    let now = new Date();
    let result = now.toLocaleString();
    document.getElementById("timeArea").innerHTML = result;
    window.setTimeout(startTime,1000);
}

