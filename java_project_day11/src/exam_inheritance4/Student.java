package exam_inheritance4;

public class Student extends Person{
	private int studentNum;
	
	Student(){};
	
	Student(String name, int age, int studentNum){
		super(name,age);
		this.studentNum = studentNum;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	};
	
	
	public void show() {
		System.out.printf("학생[이름:%s, 나이:%d, 학번: %d]\n",super.getName(),super.getAge(),studentNum);
	}
}
