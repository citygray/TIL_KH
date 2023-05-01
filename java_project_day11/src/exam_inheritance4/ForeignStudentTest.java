package exam_inheritance4;

public class ForeignStudentTest {

	public static void main(String[] args) {
		Person person1 = new Person("홍길동",56);
		Student student1 = new Student("한늘봄",41,990100001);
		ForeignStudent foreignStudent1 = new ForeignStudent("Olivia",23,990100002,"USA");

		person1.show();
		student1.show();
		foreignStudent1.show();
	}

}
