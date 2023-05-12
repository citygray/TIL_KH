package exam_map;

public class Student implements Comparable<Student>{
	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	
	
	
	@Override
	public String toString() {
		return String.format("학번: %d, 이름: %s",sno,name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(this.name.equals(student.name) && this.sno == student.sno) {
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {
		return name.hashCode()+sno;
	}
	
	@Override
	public int compareTo(Student obj) {
		int r = this.sno-obj.sno;
		
		if(r>0) {
			return 1;
		}else if(r==0){
			return 0;
		}else {
			return -1;
		}
	}
	
}
