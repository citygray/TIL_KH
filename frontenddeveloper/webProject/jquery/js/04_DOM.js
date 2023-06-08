$(function(){
    $("td:eq(4)").css("background","#ffff00");
    $("td").eq(2).css("background","#ff0000");

    $("td:eq(4)").next().css("background-color","#00ff00");
    $("td:eq(4)").prev().css("background-color","blue");

    //현재요소의 부모요소 반환
    $("td:eq(4)").parent().css("color","#fff");
    $("td:eq(4)").parent().next().css("color","#ff0000");
    $("td:eq(4)").parent().prev().css("color","#0000ff");

    $("td:eq(4)").parent().next().children().css("text-decoration","underline");
    $("td:eq(4)").parent().next().children().eq(1).css("font-weight","bold");

    $(".item").on("click",function(){
        const src = $(this).find("a").text();
        $("#area").css("background-image","url("+src+")");
        
    })
})
