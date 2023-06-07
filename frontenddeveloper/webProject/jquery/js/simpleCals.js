function numberCheck(){
    const pattern = /(^\d+$)/g;
    if(!pattern.test($(this).val())){
        $("#resultArea").text("숫자만 가능")
    }
    if($(this).val().length==0){
        console.log("?");
        $("#resultArea").text("?")
    }
}
$(function(){

    /*
    $("#number1").on("keyup",numberCheck);
    $("#number2").on("keyup",numberCheck);

    $("#resultArea").hover(function(){
        let num1 = $("#number1").val()*1;
        let num2 = $("#number2").val()*1;
        let op = $("#op").val();      
        
        let result;
        
        switch(op){
            case "+" : result = num1+num2; break;
            case "-" : result = num1-num2; break;
        }
        $(this).text(result);
        
    },function(){
        $(this).text("?");
    })
    */

    $("#operation").click(function(){
        const number1 = $("#number1").val();
        if(number1.replace(/\s/g,"")==""||isNaN(number1)){
            alert("숫자를 입력해 주세요");
            $("#number1").val("");
            $("#number1").focus("");
            return;
        }

        const number2 = $("#number2").val();
        let result;
        if(number2.replace(/\s/g,"")==""||isNaN(number2)){
            alert("숫자를 입력해 주세요");
            $("#number2").val("");
            $("#number2").focus("");
            return;
        }

        let op = $("#op> option:selected").val();
        switch(op){
            case "+" : result = parseInt(number1)+parseInt(number2); break;
            case "-" : result = parseInt(number1)-parseInt(number2); break;
        }
        $("#resultArea").text(result);
    })
});