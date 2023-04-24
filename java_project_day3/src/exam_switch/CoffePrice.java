package exam_switch;

import java.util.Scanner;

public class CoffePrice {

	public static void main(String[] args) {
		/*
		 * 카푸치노,카페라떼 : 3500
		 * 에스프레소,아메리카노 : 2000
		 * default: 메뉴가 없습니다.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("무슨 커피드릴까요?");
		String order = input.nextLine();
		int price = 0;
		
		switch (order) {
			case "카푸치노","카페라떼" -> {
				price = 3500;
			}case "에스프레소","아메리카노" -> {
				price = 2000;
			}
		}
		
		if(price==0) {
			System.out.println("메뉴가 없습니다.");
		}else {
			System.out.printf("%s는 %d원입니다.",order,price);
		}
		input.close();
	}

}
