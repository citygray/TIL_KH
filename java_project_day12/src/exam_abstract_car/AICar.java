package exam_abstract_car;
/*
 * 
=== 자율주행 하는 자동차 ===
시동을 켭니다
자율 주행합니다
자동차가 스스로 방향을 전환합니다.
스스로 멈춥니다.
시동을 끕니다.
 */
public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행합니다");
        System.out.println("자동차가 스스로 방향을 전환합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
		
	}
//	public void drive() {
//		System.out.println("자율 주행합니다");
//		System.out.println("자동차가 스스로 방향을 전환합니다.");
//	};
//	public void stop() {
//		System.out.println("스스로 멈춥니다.");
//	}; 

}
