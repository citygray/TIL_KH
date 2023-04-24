package exam_if;

import java.util.Scanner;

public class ifExample3 {

	public static void main(String[] args) {
		/* 3개의 정수를 입력 받아서 최대값 출력하도록 프로그램 작성해 주세요.*/
		Scanner input = new Scanner(System.in);
		int[] nums = new int[3];
		int maxNum = 0;
		
		for(int i = 0;i<nums.length;i++) {
			System.out.println(i+1+"번째 정수를 입력하시오");
			nums[i] = input.nextInt();
		}
		
		for(int i = 0;i<nums.length;i++) {
			maxNum = (nums[i]>maxNum)? nums[i]:maxNum;
		}
		System.out.println("최대값은 "+ maxNum);
		
		input.close();
	}

}
