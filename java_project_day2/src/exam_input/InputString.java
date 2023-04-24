package exam_input;

import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
	/*
		각자의 이름, 나이, 주소를 입력받아 아래와 같이 출력할수 있도로 작성
		[출력 예시]
		홍길동님 안녕하세요. 50살이시네요
		주소는 서울시 관악구 봉천동
	*/	
		Scanner input = new Scanner(System.in);
		
		String name,address;
		int age;
		
		System.out.println("이름을 입력하세요");
		name = input.nextLine();
		
		System.out.println("나이를 입력하세요");
		age = input.nextInt();
		input.nextLine(); //nextInt 입력시 입력한 enter가 다음 nextLine에 적용되기 때문에 nextLine 적용해 줘여함
		
		System.out.println("주소를 입력하세요");
		address = input.nextLine();
		
		System.out.printf("%s님 안녕하세요. %d살이시네요\n주소는 %s",name,age,address);
		
		input.close();
		
	}

}
