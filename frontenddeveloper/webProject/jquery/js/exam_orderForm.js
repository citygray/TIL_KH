function uncomma(str){
    return str.replace(/[^\d]+/g,'');
}

$(function(){
    //수량이 입력되면 해당 합계가 구해진다.
    $(".qty").on("blur",function(){
        let total = uncomma($(this).parent().prev().html()) * parseInt($(this).val());
        $(this).parents("tr").find(".bookTotal").val(total);
    })

    //합계계산이 클릭되면 수량의 합과 가격 합계가 계산된다.
    $("#btn_total").on("click",update);
})

function update(){
    
    //수량 합계
    let totalQty = 0;
    $(".qty").each(function(){
        totalQty += $(this).val()*1;
    })
    $("#total_qty").val(totalQty);

    //금액 합계
    let totalPrice = 0;
    $(".bookTotal").each(function(){
        totalPrice += $(this).val()*1;
    })
    $("#total_price").val(totalPrice);
    
}