window.onload = function(){
    document.getElementById("btn").addEventListener("click",()=>{
        let tableArea = document.getElementById("table_area");
        tableArea.innerHTML="";     

        let row = document.getElementById("row").value;
        let column = document.getElementById("column").value;
        //input 빈값 체크       
        if(row=="" || column==""){
            tableArea.innerHTML="행과 열의 갯수를 입력해주세요";  
        }
        let newTable = document.createElement("table");
        for(i=0;i<row;i++){
            let newTr = document.createElement("tr");
            for(j=0;j<column;j++){
                let newTd = document.createElement("td");
                let newText = document.createTextNode(i+","+j);
                newTd.appendChild(newText);
                newTr.appendChild(newTd);
            }
            newTable.appendChild(newTr);
        }
        tableArea.appendChild(newTable);
    })

    let inputs = document.querySelectorAll("input");

    //input 검사
    inputs.forEach(ele => {
        ele.addEventListener("keyup",function(){

            if(this.value.match(/\d+/g) ==null){
                this.value="";
                this.setAttribute("placeholder","숫자만");
            }
        })
    });
}

