package exam_class_basic;

import java.util.Scanner;

public class ScoreTest {
	public static Scanner input = new Scanner(System.in);
	public static void inputData(Score sc) {
		System.out.print("이름 입력: ");
		sc.name = input.next();
		
		System.out.print("국어점수 입력: ");
		sc.kor = input.nextInt();
		
		System.out.print("영어점수 입력: ");
		sc.eng = input.nextInt();
		
		System.out.print("수학점수 입력: ");
		sc.math = input.nextInt();
		
		System.out.println();
		
	}
	public static void main(String[] args) {
		/*
		 * 성적을 출력하는 Score클래스를 정의하자
		 * 이름/국어/영어/수학/총점을 저장하고자 한다.(필드구현)
		 * 필드에 값을 설정할 수 있는 기능, 점수들의 합을 구하는 기능, 평균을 구하는 기능, 학점을 구하는 기능,
		 * 모든 필드를 출력할 수 있는 기능을 포함하도록 한다.(메서드 구현)
		 */

		
		Score score1 = new Score();
		inputData(score1);
		score1.getSum();
		
		Score score2 = new Score();
		inputData(score2);
		score2.getSum();
		
		System.out.println("==================================================");
		System.out.println("이름     국어     영어     수학      총점     평균    학점 ");
		System.out.println("==================================================");
		System.out.println(score1.toString());
		System.out.println(score2.toString());
	}

}
