package exam_inner_class;

public class OuterClassTest {

	public static void main(String[] args) {
		// 외부에서 내부클래스의 인스턴스를 생성한다.
		OuterClass outer = new OuterClass();
		
		//외부클래스명.내부 클래스명 참조변수명 = 외부클래스의 객체명.new 내부클래스 생성자;
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.innerMethod();

		outer.outerMethod();
	}

}
