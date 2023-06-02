  // 간단한 계산기 객체생성(Calc 빈 객체로 선언)
        // - 두개의 숫자를 입력 받을 수 있는 멤버변수 추가
        // - 덧셈,뺄셈 결과를 리턴해 줄 수 있도록 메서드 생성
        // - 연산의 결과 출력하는 메서드 생성

// 객체 리터럴 객체 생성
/*
let Cals = {
    num1 : 0,
    num2 : 0,

    setValue : function(num1,num2){
        this.num1 = num1*1;
        this.num2 = num2*1;

    },
    plus : function(){
        return this.num1 + this.num2;
    },
    minus : function(){
        return this.num1 - this.num2;
    },
    result :  function(oper,area){
        let value = 0;
        console.log("oper="+oper);

        switch(oper){
            case "+" : value = this.plus(); break;
            case "-" : value = this.minus(); break;
        }
        area.innerHTML = value;
    }

};
*/


//ES6 class
class Cals{
    constructor(num1,num2){
        this._num1 = num1*1;
        this._num2 = num2*1;
    }
    get plus(){
        return this._num1 + this._num2;
    }
    get minus(){
        return this._num1 +-this._num2;
    }
    result(oper,area){
        let value = 0;
        console.log("oper="+oper);

        switch(oper){
            case "+" : value = this.plus; break;
            case "-" : value = this.minus; break;
        }
        area.innerHTML = value;
    }
}