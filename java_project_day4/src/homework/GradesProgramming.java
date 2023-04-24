package homework;

import java.util.Scanner;

public class GradesProgramming {

	public static void main(String[] args) {
		/*
		 * ① 중간고사, 기말고사, 레포트, 출석 점수를 입력받아서 계산한다.
		 * ② 성적은 아래에 준한 점수를 합산하되 소수 이하 2자리까지 출력하라.
		 *   ⓐ (중간+기말)/2 -> 60%
		 *   ⓑ 레포트 -> 20%
		 *   ⓒ 출석 -> 20%
	     * ③ 학점의 기준(if ~ else if ~ else문 이용)
		 *    90이상 'A'학점 / 80이상 'B'학점 / 70점이상 'C'학점 / 60점이상 'D'학점 / 나머지 'F'학점
		 * ④ 평가기준(switch문이용)
		 *   A,B학점 "excellent" -> C,D학점 -> "good" F학점 -> "poor"
		 *     
		 *  [결과]
		 *  중간고사: 90
		 *  기말고사: 89
		 *  레포트:99
		 *  출석점수:100
		 *  
		 *  성적:93.50
		 *  학점:A
		 *  평가:excellent
		 */
		
		int semiScore,finalScore,reportScore,attendScore;
		double totalScore;
		char grade;
		String str;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("중간고사 점수를 입력하세요: ");
		semiScore = input.nextInt();

		System.out.print("기말고사 점수를 입력하세요: ");
		finalScore = input.nextInt();
		
		System.out.print("레포트 점수를 입력하세요: ");
		reportScore = input.nextInt();
		
		System.out.print("출석 점수를 입력하세요: ");
		attendScore = input.nextInt();
		
		totalScore = (((double)(semiScore+finalScore)/2) *0.6) + (reportScore*0.2) + (attendScore*0.2);
		
		//③ 학점의 기준(if ~ else if ~ else문 이용)
		//90이상 'A'학점 / 80이상 'B'학점 / 70점이상 'C'학점 / 60점이상 'D'학점 / 나머지 'F'학점
		
		if(90<=totalScore) {
			grade = 'A';
		}else if(80<=totalScore) {
			grade = 'B';
		}else if(70<=totalScore) {
			grade = 'C';
		}else if(60<=totalScore) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		// ④ 평가기준(switch문이용)
		// A,B학점 "excellent" -> C,D학점 -> "good" F학점 -> "poor"
		switch(grade) {
			case 'A','B':
				str = "excellent";
				break;
			case 'C','D':
				str = "good";
				break;
			default:
				str = "poor";
		}
		
		
		System.out.printf("성적:%.2f\n",totalScore);
		System.out.printf("학점:%c \n",grade);
		System.out.println(str);
		
		input.close();
		

	}

}
