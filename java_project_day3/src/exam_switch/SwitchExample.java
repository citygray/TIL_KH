package exam_switch;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		/*
		 * 1층: 약국
		 * 2층: 정형외과
		 * 3층: 피부과
		 * 4층: 치과 */
		
		int floor = 0;
		String store;
		
		Scanner input = new Scanner(System.in);
		System.out.println("몇 층으로 가겠습니까?");
		floor = input.nextInt();
	
		switch (floor) {
			case 1:
				store = "약국";
				break;
			case 2:
				store = "정형외과";
				break;
			case 3:
				store = "피부과";
				break;
			case 4:
				store = "치과";
				break;
			default:
				store = "없는 층";
		}
		System.out.printf("%d층는 %s입나다",floor,store);
		
		input.close();
	}

}
