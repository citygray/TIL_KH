window.onload = function(){

    var now = new Date();
    var firstDay = new Date("2020-10-01");

    var toNow = now.getTime();
    var toFirst = firstDay.getTime();
    var passedTime = toNow - toFirst;

    passedTime = Math.round(passedTime/(1000*60*60*24));

    console.log(passedTime);
    document.querySelector("#result").innerText = passedTime;
}