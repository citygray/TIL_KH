function prinTel(){
    let tel = "010-1234-3245".split("-");
    document.getElementById("phone1").value = tel[0];
    document.getElementById("phone2").value = tel[1];
    document.getElementById("phone3").value = tel[2];
}