package example;

public class Note {
	private String name;
	private String content;
	
	public Note(String name, String content){
		this.name = name;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "파일명: "+ name+"\n"+content;
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
