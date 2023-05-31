window.onload = function(){
    document.getElementById("btn1").addEventListener("click",()=>{
        if(confirm("정말 네이버로 이동하시겠습니까?")){
            location.href = "http://www.naver.com";
        }
    })

    document.getElementById("btn2").addEventListener("click",()=>{
        location.href = "10_day_result.html";
    })

    var totalNum="";
        
    for(var i=0;i<5;i++){
        var ranNum = Math.round(Math.random() *9);
        totalNum += (ranNum + "");
    }
    
    const result = document.querySelector("#result");
    result.innerHTML = totalNum;
    
    document.getElementById("btn4").addEventListener("click",()=>{
        location.reload();
    });

}