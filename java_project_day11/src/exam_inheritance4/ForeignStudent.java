package exam_inheritance4;

public class ForeignStudent extends Student{
	private String nation;
	
	ForeignStudent(){};
	
	ForeignStudent(String name, int age, int studentNum, String nation){
		super(name,age,studentNum);
		this.nation = nation;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	};
	
	
	public void show() {
		System.out.printf("외국학생[이름:%s, 나이:%d, 학번: %d]\n",super.getName(),super.getAge(),super.getStudentNum(),nation);
	}

}
