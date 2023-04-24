package exam_loop;

import java.util.Scanner;

public class whileExample3 {

	public static void main(String[] args) {
		
		
		/*
		 * 사용자로 하여금 점수를 입력 받아 학점을 출력하는 프로그램을 작성해주세요
		 * 90~100 A
		 * 80~89  B
		 * 70~79  C
		 * 60~69  D
		 * 59이하  F
		 * 
		 * 작성완료 후 점수가  0~100사이로 입력하지 않았다면 "점수는 0과 100사이로 입력해주세요" 출력 
		 * */
		
		int score = 0;
		char grade='\0';
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("점수를 입력해주세요");
			score = input.nextInt();
		}while(score<0 || 100 <score);
		
		
		if( 90 <= score ) {
			grade = 'A';
		}else if( 80 <= score ) {
			grade = 'B';
		}else if( 70 <= score ) {
			grade = 'C';
		}else if( 60 <= score ) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println("학점은 "+ grade);

		input.close();
		
	}

}
