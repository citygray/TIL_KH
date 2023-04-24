package exam_array;

import java.util.Arrays;
import java.util.Scanner;

public class JudgeExample {

	public static void main(String[] args) {
		
		/*
		 * - 총입력된 점수들
		 * 86점
		 * 73점
		 * 80점
		 * 95점
		 * 88점
		 * 
		 * - 제거 대상 점수
		 * 최고점수: 95점
		 * 최소점수: 73점
		 *
		 * - 최종 입력 점수
		 * 86점
		 * 80점
		 * 88점
		 * 
		 * ----------------
		 * 총점 254
		 * 평균 84.67
		 * 
		 * */
		

		/*
		 * 올림픽과 같은 국제 대회에서 심사위원들이 선수들에게 점수를 주고 평균을 구하는 과정을 살펴보면
		 * 전체 심사위원들의 점수를 모두 합하는 것이 아니라 최대점수와 최소점수를 제거한 나머지 점수의
		 * 평균으로 최종 점수를 확정하는 경우가 많다.
		 * 아래와 같이 심사위원 5명의 점수를 입력(0~100)받아 최대와 최소 점수를 제거한 점수들의 평균을 구하는 프로그램을 작성하세요.  
		 */

		int sum = 0;
		//기능: 심사위원 점수 받기
		//심사위원 인원 만큼 배열을 만든다
		int[] judge = new int[5];
		
		/*
		     i가 5가 될때 까지 반복한다. 
		     	반복문 1 : 0~100사이에 값을 입력받는다.
		     		입력받은 값이 
		     			0~100사이 값이면 배열에 저장하고 i++
		     			아니면 반복1을 반복한다.
	     */
		
		Scanner input = new Scanner(System.in);
		int score = 0;
		
		int i = 0;
		while(true) {
			while(true) {
				System.out.println("점수를 입력하세요.");
				score = input.nextInt();
				//0~100사이 값이면 배열에 저장하고 i++ break
				if(0<=score&&score<=100) {
					judge[i] =score;
					i++;
					break;
				}
				System.out.println("0~100사이 값으로 입력하시오");
			}
			
			if(i==5)break;
		}
		input.close();
		System.out.println("---총 입력된 점수는---");
		System.out.println(Arrays.toString(judge));
		
		
				
		//기능: 최소값과 최대값 구하기
		int min = judge[0];
		int max = judge[0];
		for(int j = 0;j<judge.length;j++) {
			if(min>judge[j]) min = judge[j];
			if(max<judge[j]) max = judge[j];
		}
		System.out.println("---제거 대상 점수---");
		System.out.println("최소값: "+min);
		System.out.println("최대값: "+max);
		
		//점수 배열과 최소값,최대값 비교하여
		//유효값이면 총합에 합쳐준다.
		int count = 0;
		for(int k=0;k<judge.length;k++) {
			if((judge[k]!=min) && (judge[k]!=max)){
				sum += judge[k];
				count++;
			}
		}
		
		System.out.println("총합은 "+sum);
		System.out.printf("평균은 %.2f",(double)sum/count);
		
		
	}





}
