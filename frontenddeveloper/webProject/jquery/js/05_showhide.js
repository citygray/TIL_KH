$(function(){

    //show() / hide() / toggle()
    $("#sh>input:eq(0)").click(function(){
        $("#sh>div").show();
    });
    $("#sh>input:eq(1)").click(function(){
        $("#sh>div").hide();
    });
    // $("#sh>input:eq(2)").click(function(){
    //     $("#sh>div").toggle(2000);
    // })

    $("#sh>input:eq(2)").on("click",function(){
        $("#sh>div").toggle(2000);
    })

    //fade() / faceOut() / fadeToggle()
    $("#fade>input:eq(0)").click(function(){
        $("#fade>div").fadeIn(2000);
    });
    $("#fade>input:eq(1)").click(function(){
        $("#fade>div").fadeOut(2000);
    });
    $("#fade>input:eq(2)").click(function(){
        $("#fade>div").fadeToggle(2000);
    })

    //slideDown() /slideUp() / slideToggle()
    $("#slide>input:eq(0)").click(function(){
        $("#slide>div").slideDown(2000);
    });
    $("#slide>input:eq(1)").click(function(){
        $("#slide>div").slideUp(2000);
    });
    $("#slide>input:eq(2)").click(function(){
        $("#slide>div").slideToggle(2000);
    })

});