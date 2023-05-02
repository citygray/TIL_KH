package exam_abstract_car;

/*=== 사람이 운전하는 자동차 ===
시동을 켭니다
사람이 운전합니다
사람이 핸들을 조작합니다
브레이크로 정지합니다
시동을 끕니다.*/

public class ManualCar extends Car{
	
	public void drive() {
		System.out.println("사람이 운전합니다");
		System.out.println("사람이 핸들을 조작합니다");
	};
	public void stop() {
		System.out.println("브레이크로 정지합니다.");
	};

}
