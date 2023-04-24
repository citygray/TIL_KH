package homework;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		/*
		  [요구사항]
			두 수를 입력 받아, 두 수 사이에 홀수의 합과 짝수의 합을 출력하는 프로그램을 작성하시오.
			수의 크기에 상관없이 수행 가능해야 한다.
		 */
		
		int num1,num2,temp,sumOdd=0,sumEval=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하시오");
		num1 = input.nextInt();
		System.out.println("첫번째 정수를 입력하시오");
		num2 = input.nextInt();
		//num1에 작은수, num2에 큰 수를 넣는다.
		
		if(num1>num2) {
			temp = num2;
			num2= num1;
			num1= temp;
		}
		System.out.println("작은수:"+num1+"큰수:"+num2);
		
		for(int i =num1;i<=num2;i++) {
			System.out.println(i);
			if(i%2==0) {
				sumEval += i;
			}else {sumOdd += i;}
		}
		
		System.out.println("짝수의 합은"+sumEval);
		System.out.println("홀수의 합은"+sumOdd);
		
		input.close();

	}

}
