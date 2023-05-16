package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notepad {
	public static void main(String[] args) {}
	
	List<Note> notepad = new ArrayList<>();
	
	Scanner input = new Scanner(System.in);

	private int menu = 0;
	while(true) {
		System.out.println("0. 목록");
		System.out.println("1. 메모 읽기");
		System.out.println("2. 새 메모");
		System.out.println("3. 종료");
		System.out.print("원하는 작업번호를 입력해주세요>>");
		menu = input.nextInt();
		input.nextLine();
		if(menu==3) break;
		
	}

}
