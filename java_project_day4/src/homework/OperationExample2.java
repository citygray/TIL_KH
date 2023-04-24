package homework;

import java.util.Scanner;

public class OperationExample2 {

	public static void main(String[] args) {
		/*
		 * 간단한 계산기 프로그램을 작성하여 보자
		 * 
		 * 사용자로 부터 2개의 숫자(정수)를 입력받는다
		 * 사용자로 부터 연산자(+,-,*,/) 연산자를 입력받는다.
		 * 나눗셈의 경우, 분모가 0이 아닌지 먼저 검사하여야한다.
		 * 결과값은 소숫점 2째 자리까지 표기
		 * */
		
		int num1,num2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		num1 = input.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요");
		num2 = input.nextInt();
		
		char ch;
		int result = 0;
				
		do {
			System.out.println("한 문자를 입력하세요");
			ch = input.next().charAt(0);
			if(ch=='/'&&num1==0) {
				System.out.println("나누기의 분모는 0일 수 없습니다.");
			}
		}while(!(ch == '+' ||ch == '-'||ch == '*'||ch == '/'));
		
		switch(ch) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;	
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
		}
		
		
		System.out.printf("%d%c%d = %d",num1,ch,num2,result);
		
		input.close();
		
	}

}
