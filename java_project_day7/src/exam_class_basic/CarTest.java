package exam_class_basic;

public class CarTest {

	public static void main(String[] args) {

		Car car1 = new Car(0,1,"red");
		car1.setSpeed(50);
		car1.speedUp(20);
		car1.setGear(-1);
		System.out.println("기어만: "+car1.getGear());
		car1.printData();
		System.out.println(car1.toString());
		System.out.println();
		
		Car car2 = new Car(100,2,"black");
		car2.speedDown(50);
		System.out.println(car2.toString());
		
		Car car3 = new Car();
		System.out.println("default생성자로 생성: "+car3.toString());
	}

}
