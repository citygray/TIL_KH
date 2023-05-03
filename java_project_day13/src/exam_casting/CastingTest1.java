package exam_casting;

public class CastingTest1 {

	public static void main(String[] args) {

		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		//car.water();
		fe2 = (FireEngine) car;
		fe2.water();
		
		car = new Car();
		
		//instranceof 연산자
		// 참조 변수가 참조하는 인스턴스의 실제 타입을 체크하는데 사용
		if(fe instanceof FireEngine) {
			System.out.println("fe instanceof FireEngine");
		}
		if(fe instanceof Car) {
			System.out.println("fe instanceof Car");
		}
		if(fe2 instanceof FireEngine) {
			System.out.println("fe2 instanceof FireEngine");
		}
		
	}

}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!");
	}
}