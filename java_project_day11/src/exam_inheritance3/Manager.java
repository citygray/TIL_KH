package exam_inheritance3;

public class Manager extends Employee{
	private int bonus;
	private String job;
	
	Manager(){
		super();
	}
	
	Manager(String name, String address, String phoneNumber, int salary,int bonus, String job){
		super(name,address,phoneNumber,salary);
		this.bonus = bonus;
		this.job = job;
	}
	
	public String toString() {
		return super.toString() + String.format("보너스:%d\n직책:%s",bonus,job);
	}

}
