package exam_interface;

public interface MyInterface {//인터페이스
	public void print();
}

class MyClass1 implements MyInterface{//구현클래스
	@Override
	public void print() {
		System.out.println("MyClass1");
	}
}

class MyClass2 implements MyInterface{
	@Override
	public void print() {
		System.out.println("MyClass2");
	}
}
