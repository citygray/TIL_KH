package simplephoneinfo;

import java.util.Scanner;

public class PhoneBookVer02 {
	public static Scanner scan = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 종료");
		System.out.println(">>");
	}
	
	
	public static void readData() {
		System.out.println("이름 >>");
		String name = scan.nextLine();
		System.out.println("전화번호 >>");
		String phoneNumber = scan.nextLine();
		System.out.println("생년월일 >>");
		String birthday = scan.nextLine();
		
		if(birthday.equals(""))  birthday = null;
		PhoneInfo pInfo1 = new PhoneInfo(name,phoneNumber,birthday);
		pInfo1.showPhoneInfo();
	} 

	public static void main(String[] args) {

		/*
		 * - 프로그램 사용자로 부터 데이터 입력
		 * 사용자로 부터 데이터를 입력받아서 PhoneInfo클래스의 인스턴스 생성
		 * 프로그램 사용자가 종료 명령을 할 때 까지 반복문을 사용하여 반복
		 * 
		 * 1. 키보드로 부터 데이터 입력
		 * 2. 입력 받은 데이터로 PhoneInfo의 인스턴스 생성
		 * 3. 생성된 인스턴스의 showPhineInfo 메소드 호출
		 * 
		 * 그리고 실행 때 마다 생성된 인스턴스는 유지되지 않아도 된다.
		 * 프로그램 종료는 사용자가 선택할 수 있도록 해야한다.
		 * */
		
		int choice;
		while(true) {
			showMenu();
			
			choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
				case 1:
					readData();
					break;
				case 2:
					System.out.println("종료");
					return;
					
			}
		}
	}
}
