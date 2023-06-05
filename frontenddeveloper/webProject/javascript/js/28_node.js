window.onload = function(){
    document.getElementById("createBtn").addEventListener("click",createNode);
    document.getElementById("subject").addEventListener("keypress",(e)=>{
       if(e.key == 'Enter'){
            e.preventDefault();
            createNode();
       }
        
    })
}

function createNode(){

    let subject = document.getElementById("subject");
    let itemList = document.getElementById("itemList");

    let newItem = document.createElement("li");
    let newText = document.createTextNode(subject.value);
    newItem.appendChild(newText);
  
    itemList.insertBefore(newItem,itemList.childNodes[0]);
    subject.value = "";

    var items = document.querySelectorAll("#itemList li");
        
    items.forEach(ele => {
        console.log(this.parentNode);
        ele.addEventListener("click",function(){
            //console.log(this.parentNode);
            if(this.parentNode)
                this.parentNode.removeChild(this);
        })
    });
}