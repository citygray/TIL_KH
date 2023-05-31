let time_id;
window.onload = function(){
    document.getElementById("btn1").addEventListener("click",()=>{
        setTimeout(function(){
            alert("setTimeout()을 사용하여 표시됩니다.")
        },3000);
    });

    document.getElementById("btn2").addEventListener("click",()=>{
        start_time();
    });

    document.getElementById("btn3").addEventListener("click",()=>{
        clearTimeout(time_id);
    });

    //각가 두개의 색상을 선택하여 글자색과 배경색이 변경되도록
    var target = document.querySelector("#target");
    var targetTxt = document.querySelector("#target p");

    //window.setInterval(함수, 지연시간(ms))
    //지연시간 마다 함수 실행

    let color_id;
    document.getElementById("btn4").addEventListener("click",()=>{
        color_id = setInterval(function(){
            let element = document.getElementById("target");
            element.style.color = (element.style.colr == "red")? "yellow":"green";
            element.style.backgroundColor = (element.style.backgroundColor == "green")? "yellow":"green";
        },1000);
        document.getElementById("btn4").setAttribute("disabled","disabled");
        document.getElementById("btn5").removeAttribute("disabled");
    });
    document.getElementById("btn5").addEventListener("click",()=>{
        clearInterval(color_id);
        document.getElementById("btn4").removeAttribute("disabled");
        document.getElementById("btn5").setAttribute("disabled","disabled");

    });

}

function start_time(){
    let now = new Date();
    document.querySelector("#result").value = now.toLocaleTimeString();
    time_id = setTimeout(start_time,1000);
}