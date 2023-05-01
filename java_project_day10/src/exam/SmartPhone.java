package exam;
/*
	스마트폰을 구입하려고 한다. SmartPhone 클래스의 생성자를 이용하여 객체를 생성하고 모든 종류와 할인 정보를 출력한다. 
	아래 UML을 기준으로 SmartPhone 클래스를 생성하자. 
	각 멤버 변수(필드)는 제조사 maker, 명칭 name, 가격 price, 할인율 discountRate로 지정한다. 
	생성자, 설정자, 접근자 등을 작성해 주면 된다.
	실행 클래스 내에 main() 메서드를 실행하여 다음과 같은 결과가 나올 수 있도록 구현하시오.
 */
public class SmartPhone {
	private String maker;
	private String name;
	private int price;
	private int discountRate;
	
	SmartPhone(){};
	
	SmartPhone(String maker, String name, int price){
		this.maker = maker;
		this.name = name;
		this.price = price;
	}
	
	SmartPhone(String maker, String name, int price, int discountRate){
		this(maker, name, price);
		this.discountRate = discountRate;
	}

	public int calculateDiscount() {
		return price-(int)(price*discountRate)/100;
	}
	
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	
}
