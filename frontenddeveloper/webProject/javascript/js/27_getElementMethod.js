window.onload = function(){
    let btn = document.getElementById("btn").addEventListener("click",()=>{
        let title = document.getElementById("title");
        title.className ="titleStyle";
        title.innerHTML ="\"Javascript\" 문자열로 변경"
    });

    document.getElementById("cover").addEventListener("mouseover",function(){
        this.setAttribute("src","images/2.jpg");
    });
    document.getElementById("cover").addEventListener("mouseout",function(){
        this.setAttribute("src","images/1.jpg");
    })

document.getElementById("colorBtn").addEventListener("click",()=>{
    let lists = document.querySelectorAll("#color li");
    lists.forEach(ele => {
        if(ele.className =="changeColor"){
            ele.classList.remove("changeColor");
        }else{
            ele.className ="changeColor";
        }
    });
})

document.getElementById("choice").addEventListener("click",()=>{
    let lists = document.querySelectorAll("#menu li");
    let str="";
    lists.forEach((ele,index) => {
        str += ele.innerHTML;
        if(index!=2){
            str += ", "
        }else{
            str += "가 메뉴에 있습니다. "
        }
    });
    document.getElementById("area").innerText = str;
})

/*
document.getElementById("choice").addEventListener("click",function(){
    let ul = document.getElementsByTagName("ul");
    let text ="";

    for(i=0; i<ul[1].getElementsByTagName("li").length;i++){
        text += ul[1].getElementsByTagName("li")[i].innerHTML;
        text += "&nbsp;&nbsp;"
    }
    document.getElementById("area").innerHTML = text;

});
*/
}