package exam_switch;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {

		/*
		 * 1년의 각 월의 일수를 출력하는 프로그램을 작성하여 보자
		 * 즉 특정 월을 입력받아 그 월의 일수를 출력한다.*/
		
		int month;
		int year = 2000;
		int days = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("월을 입력하시오");
		month = input.nextInt();
		
		if(month<1||12<month){
			System.out.println("잘못입력하였습니다.");
		}else {
			switch(month) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					days = 31;
					break;
				case 2:
					//윤년 계산
					//년도가 4의 배수이고 100의 배수가 아니거나 400의 배수  == 윤년
					if((year%4==0)&&(year%10!=0)||(year%400==0)) {
						days= 29;
					}else {
						days = 28;
					}
					break;
				default:
					days = 30;
			}
			System.out.printf("%d년 %d월은 %d일 입니다",year,month,days);
		}
		input.close();
	}

}
