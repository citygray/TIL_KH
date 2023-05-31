window.onload = function(){
    let image = document.querySelectorAll(".imageChoice");
    image.forEach((target) => target.addEventListener("click",function(){
        console.log("확인");
        let image = document.getElementById("target");
        image.src = this.src;
    }));

    var indexNum = 1;
    let element = document.getElementById("imgView");
    setInterval(function(){
        indexNum++;
        if(indexNum==4) indexNum=1;
        element.src = "images/"+indexNum+".jpg";
    },1000);
}