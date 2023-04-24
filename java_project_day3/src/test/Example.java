package test;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		/*
		 * 요구사항
		 * 국어,영어, 수학 점수를 입력 받아, 총점과 평균(소숫점 첫번째 자리)을 구해 출력하는 프로그램을 작성하시요 
		 * */
		
		int kor,eng,math,sum;
		double avg;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하시오");
		kor = input.nextInt();
		System.out.println("영어점수를 입력하시오");
		eng = input.nextInt();
		System.out.println("수학점수를 입력하시오");
		math = input.nextInt();
		
		sum = kor + eng + math;
		avg = (double)sum/3;
		
		System.out.println(sum);
		System.out.printf("평균은 %.1f",avg);
		
		input.close();
		
	}
}
