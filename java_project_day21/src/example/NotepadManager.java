package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class NotepadManager implements Menu {
	static private int noteId;
	static ObjectInputStream in = null;
	static ObjectOutputStream out = null;
	
	static private List<Note> notepad;

	// 싱글톤 1. private 생성자 만들기
	private NotepadManager() {
		notepad = new ArrayList<>();
	}

	// 싱글톤 2. 클래스 내부에 static으로 유일한 인스턴스 생성
	private static NotepadManager instance = null;

	// 싱글톤 3. 외부에서 참조할 수 있는 public 메서드 만들기
	public static NotepadManager getInstance() {
		if (instance == null) {
			instance = new NotepadManager();
		}
		return instance;
	}

	public void newNote() {

		System.out.println("메모 파일명 입력해주세요");
		String txtTit = input.next();
		System.out.println("메모할 문자열을 입력하세요\n(종료: 빈 줄에서 엔터키 입력)");
		
		ArrayList<String> lines = new ArrayList<>();
		try {
			InputStreamReader in = new InputStreamReader(System.in); 
			BufferedReader br = new BufferedReader(in);
					
			String line;
			while((line = br.readLine())!= null && line.length( ) > 0) {
				lines.add(line);
			}
		
			System.out.println(lines);
		} catch (IOException io) {
			io.printStackTrace();
		}
		
		Note note = new Note(txtTit,lines,++noteId);
		notepad.add(note);
	}
	
	
	public void list() {
		final int size= notepad.size();
		
		if(size==0) {
			System.out.println("저장된 목록이 없습니다.");
		}else {
			System.out.println("--------------------------");
			
			for(int i = 0; i<size;i++) {
				System.out.println(notepad.get(i));
			}
			System.out.println("--------------------------");
			
			detail();
			
		}
		
		
	}
	
	public void detail() {
		while(true) {
			System.out.println("글번호를 선택하세요>>");
			int noteId = input.nextInt();
			
			final int size= notepad.size();
			if(noteId>size) {
				System.out.println("해당 번호에 글이 없습니다.");
			}else {
				for(int i = 0; i<size;i++) {
					Note note = notepad.get(noteId-1);
					System.out.println("--------------------------");
					System.out.println("파일명:"+note.getName());
					System.out.println("본문:");
					notepad.get(noteId-1).showContent();
					System.out.println("--------------------------");
				}
				break;
			}
		}
		
	}
	
	public void saveNotepad() {
		try {
			out = new ObjectOutputStream(new FileOutputStream("notepad.dat"));
			out.writeObject(notepad);
			out.flush();
		}catch(IOException e) {

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (out != null)
					out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public void loadNote() {
		File file = new File("notepad.dat");
		if(file.exists()) {
			try {
				in = new ObjectInputStream(new FileInputStream("notepad.dat"));
				notepad = (List<Note>)in.readObject();
				Note lastNote = notepad.get(notepad.size()-1);
				noteId =  lastNote.getNoteId();
												
			} catch (ClassNotFoundException c) {
				System.out.println(c.getMessage());
			} catch (IOException i) {
				System.out.println(i.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					if (in != null)
						in.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
