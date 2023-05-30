window.onload = function(){
    document.getElementById("btn1").addEventListener("click",function(){
        const str1 = "Hello World";

        console.log(str1.indexOf("e"));
        console.log(str1.indexOf("l"));
        console.log(str1.indexOf("가"));
        console.log(str1.lastIndexOf("l"));

        const str2 = "abcdefg";

        console.log(str2.substring(0,3));
        console.log(str2.substring(2,6));

        const urlData = "http://www.hanbit.co.kr/book/bookmain.html";
        console.log("urlData 변수 선언 초기값: "+urlData);

        //파일명 얻기
        let arrayUrl = urlData.split("/");
        console.log(arrayUrl[arrayUrl.length-1]);

        arrayUrl = arrayUrl[arrayUrl.length-1].split(".");

        console.log("파일명: "+ arrayUrl[0]);
        console.log("확장자: "+ arrayUrl[1]);

        //문자열 대체
        const data = "Hong's number is 123-4567";
        // console.log("데이터 원본 : "=ㅇㅁㅅㅁ)

        
        


    })

    document.getElementById("btn2").addEventListener("click",function(){
        console.log(Math.round(10.7));
        console.log(Math.ceil(10.1));
    })

    document.getElementById("btn3").addEventListener("click",function(){
        console.log(parseInt("1.234"));
        console.log(parseFloat("1.234"));
        console.log(Number("100"));
    })

    document.write("<h3>빈 배열 생성</h3>")
    let myArray1 = [];

    for(let i =0;i<10;i++){
        myArray1.push(i);
    }

    for(let i=0;i<10;i++){
        document.write(myArray1[i]+" ");
    }

    document.write("<br/>")

    document.write("<h3>sort()메서드로 출력</h3>");
    let myArray2 = [10,7,23,99,169,19,11,1];

    myArray2.sort(function(a,b){return a-b});
    document.write("<p>오름차순: "+ myArray2 +"</p>");

    myArray2.reverse(function(a,b){return a-b});
    document.write("<p>내림차순: "+ myArray2 +"</p>");

    //출력함수 생성
    function print_array(a,name){
        document.write("Size of array: "+a.length+"<br>");
        for(i=0;i<a.length;i++){
            document.write(name +"["+i+"]: ");
            if(typeof(a[i])=="string")
                document.write("\""+a[i]+"\"<br/>");
            else
                document.write(a[i]+" </br>");
        }
        document.write("<br/>");
    }

    let array = new Array("one",2,"3",4,"five");
    array[6] = 6;
    array[7] = "seven";
    array[9] = "3+6";

    document.write("array 배열 출력");
    print_array(array,"array");



}