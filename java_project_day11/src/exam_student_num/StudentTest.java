package exam_student_num;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("serialNum기본값: "+Student.serialNum);
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.setName("김난이");
		student2.setName("하승수");

		
		System.out.println(student1.name+" 학번:"+student1.studentID);
		System.out.println(student2.name+" 학번:"+student2.studentID);
		
		System.out.println("serialNum 변경된 값: "+Student.serialNum);
	}

}
