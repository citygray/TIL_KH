package exam_class_array;

class Car{
	private int speed;
	private int gear;
	private String color;
	
	public Car() {
		speed = 80;
		gear = 1;
		color = "red";
	}
	
	public void speedUp() {
		speed += 10;
	}
	
	public String toString() {
		return "속도: "+ speed+ "기어: "+gear+"색상: "+color;
	}
}


public class CarArrayObject {

	public static void main(String[] args) {

		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS];
		
		for(int i =0; i<cars.length;i++) cars[i] = new Car();
		for(int i =0; i<cars.length;i++) cars[i].speedUp();
		for(int i =0; i<cars.length;i++) System.out.println(cars[i]);
	}

}
