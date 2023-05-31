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



let numbers = new Array(1,2,3,5,40);

//요소추가 - 새로운 lenght 값 반환
document.write("<h3>요소추가 - push/unshift</h3>");
const len1 = numbers.push(60,70);

document.write("length : "+ len1 + " | 배열 : "+ numbers);
document.write("<br/>");
const len2 = numbers.unshift(0);
document.write("length : "+ len2 + " | 배열 : "+ numbers);
document.write("<br/>");

//요소 추출 - 꺼낸 요소 반환
document.write("<h3>요소 추출 -pop/shift</h3>");
const chars = ["a","b","c","d"];
let elm1 = chars.pop();//마지막 요소 꺼냄
document.write("꺼낸요소 : "+ elm1 + "| 배열: "+ chars);
document.write("<br/>");

const elm2 = chars.shift();//첫번째 요소 꺼냄
document.write("꺼낸요소 : "+ elm2 + "| 배열: "+ chars);
document.write("<br/>");

document.write("<h3>splice 메서드 사용하기</h3>")
//인수가 1개 일 경우
const number = [1,2,3,4,5];
const newNumber = number.splice(2);
document.write("반환된 배열: "+ newNumber+"<br/>");
document.write("변경된 배열: "+ number+"<br/>");
document.write("<br/>");

//인수가 2개일 경우
const study = ["html","css","web","jquery"];
const newStudy = study.splice(2,1);
document.write("반환된 배열: "+ newStudy+"<br/>");
document.write("변경된 배열: "+ study+"<br/>");
document.write("<br/>");

//인수가 3개일 경우
const newStudy2 = study.splice(2,1,"js");
document.write("명령: study.splice(2,1,\"js\")<br/>");
document.write("반환된 배열: "+ newStudy2+"<br/>");
document.write("변경된 배열: "+ study+"<br/>");
document.write("<br/>");

document.write("<h3>slice 메서드 사용하기</h3>");
// 추출한 요소로 배열 만듬, 기존 배열 변경안됨
let colors = ["red","green","blue","white","black"];
document.write("기존된 배열: "+ colors+"<br/>");
let colors2 = colors.slice(2); //인덱스 2부터 끝까지
document.write("명령: colors.slice(2)<br/>");
document.write("반환된 배열: "+ colors2+"<br/>");
document.write("변경된 배열: "+ colors+"<br/>");
document.write("<br/>");

let color3 = colors.slice(2,4);
document.write("명령: colors.slice(2,4)<br/>");
document.write("반환된 배열: "+ color3+"<br/>");
document.write("변경된 배열: "+ colors+"<br/>");
document.write("<br/>");

const array4 = new Array(1,2,3,4,5);
function isBigArray(element){
    return (element>=3);
}

const resultData = array4.filter(isBigArray);
document.write(resultData.join());
document.write("<br>");



}