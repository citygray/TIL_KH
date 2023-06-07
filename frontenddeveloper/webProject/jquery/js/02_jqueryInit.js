let number = 1;

$(document).ready(function(){
    $("#colorChange").on("click",function(){
        $(".three").css("background-color","black").css("color","red").css("font-size","20px")
    })
    $("#btnChange").on("click",function(){
        $("#hello").html("글자 바꾸기");
    })
    $("#img1").hover(function(){
        $(this).attr("src","../javascript/images/2.jpg")
    },function(){
        $(this).attr("src","../javascript/images/1.jpg")
    })

    const regExp =  /^[a-z][a-zA-Z0-9]{7,19}$/; 
    $("#input1").on("keyup",function(){
        if(regExp.test( $("#input1").val() )){
            $("#span1").text("유효한 문자열 형식입니다.");
            $("#span1").css("color","green");
        }else{
            $("#span1").text("유효한 문자열이 아닙니다.").css("color","red");
            //$("#input1").val("");
        }

        if( $("#input1").val().length == 0){
            $("#span").text("");
        }

    })

    $("#singleButton").on("click",function(){
        $(this).text("변경된 문자");
        //$("#singleButton").text("변경된 문자");
    })

    $(".multiButton").on("click",function(){
        let index = $(this).index();
        let result = index + "번째 요소 클릭"
        $(this).html(result);
    })

    $("#treeImage").on("click",function(){
        number = (number%6)+1;
        console.log(number);
        $(this).attr("src","../javascript/images/tree-"+number+".jpg");
    })

    

    
});