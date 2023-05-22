package example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class menuException extends Exception {
	menuException(int i) {
		super(i + "는 잘못된 입력입니다.");
	}
}

public class Notepad implements Menu,Serializable{
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {

			
		NotepadManager nmg = NotepadManager.getInstance();
		nmg.loadNote();

		int menu = 0;
		Loop1 : while (true) {
			try {
				System.out.println("1. 목록");
				System.out.println("2. 새 메모");
				System.out.println("3. 종료");
				System.out.print("원하는 작업번호를 입력해주세요>>");
				menu = input.nextInt();
				input.nextLine();
				if (menu < 0 || 3 < menu) {
					throw new menuException(menu);
				}
						
				switch (menu) {
				case LIST:
					nmg.list();
					break;
				case NEW:
					nmg.newNote();
					break;
				case END:
					nmg.saveNotepad();
					System.out.println("프로그램을 종료합니다.");
					break Loop1;
				}
			} catch (menuException e) {
				System.out.println(e.getMessage());
			}finally {
				//if(input!= null) input.close();
			}
			
		}

	}

}
