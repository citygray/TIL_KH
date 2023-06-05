window.onload =  function(){
    let user ={
        name:'javascript',
        email:'javauser@naver.com',
        phone:'02-506-3536'
    }

    //stringfy(): JSON 객체를 string 으로 변환해준다.
    let userString = JSON.stringify(user);
    console.log(typeof(userString));
    document.getElementById("string").innerHTML = userString;

    let userJson ="";
    console.log(typeof(JSON.parse(userString)));

    //parse() : String 객체를 JSON으로 변환해준다.
    JSON.parse(userString, function(key,value){
        if(key!=""){
            userJson += key +" : "+value+"<br/>";
        }
    })
    document.getElementById("json").innerHTML = userJson;

}