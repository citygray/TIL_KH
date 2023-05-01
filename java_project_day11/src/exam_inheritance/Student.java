package exam_inheritance;

public class Student extends Person{
	private String major;
	
	Student(){
		super();
	};
	
	Student(String name, int age, String major){
		super(name, age);
		this.major = major;
	};
	
	public String getMajor() {
		return this.major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + " : "+ getMajor();
	}
}
