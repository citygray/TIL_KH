package exam_interface;

public class Example01 {

	public static void test(MyInterface mi) {// 매개변수 : 인터페이스의 참조 변수 = 구현 클래스의 주소값 대입
		mi.print();
	}
	public static MyInterface test2() {
		//익명클래스 : new 부모클래스 또는 인터페이스(){}
		//익명클래스 선언과 인스턴스생성 동시에
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("test2() 메서드에서 반환된 MyInterface");
			}
		};
		return mi;
	}
	public static void main(String[] args) {
		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		
		mc1.print();
		mc2.print();
		
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명클래스로 구현");
			}
		};
		test(mc1);
		test(mi);
		
		mi.print();
		
		(new MyInterface() {
			@Override
			public void print() {
				System.out.println("선언, 생성, 호출을 한번에 처리");
			}
		}).print();
		
		MyInterface mi2 = test2();
		mi2.print();

	}

}
