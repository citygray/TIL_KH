package exam;

import java.util.ArrayList;
import java.util.Scanner;

/*
[요구사항 3]
학생 정보를 저장하기 위한 Student 클래스를 생성해야 한다 Student 클래스는 이름(name), 학과(department), 학번(id), 학점평균(grade)을 저장하는 필드가 있다.

- 실행 클래스의 이름은 StudentManager이다.
- 사용자로 하여금 학생정보를 입력받아 Student 객체를 생성하고 4명의 학생 정보를 ArrayList<Student> 컬렉션에 저장한 후에(read()), ArrayList<Student>의 모든 학생(4명) 정보를 출력한다(printAll())
반복문을 통해서 학생 이름을 입력받아 학생의 정보를 출력하되 종료를 입력하면 프로그램을 종료하도록(processQuery()) 프로그램을 작성하라.

 */


/*
 * 한 메서드에 오직 한 단계의 들여쓰기만 한다.
 * else 예약어를 쓰지 않는다.
 * 모든 원시 값과 문자열을 포장한다.
 * 한 줄에 점을 하나만 찍는다.
 * 줄여 쓰지 않는다(축약 금지).
 * 모든 엔티티를 작게 유지한다.
 * 3개 이상의 인스턴스 변수를 가진 클래스를 쓰지 않는다.
 * 일급 컬렉션을 쓴다.
 * getter/setter/프로퍼티를 쓰지 않는다.
 */


public class StudentManager {
	public static Scanner scan = new Scanner(System.in);
	
	ArrayList<Student> students;
	
	public StudentManager() {
		students = new ArrayList<Student>(); 
	}

	//create
	public void createStudent() {
		System.out.print(">>");
		String input = scan.nextLine();
		String[] ArraysStr = input.split(",");
		
		students.add(new Student(ArraysStr[0],ArraysStr[1],ArraysStr[2],ArraysStr[3]));
	}
	
	
	
	//search
	public String searchStudent(String inputName) {
		String str="없는 학생입니다.";
		
		for(Student stu: students) {
			if(stu.getName().toString().equals(inputName)) {
				str = stu.toString();
				break;
			}		
		}
		return str;
	}
	
	
	//printAll
	public void printAll() {
		for(Student stu: students) {
			System.out.println("----------------------");
			System.out.println(stu.toString());
			
		}
	}
	

}
