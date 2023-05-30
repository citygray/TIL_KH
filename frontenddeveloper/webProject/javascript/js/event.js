window.onload = function(){
    document.getElementById("btn_open").onclick = function(){
        document.querySelector("#desc").style.display = "block"
    }
    
    document.getElementById("btn_close").onclick = function(){
        document.querySelector("#desc").style.display = "none"
    }
    /*
    document.getElementById("test").onclick = function(){
        console.log("너비: "+ this.clientWidth);
        this.style.width = this.clientWidth +20 +"px";
    }
    */
    document.getElementById("test").addEventListener("click",function(){
        console.log(this.clientWidth);
        this.style.width = this.clientWidth + 20 +"px";
    })
    
    document.getElementById("test").addEventListener("click",function(){
        this.style.height = this.clientHeight + 20+ "px";
    })
}


