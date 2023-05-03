package exam_inheritance3;

public class ManagerTest {

	public static void main(String[] args) {
		//Manager(String name, String address, String phoneNumber, int salary,int bonus, String job){
		//Manager mng1 = new Manager("홍길동","봉천동 1536","010-1234-1234",150000,10,"매니저");
		//System.out.println(mng1.toString());
		
		//다형성
		// 객체배열
		
		Employee[] emps = {
				new Employee("김사원","서울 어딘가","010-1234-1234",4200),
				new Manager("홍길동","봉천동 1536","010-1234-1234",150000,10,"매니저")
		};
		
		for(Employee emp:emps) {
			System.out.println(emp.toString());
		}
		
	}

}
