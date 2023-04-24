package test;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * 요구사항
		 * 수량, 단가를 입력받아 금액(수량*단가)를 계산한 후, 25%를 할인하여,
		 * 원래 금액, 할인액, 지불금액을 출력하는 프로그램을 작성하시오
		 */

		int count,cost,total,discountedCost;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("수량을 입력하시오");
		count = input.nextInt();
		System.out.println("단가을 입력하시오");
		cost = input.nextInt();
		total = count*cost;
		discountedCost = total /4;
		
		System.out.println("원래 금액: "+ total);
		System.out.println("할인액: "+ discountedCost);
		System.out.println("지불금액: "+ (total-discountedCost));
		
		input.close();
	}

}
