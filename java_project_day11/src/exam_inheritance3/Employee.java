package exam_inheritance3;

public class Employee {
	private String name;
	private String address;
	private String phoneNumber;
	private int salary;
	
	public Employee(){
		
	}
	
	public Employee(String name, String address, String phoneNumber, int salary){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("이름:%s\n주소:%s\n전화번호:%s\n급여:%d\n",name,address,phoneNumber,salary);
	}

}
