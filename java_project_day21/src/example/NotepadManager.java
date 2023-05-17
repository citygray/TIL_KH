package example;

import java.util.ArrayList;
import java.util.List;

public class NotepadManager {
	private List<Note> notepad;
	
	//싱글톤 1. private 생성자 만들기
	private NotepadManager() {
		notepad = new ArrayList<>();
	}
	
	//싱글톤 2. 클래스 내부에 static으로 유일한 인스턴스 생성
	private static NotepadManager instance = null;
	
	//싱글톤 3. 외부에서 참조할 수 있는 public 메서드 만들기
	public static NotepadManager getInstance() {
		if(instance ==null) {
			instance = new NotepadManager();
		}
		return instance;
	}
	
	/*
	int LIST = 0;
	int READ = 1;
	int NEW = 2;
	int END = 3;
	 */
	
	
	public void list() {}
	public void read() {}
	public void newNote() {}
	public void end() {}
	
}
