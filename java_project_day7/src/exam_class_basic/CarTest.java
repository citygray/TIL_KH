package exam_class_basic;

public class CarTest {

	public static void main(String[] args) {

		Car car1 = new Car(0,1,"red");
		car1.speedUp(20);
		car1.printData();
		System.out.println(car1.toString());
		System.out.println();
		
		Car car2 = new Car(100,2,"black");
		car2.speedDown(50);
		System.out.println(car2.toString());
	}

}
