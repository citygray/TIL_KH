package exam_inner_class;

public class Main {

	public static void main(String[] args) {
		//인스턴스 멤버 클래스 객체 생성
		A a = new A();
		A.B b = a.new B();
		
		//A.B b = new A().new B();
		//외부클래스명.내부클래스명 참조변수 = new 외부클래스생성자().new 내부클래스생성자();
		
		b.field1 = 3;
		b.method1();
		System.out.println();
		
		//정적멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		
		A.C.field2 = 6;
		A.C.method2();
		System.out.println();
		
		a.method();
		
	}

}
