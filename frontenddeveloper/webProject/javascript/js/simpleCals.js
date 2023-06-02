function numberCheck(){
    const pattern = /(^\d+$)/g;
    let resultArea = document.getElementById("resultArea");

    if(!pattern.test(this.value)){
        resultArea.innerText ='숫자만 가능';
    }

    if(this.value.length ==0){
        console.log("?");
        resultArea.innerText ="?"
    }
}

window.onload = function(){
    number1.addEventListener("keyup",numberCheck);
    number2.addEventListener("keyup",numberCheck);


    document.getElementById("resultArea").addEventListener("mouseover",()=>{
        // 객체 리터럴 객체 생성시 
        /*
        Cals.setValue(number1.value,number2.value);
        Cals.result(op.value,resultArea);
        */
        //ES6 class 활용시
        let cal = new Cals(number1.value,number2.value);
        cal.result(op.value,resultArea);
    })

    document.getElementById("resultArea").addEventListener("mouseout",()=>{
        form.reset();
        document.getElementById("resultArea").innerHTML = "?";
    })
    
}