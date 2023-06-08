function uncomma(str){
    return str.replace(/[^\d]+/g,''); //숫자가 아닌것 빈값 처리
}


function update(){
    //총 수량 구하기
    let totalNumber = 0;

    //속성선택자 : input[type='number'] input태그의 속성 중에 type="number"인 대상만.
    let number = document.querySelectorAll("input[type='number']");
    for(let i=0;i<number.length;i++){
        totalNumber += parseInt(number[i].value);
    }
    document.getElementById("totalNumber").value = totalNumber;

    //총합계 구하기
    let totalPrice = 0;
    //속성선택자 : input[name$='Total'] input태그의 속성 중에 name='~Total'로 끝나는 대상만
    let price = document.querySelectorAll("input[name$='Total]");
    for(let i=0; i<price.length;i++){
        totalPrice += parseInt(price[i].value);
    }
    document.getElementById("totalPrice").value = totalPrice;
}

window.onload = function(){
    document.getElementById("btn").addEventListener("click",update);

    let input = document.querySelectorAll("input[type='number']")
    input.forEach((target) => {target.addEventListener("blur",function(event){
        const id= event.target.id;
        
        const price = id.replace("Number","Price");
        const total = id.replace("Number","Total");
        
        // console.log("id: "+id);
        // console.log("price: "+price);
        // console.log("total: "+total);

        document.getElementById(total).value = uncomma(document.getElementById(price).innerHTML) * parseInt(this.value);
        
    })
        
    });
}    


    