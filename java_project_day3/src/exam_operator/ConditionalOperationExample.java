package exam_operator;

import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		
		System.out.println("두 수(100과 200) 중에서 최대값 :"+((x>y)?x:y));
		System.out.println("두 수(100과 200) 중에서 최대값 :"+ Math.max(x, y));
		
		//임의의 수를 가진 변수를 선언하고 그 값이 짝수인지 홀수인지를 출력 할 수 있도록 작성해 주세요
		//예를 들어 "4는 짝수 입니다"
		
		int num;
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		num = input.nextInt();
		
		System.out.print(num + "은 ");
		System.out.print((num % 2 == 0)?"짝수":"홀수");
		System.out.println("입니다.");
		
		//두 수의 차를 출력해 주세요, 단 큰수에서 작은 수를 빼서 결과 출력
		int num1,num2;
		System.out.println("첫번째 수를 입력해주세요");
		num1 = input.nextInt();
		System.out.println("두번째 수를 입력해주세요");
		num2 = input.nextInt();
		
		System.out.print("두 수의 차는 ");
		System.out.print((num1 > num2)? (num1 - num2) : (num2 - num1));
		System.out.println("입니다.");
		
		input.close();
		
	}

}
