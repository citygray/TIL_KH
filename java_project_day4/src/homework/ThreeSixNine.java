package homework;

import java.util.Scanner;

public class ThreeSixNine {

	public static void main(String[] args) {
		/*
		 * 369게임을 간단히 작성해보자. 

			1~99까지의 정수를 키보드로부터 입력받고 그 수가 범위에 속하지 않으면 "값의 범위를 초과하였습니다" 라고 출력하고 종료한다.
			정수에 3, 6, 9 중 하나가 있는 경우는 "박수짝"을 출력하고 
			두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라. 
			
			예를 들면 정수가 13인 경우 "박수짝"을, 
			36인 경우 "박수짝짝"을 출력하면 된다.
		 */
		 
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		
		int userNum = input.nextInt();
		
		if(userNum<0||99<userNum) {
			//1~99까지의 정수를 키보드로부터 입력받고 그 수가 범위에 속하지 않으면 "값의 범위를 초과하였습니다" 라고 출력하고 종료한다.
			System.out.println("\"값의 범위를 초과하였습니다\"");
		}else {
			
			/*
			 * 12345 % 10 -> 5
			 * 1234 % 10 -> 4
			 * 123 % 10 -> 3
			 * 12 % 10 -> 2
			 * */
			
			int count = 0;
			do {
				if((userNum % 10)%3==0) {
					count++;
				}
				userNum = userNum /10;
			} while(userNum>0);
			
			//System.out.println(count);
			
			if(count==1) {
				System.out.println("박수짝");
			}else if(count==2) {
				System.out.println("박수짝짝");
			}
			
			input.close();
		}

	}

}
