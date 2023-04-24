package exam_array;

public class MaxMinExample {

	public static void main(String[] args) {
		/*
		 * 다음의 정수 중에 12, 26, 68, 98, 76, 54, 8, 6, 4 
		 * 가장 큰값(최대값), 가장 작은값(최소값)을 출력해 주세요.
		 * 
		 * [출력 결과]
		 * 최대값 :00, 최소값 :00
		*/
		
		int[] nums = {12, 26, 68, 98, 76, 54, 8, 6, 4};
		int max=nums[0],min=nums[0];
		
		for(int num:nums) {
			if(min>num) min = num;
			if(max<num) max = num;
		}

		System.out.println("최소값은 : "+min);
		System.out.println("최대값은 : "+max);
	}

}
