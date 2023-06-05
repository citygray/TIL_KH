
    let sayHello = {
        "name":"javascript",
        "eng" : function(){
            let console = document.getElementById("console");
            console.innerHTML ="Hello "+this.name;
            console.style.color ='#ff0000';
        },
        "kor": function(){
            let console = document.getElementById("console");
            console.innerHTML = "안녕하세요. "+this.name;
            console.style.color = "#0000ff";
        }
    }
