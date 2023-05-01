package exam_inheritance2;

public class Customer {

	private String customerID;
	private String customerName;
	private String customerGrade;
	protected int bonusPoint;
	private double bonusRadio;
	
	Customer(){
		this.customerGrade = "SILVER";
		this.bonusRadio = 0.01;
	}
	//제품에 대해 지불해야하는 금액을 계산
	//할인 되지 않을 경우 가격을 그대로 반환
	//가격에 대해 보너스포인트 비율을 적용하여 보너스 포인트를 적립
	public int calcPrice(int price) {
		bonusPoint += price * bonusRadio;
		return price;
	}
	
	
	
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRadio() {
		return bonusRadio;
	}
	public void setBonusRadio(double bonusRadio) {
		this.bonusRadio = bonusRadio;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	//고객 정보 출력
	public String showCustomerInfo() {
		return customerName +"님의 등급은 "+customerGrade + "이며, 보너스 포인트는 "+bonusPoint+"입니다.";
	}
	
	
}
