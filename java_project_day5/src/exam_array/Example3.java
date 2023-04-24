package exam_array;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
	
	/*
	 * [실행 결과]
	
		여러 수들을 입력해 주세요(공백기준): 1 5 4 6 8 1 3 9 4 10 6 9 8 1 3
		
		1의 개수 : 3
		
		2의 개수 : 0
		
		3의 개수 : 2
		
		4의 개수 : 2
		
		5의 개수 : 1
		
		6의 개수 : 2
		
		7의 개수 : 0
		
		8의 개수 : 2
		
		9의 개수 : 2
		
		10의 개수 : 1
	 * 
	 * [규칙]

	- 1 ~10의 수 N개가 띄어쓰기로 구분되어 입력된다

	- 만약 문자열로 입력받는다면 그 문자열을 다시 배열로 저장 가능하다.
	  split(구분자); 문자열을 구분자로 나누어 문자열 배열로 반환하는 메서드.
	  String[] 배열명 = 문자열을 저장한 변수명.split(" ");
	
	- 입력된 수들 중에서 1, 2, 3 ... , 10의 개수를 각각 세어서 출력한다.
	
	- 만약 문자열을 숫자로 변환하고자 한다면 Integer.parseInt(문자열)로 작성하면 문자열("100")을 정수형(100)으로 반환   한다.
	  int data = Integer.parseInt("100");
	
	*/
		
	//1 ~10의 수 N개가 띄어쓰기로 구분되어 입력된다
		
	//숫자당 바로 출력
	/*
	Scanner input = new Scanner(System.in);
	System.out.println("여러 수들을 입력해 주세요(공백기준): 1 5 4 6 8 1 3 9 4 10 6 9 8 1 3");
	String str = input.nextLine();
	String[] strArray = str.split(" ");
	input.close();
	
	System.out.println(Arrays.toString(strArray));

	
	for(int i=1;i<=10;i++) {
		int count = 0;
		for(String strVaule: strArray) {
			if(i==Integer.parseInt(strVaule)) {count++;}
		}
		System.out.printf("%d의 개수 : %d\n",i,count);
	}
	*/
	
	//숫자당 카운트를 배열에 저장해서 출력하는 방법
	Scanner input = new Scanner(System.in);
	int[] numbers = new int[10];
	System.out.println("여러 수들을 입력해 주세요(공백기준): 1 5 4 6 8 1 3 9 4 10 6 9 8 1 3");
	String strValue = input.nextLine();
	
	String[] strValueArray = strValue.split(" ");
	
	for(int i = 0; i<strValueArray.length;i++) {
		numbers[Integer.parseInt(strValueArray[i])-1]++;
	}
	for(int i = 0; i<numbers.length;i++) {
		System.out.printf("%d의 개수:%d\n",i+1,numbers[i]);
	}
	
	input.close();
	}
}
