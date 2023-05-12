package exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomList {

	public static void main(String[] args) {
		// 1~100 사이의 임의의 숫자 10개를 출력하고  오름차순(낮은 값 -> 높은값)으로 정렬하여 출력하세요
		Integer[] numbers = new Integer[10];
		for(int i=0;i<10;i++) {
			int num = (int)(Math.random()*100+1);
			numbers[i] = num;
		}
		System.out.println(Arrays.toString(numbers));
		
		List<Integer> list = Arrays.asList(numbers);
		
		Collections.sort(list);
		System.out.println("오름차순 : "+ list.toString());
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("내림차순 : "+ list.toString());
		
		
	}

}


