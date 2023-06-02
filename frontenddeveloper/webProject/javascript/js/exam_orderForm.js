function numberCheck(){
    const pattern = /(^\d+$)/g;
    if(!pattern.test(this.value)){
        this.value ="";
        this.placeholder ='숫자만 가능';
    }
}
function calcRow(){
  
    // 부모 요소(tr) 가져오기
    // 해당 책의 가격 가져오기 - this의 형제
    // 가격과 수량 곱하기
    // 형제 중 합계 요소 찾기 
    // 합계 값대입
    let thisTd = this.parentNode;
    let price = thisTd.previousElementSibling.dataset.price;
    let thisTotalPriceTd = thisTd.nextElementSibling.firstChild;
 
    thisTotalPriceTd.value = price * this.value;
}

window.onload = function(){
     
    //수량 입력 keyup시 : 
    let qtys = document.querySelectorAll(".qty");
    qtys.forEach((ele)=>{  
        //숫자만 입력가능하게
        ele.addEventListener("keyup",numberCheck);
        //row 별 합계 구하기
        ele.addEventListener("keyup",calcRow);
    })


    //합계 계산 버튼 
    document.getElementById("btn_total").addEventListener("click",()=>{
        //수량 합 계산
        let qtys = document.querySelectorAll(".qty");
        let totalQty = 0;
        qtys.forEach((ele)=>{
            totalQty +=ele.value*1;
        })
        document.getElementById("total_qty").value = totalQty;
        
        
        //총액 계산
        let rowSum = document.querySelectorAll(".rowSum");
        let totalPrice = 0;
        rowSum.forEach((ele)=>{
            //console.log(ele.value);
            totalPrice +=ele.value*1;
        })
        document.getElementById("total_price").value = totalPrice;
    
    })
        
    
    //초기화 버튼
    document.getElementById("btn_reset").addEventListener("click",()=>{
        let inputs = document.querySelectorAll("#order_form input");
        inputs.forEach((ele)=>{
            ele.value ="";
        })
    })
}