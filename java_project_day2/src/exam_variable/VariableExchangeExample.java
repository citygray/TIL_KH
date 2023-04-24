package exam_variable;

import java.util.Scanner;

public class VariableExchangeExample {

	public static void main(String[] args) {
//		변수 2개를 선언하여 각각 변수에 값을 초기화하여 두수를 교환한 값을 출력하는 프로그램 작성
		
			/* 요구사항 수정
			 * 두 변수를 선언하고 사용자로 부터 값을 받아 교환하는 프로그램을 작성하시오
			 */
			int a,b,temp;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("첫번째 값을 입력하시요: ");
			a = input.nextInt();
			
			System.out.println("두번째 값을 입력하시요: ");
			b = input.nextInt();
			
			System.out.printf("교환전 a값은 %d, 교환전 b값은 %d\n",a,b);
			temp =a;
			a = b;
			b = temp;
			
			System.out.println("교환후----");
			System.out.println("a의 값은 "+ a);
			System.out.println("b의 값은 "+ b);
			System.out.println("temp "+temp);
			
			input.close();

			// 요구사항
			//2개의 수 a, b를 읽어서 변수 a에 기억된 값을 1 증가시키고, 변수 b에 기억된 값은 1 감소시켜서 출력하는 프로그램을 작성하시오.
			
			System.out.printf("1 증가된 a값 : %d\n",++a);
			System.out.printf("1 감소된 b값 : %d\n",--b);

	}

}
