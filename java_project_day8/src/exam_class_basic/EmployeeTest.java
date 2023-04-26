package exam_class_basic;

public class EmployeeTest {

	public static void main(String[] args) {
		/*
		 * 직원 정보를 저장할 Employee 클래스를 생성하려 보자.
		 * 직원은 이르(name),전화번호(phoneNumber),급여(salary)를 필드로 가진다.
		 * 직원정보를 실행 클래스에서 임의의 값으로 설정하여 준다.
		 * 그후 화면에 전체 필드의 내용을 출력되도록 작성한다.
		 */

		Employee employee1 = new Employee();
		employee1.data("홍길동", "010-1234-1234", 1000000);
		System.out.println(employee1.toString());
		
		Employee employee2 = new Employee();
		employee2.data("김철수", "010-2856-1234", 2000000);
		System.out.println(employee2.toString());
	}

}
