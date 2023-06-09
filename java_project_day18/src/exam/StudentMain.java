package exam;

import java.util.ArrayList;
import java.util.Scanner;



public class StudentMain {
	
	public static void main(String[] args) {
		
		StudentManager mng = new StudentManager();
		
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요");
		System.out.println("* 이름 두자리 이상/학번 4자리 숫자/학점 10이하 소숫점 1째짜리 까지");
		for(int i=0;i<2;i++) {
			mng.createStudent();
		}
		mng.printAll();
		
		//반복문을 통해서 학생 이름을 입력받아 학생의 정보를 출력하되 종료를 입력하면 프로그램을 종료하도록(processQuery()) 프로그램을 작성하라.
		while(true) {
			System.out.println("학생 이름>> ");
			String inputName = StudentManager.scan.nextLine();
			if(inputName.equals("종료")) {
				System.out.println("끝!");
				break;
			}
			System.out.println(mng.searchStudent(inputName));
		}
			
	}

}
