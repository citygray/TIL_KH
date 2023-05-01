package exam_inheritance;

public class Employee extends Person{
	private String dept;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, int age, String dept) {
		//부모 생성자로 초기화
		super(name,age);
		this.dept = dept;
	}
	
	public String getDept() {
		return this.dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {
		return super.toString() + " : " + getDept();
	}
}
