window.onload = function(){
    let list =  document.querySelectorAll("li");
    list.forEach(ele => {
        ele.addEventListener("click",function(){
            if(this.className =="checked"){
                this.classList.remove("checked");
            }else{
                this.classList.add("checked");
            }
        });
    });
}