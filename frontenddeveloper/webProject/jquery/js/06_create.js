let number = 1;
$(function(){
    //$("button:eq(0)").click(function(){
    $("button:eq(0)").on("click",function(){
        //새로운 요소의 생성
        let li1 = $("<li>").css("color","red").html("추가항목"+(number++));
        li1.addClass("liFirst");
        let li2 = $("<li>").css("color","green").html("추가항목"+(number++));
        let li3 = $("<li>").css("color","blue").html("추가항목"+(number++));

           //새로 생성된 요소에 대한 이벤트 추가
        li1.click(function(){
            $(this).remove();
        });
        li2.click(function(){
            $(this).remove();
        });
        li3.click(function(){
            $(this).remove();
        });

        $("ul").append(li1);
        $("ul").append(li2);
        $("ul").append(li3);

    });

    $("button:eq(1)").click(function(){
        $("ul").empty();
    });

    $("#print").on("click",function(){
        let img = $("<img>").attr("src","images/page1.jpg").addClass("new_img");

        let button = $("<button>").text("이미지 삭제").addClass("btn_remove").on("click",function(){
            //console.log("click 이벤트 add")
            $(".new_img").remove();
            $(this).remove();
        });
        $("#result").append(img).append(button);
        
    })
})