package exam_inheritance;

public class InheritanceTest {

	public static void main(String[] args) {

		Employee e = new Employee("홍길동",30,"행정실");
		Professor p = new Professor("김교수",50,"자바");
		Student s  = new Student("김난이",38,"컴퓨터공학과");
		
		
//		p.setName("김철수");
//		p.setAge(40);
//		p.setSubject("자바");
//
//		s.setName("김난이");
//		s.setAge(38);
//		s.setMajor("컴퓨터과학과");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
		
	}

}
