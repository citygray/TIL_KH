package exam_field_init;

public class FieldInit {
	/*
	 - 자동 -> 간단(명시적) -> 복잡(초기화 블록, 생성자)
     - cv --> iv
	 */
	
	// 명시적 초기화
	static int sValue = 10;//클래스 필드
	int insValue = 20;//인스턴스 필드
	
	static {
		//클래스 필드 초기화(클래스 필드를 초기화 하거나 프로그램 실행 될때 가장 먼저 처리할 작어
		sValue = 30;
	}
	{
		int num1 =9;
		int num2 =8;
		insValue = num1 *num2;
	}
	
	public FieldInit() {
		//인스턴스 필드 초기화
		insValue = 40;
	}
	
	public void display() {
		System.out.println("sValue: "+ sValue);
		System.out.println("insValue: "+ insValue);
	}
	
}
