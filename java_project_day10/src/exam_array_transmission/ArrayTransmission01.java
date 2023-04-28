package exam_array_transmission;

import java.util.Scanner;

/*
 사용자로부터 5명의 학생의 컴퓨터 점수를 입력받아서(배열을 이용)
 값의 평균을 구하여 출력하는 프로그램을 작성해 보자
 단 입력을 받기 위한 메서드(getValues()) 평균을 출력할 수 있는  
 */
public class ArrayTransmission01 {

	public static void main(String[] args) {
		final int STUDENTS = 3;
		int[] scores = new int[STUDENTS];
		
		getValues(scores);
		getAverage(scores);
	}

	//입력을 받기 위한 메서드
	private static void getValues(int[] scores) {
		Scanner input = new Scanner(System.in);
		for(int i = 0;i<scores.length;i++) {
			System.out.print("컴퓨터 점수를 입력하시오>>");
			scores[i] = input.nextInt();
		}
		input.close();
	}
	
	//평균을 구해 출력하는 메서드
	private static void getAverage(int[] scores) {
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
		}
		System.out.println("평균: "+(int)(sum/scores.length));
	}
}
