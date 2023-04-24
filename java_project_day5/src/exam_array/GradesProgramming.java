package exam_array;

import java.util.Arrays;

public class GradesProgramming {

	public static void main(String[] args) {

		/*
		 *  출력 결과는 다음과 같다.

          성적 프로그램 

		  =================================================================
		
		  번호 이름   국어  영어  수학   총점     평균     학점  재수강   순위
		
		  =================================================================
		
		  1  홍길동   90   75   61  226  75.33    C   pass    2  
		
		  2  김철수   55   56   46  157  52.33    F   nopass  3  
		
		  3  이진희   90   90   90  270  90.00    A   pass    1  
		
		
		- 조건은 다음과 같다.
		- 학생명 : name / 점수 : score / 평균 : avg / 학점 : grade / 재수강 : pass / 순위 : rank
		
		- 수식은 다음과 같다
		 총점 = 국어 + 영어 + 수학;
		 평균 = 총점 / 3;
		 학점 = 평균 90이상 'A' / 80이상 'B' / 70이상 'C' / 60이상 'D' / 나머지는 'F'
		 재수강 = 평균 60이상이면 'pass' / 60미만이면 'nopass'
		 순위 구하기는 제일 마지막으로 작성하시면 됩니다.
		 */
		String[] names = {"홍길동","김철수","이진희"};
		int[][] score = {
				{90,75,61,0},
				{55,56,46,0},
				{90,90,90,0}
		};
		
		//총점구하기
		int sum;
		for(int i=0;i<score.length;i++) {
			sum=0;
			for(int j=0;j<score[i].length;j++) {
				sum += score[i][j];
				if(j==score[i].length-1) score[i][j] = sum;
			}
		}
		
		//평균 구하기
		double[] avg = new double[3];
		for(int i=0;i<score.length;i++) {
			avg[i] = (double)score[i][3]/3;
		}
		//학점 = 평균 90이상 'A' / 80이상 'B' / 70이상 'C' / 60이상 'D' / 나머지는 'F'
		char[] grade = new char[3];
		for(int i=0;i<avg.length;i++) {
			if(90<=avg[i]) {
				grade[i] = 'A';
			}else if(80<=avg[i]){
				grade[i] = 'B';
			}else if(70<=avg[i]){
				grade[i] = 'C';
			}else if(60<=avg[i]){
				grade[i] = 'D';
			}else {
				grade[i] = 'F';
			}
		}
		
		//pass 재수강 = 평균 60이상이면 'pass' / 60미만이면 'nopass'
		String[] pass = new String[3];
		for(int i=0;i<avg.length;i++) {
			if(60<=avg[i]) {
				pass[i] = "pass";
			}else{
				pass[i] = "nopass";
			}
		}
		
		//총점을 내림차순 정렬
		int[] totalScores = new int[3];
		for(int i=0;i<score.length;i++) {
			totalScores[i]=score[i][3];
		}
		Arrays.sort(totalScores);
				
		
		//출력하기
		System.out.println("=================================================================");
		System.out.println("번호 이름   국어  영어  수학   총점   평균  학점  재수강   순위");
		System.out.println("=================================================================");
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d   %s  ",i+1,names[i]);
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("%3d  ",score[i][j]);
			}
			//평균
			System.out.printf("%.2f  ",avg[i]);
			//학점
			System.out.printf("%s   ",grade[i]);
			//재수강
			System.out.printf("%s ",pass[i]);
			
			System.out.println();
		}		  
				
				  
		
	}

}
