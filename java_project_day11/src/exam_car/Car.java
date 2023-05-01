package exam_car;

public class Car {
	private String color;
	private int account;
	
	Car(){};
	
	Car(String color,int account){
		this.account = account;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public int getAccount() {
		return account;
	};
	
	public String toString() {
		return String.format("[색상] %s\t[생산수량] %d\t",color,account);
	}

}
