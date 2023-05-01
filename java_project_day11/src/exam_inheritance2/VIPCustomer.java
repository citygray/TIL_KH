package exam_inheritance2;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	
	public VIPCustomer() {
		super.setCustomerGrade("VIP");
		super.setBonusRadio(0.05);
		this.saleRatio = 0.1;
	}

	//calcPrice 오버라이딩
	public int calcPrice(int price) {
		super.setBonusPoint((int)(price * super.getBonusRadio()));
		return price - (int)(price*saleRatio);
	}

	public int getAgentID() {
		return agentID;
	}


	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}


	public double getSaleRatio() {
		return saleRatio;
	}


	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	
}
