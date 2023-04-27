package simplephoneinfo;

import java.util.Scanner;
/*
 * 
 * 전화번호 프로그램(2단계)
 * “프로그램 사용자로부터의 데이터 입력” 즉, 프로그램 사용자로부터 데이터를 입력 받아서 PhoneInfo클래스의 인스턴스를 생성한다. 프로그램 사용자가 종료 명령을 할 때까지 반복문을 사용하여 반복한다.
 * 키보드로부터 데이터 입력
 * 			↓
 * 입력 받은 데이터로 PhoneInfo의 인스턴스 생성
 * 			↓
 * 생성된 인스턴스의 showPhoneInfo 메소드 호출
 * 그리고 실행 때마다 생성된 인스턴스는 유지되지 않아도 된다.
 * 프로그램의 흐름을 계속할지 아니면 종료할지 프로그램 사용자가 선택할 수 있도록 해야 한다. 단 현재 예제에서는 사용자에게 이름, 전화번호, 생년월일을 입력 받도록 하자.
 */

/*
 * 선택하세요

1. 데이터 입력
2. 프로그램 종료
선택 : 1
이름 : 홍길동
전화번호 : 123-1234
생년월일 : 2000년 11월 22일
 */
public class PhoneBookVer02 {
	public static Scanner input = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.print("선택 :");
	}
	
	public static void readData() {
		PhoneInfo info = new PhoneInfo();
		
		System.out.print("이름: ");
		info.setName(input.nextLine());
		
		System.out.print("전화번호 :");
		info.setPhoneNumber(input.nextLine());
		
		System.out.print("생년월일 :");
		info.setBirthday(input.nextLine());
		
		info.showPhoneInfo();
	}
	
	public static void main(String[] args) {
		int inputMenu;
		while(true) {
			showMenu();
			inputMenu = input.nextInt();
			input.nextLine(); //nextLine 버퍼처리
			if(inputMenu==2) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(inputMenu==1) {
				readData();
			}
		}
			
	}
	

}
