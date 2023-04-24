package exam_if;

import java.util.Scanner;

public class ifExample {

	public static void main(String[] args) {
		int age = 0;
		int charge = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		age = input.nextInt();
		
		if(age<8) {
			System.out.println("미취학아동");
			charge = 1000;
		}else if(age<14) {
			System.out.println("초등학생");
			charge = 2000;
		}else if(age<20) {
			System.out.println("청소년");
			charge = 2500;
		}else if(age<60) {
			System.out.println("일반");
			charge = 3000;
		}else {
			System.out.println("경로우대");
			charge = 0;
		}
		System.out.println("입장료는"+ charge +"입니다.");
		
		input.close();
	}

}
