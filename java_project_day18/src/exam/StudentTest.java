package exam;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class StudentTest {
	
	private static Student student;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Test
	public void test() {
		student = new Student("김난이","디자인과","0101","5.5");
		System.out.println(student.toString());
	}

}
