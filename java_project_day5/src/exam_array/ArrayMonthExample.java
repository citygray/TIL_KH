package exam_array;

import java.util.Scanner;

public class ArrayMonthExample {

	public static void main(String[] args) {
		
	//입력한 월의 일수 구하기
	int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	Scanner input  = new Scanner(System.in);
	
	int su;
	do {
		System.out.println("월일 입력하시오");
		su = input.nextInt();
	}while(su<1||12<su);
	
	System.out.printf("%d월은 %d일 입니다.",su,days[su-1]);
	
	input.close();

	}

}
