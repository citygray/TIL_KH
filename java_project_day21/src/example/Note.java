package example;

import java.io.Serializable;
import java.util.ArrayList;

public class Note implements Serializable{
	private int noteId;
	private String name;
	//private String content;
	private ArrayList<String> content = new ArrayList<>();
	
	public Note(String name, ArrayList content,int noteId){
		this.noteId = noteId;
		this.name = name;
		this.content = content;
	}
	
	
	public int getNoteId() {
		return noteId;
	}


	public String getName() {
		return name;
	}


	public void showContent() {

		for(String line: content) {
			System.out.println(line);
		}
	}


	@Override
	public String toString() {
		return noteId+"-"+ name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Note) {
			Note note = (Note) obj;
			if(this.name.equals(note.name)) return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	

}
