package exam_while;

import java.util.Scanner;

public class NumberSum {

	public static void main(String[] args) {

		/*
		 * 사용자로 부터 5개의 정수를 읽어서 합과 평균값을 계산하여 출력하는 프로그램을 작성하라.
		 */
		Scanner input = new Scanner(System.in);
		
		int[] nums = new int[5];
		int i = 0,sum = 0;
		
		while(i<nums.length){
			System.out.println(i+1+"번째 정수를 입력하시오.");
			nums[i] = input.nextInt();
			sum += nums[i];
			i++;
		};
		
		System.out.println("합계는 "+sum);
		System.out.println("평균값는 "+sum/nums.length);
		
		input.close();
		
	}

}
