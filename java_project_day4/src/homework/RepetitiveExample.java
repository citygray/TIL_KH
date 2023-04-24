package homework;

import java.util.Scanner;

public class RepetitiveExample {

	public static void main(String[] args) {

		/*[실행 예]

			연산자를 1~4으로, 종료는 5를 선택해 주세요.

			1. +

			2. -

			3. *

			4. /

			5. 종료

			선택>> 

			1

			사칙연산을 할 두 수를 입력하세요 : 1 4

			1 + 4 = 5

			1. +

			2. -

			3. *

			4. /

			5. 종료

			선택>> 

			9

			1~5 사이의 숫자를 입력해주세요.

			1. +

			2. -

			3. *

			4. /

			5. 종료

			선택>> 

			5

			프로그램을 종료합니다.

​
		 */
		/*
		 * [요구사항]

			메뉴에 있는 연산자를 선택하고 피연산자 두 개를 입력받아 사칙연산을 하는 프로그램의 코드를 작성하여라.

			​

			[조건]

			① 메뉴에서 1~5사이가 아니면 다시 입력

			② 종료가 선택될 때까지 반복

			③ 나눗셈의 결과는 소수 첫번째 자리까지로 표현
		 */	

		Scanner input = new Scanner(System.in);
		
		int num1,num2;
		System.out.println("첫번째 숫자를 입력하세요");
		num1 = input.nextInt();

		System.out.println("두번째 숫자를 입력하세요");
		num2 = input.nextInt();
		
		
		int oper;
		do {
			System.out.print("[메뉴]\n 1. +\n 2. -\n 3. *\n 4. / \n 5. 종료\n");	
			System.out.println("연산자를 1~4으로, 종료는 5를 선택해 주세요.");
			oper = input.nextInt();
			if(oper==5) { 
				System.out.println("종료합니다.");
				break;
			};
		}while(oper<1||5<oper);

		
		int result = 0;
		char chOper = ' ';

		switch(oper) {
		case 1:
			result = num1 + num2;
			chOper ='+';
			break;
		case 2:
			result = num1 - num2;	
			chOper ='-';
			break;
		case 3:
			result = num1 * num2;
			chOper ='*';
			break;
		case 4:
			if(num2==0) {
				System.out.println("나누기의 분자는 0일 수 없습니다.");
				break;
			}
			result = num1 / num2;
			chOper ='/';
			break;
		}


		System.out.printf("%d%c%d = %d",num1,chOper,num2,result);

		


		input.close();



	}

}
