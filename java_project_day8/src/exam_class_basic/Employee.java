package exam_class_basic;

public class Employee {
	
	/*
	 * 직원 정보를 저장할 Employee 클래스를 생성하려 보자.
	 * 직원은 이르(name),전화번호(phoneNumber),급여(salary)를 필드로 가진다.
	 * 직원정보를 실행 클래스에서 임의의 값으로 설정하여 준다.
	 * 그후 화면에 전체 필드의 내용을 출력되도록 작성한다.
	 */
	
	public String name;
	public String phoneNumber;
	public int salary;
	
	public void data(String name,String phoneNumber,int salary) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("직원정보 [ 이름:%s, 전화번호%s, 급여:%d ]",name,phoneNumber,salary);
	}

}
