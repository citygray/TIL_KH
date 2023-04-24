package exam_array;

import java.util.Scanner;

public class ScoreArray {

	public static void main(String[] args) {
		/*[요구사항 1]
		다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라.
		문자열(course 배열)에 다음과 같이 초깃값을 가진다. "Java", "C++", "HTML5", "컴퓨터구조", "데이터베이스"
		그리고 그 과목에 대한 점수(score 배열)도 다음과 같이 초깃값을 가진다. 95, 88, 76, 62, 55
		​

		그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라. 
		"종료"를 입력받으면 종료한다.
		if(문자열배열명[인덱스]==문자열변수)            X
		if(문자열배열명[인덱스].equals(문자열변수))     O 
		 */

		String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "데이터베이스"};
		int[] score = {95, 88, 76, 62, 55};

		Scanner input = new Scanner(System.in);
		String userInput;
		int userScore = 0;
		System.out.println("[과목 정보]\nJava, C++, HTML5, 컴퓨터구조, 데이터베이스\n");
		
		
		int i;
		while(true) {
			System.out.print("과목 이름>> ");
			userInput = input.nextLine();
			if(userInput.equals("종료")) break;
			
			for(i=0;i<course.length;i++) {
				
				if(course[i].equals(userInput)) {
					userScore = score[i];
					System.out.println(course[i]+"의 점수는 "+userScore+"점 입니다.");
					break;
				}
			}
			
			if(i==course.length) {System.out.println("없는 과목입니다.");}
			
		}
		
		System.out.println("종료되었습니다.");
		input.close();
		
		
		/*
		 * do {
			System.out.print("과목 이름>> ");
			userInput = input.nextLine();
			
			for(int i=0;i<course.length;i++) {
				if(course[i].equals(userInput)) {
					userScore = score[i];
					System.out.println(userScore);
				}
			}
		}while(!(userInput.equals("종료")));
		 * */

	}

}
