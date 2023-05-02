package exam_inheritance2;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	
	public VIPCustomer() {
	}
	
	public VIPCustomer(String customerID, String customerName,int agentID) {
		super(customerID,customerName);
		customerGrade="VIP";
		bonusRadio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	//calcPrice 오버라이딩
	public int calcPrice(int price) {
		//super.setBonusPoint((int)(price * super.getBonusRadio()));
		bonusPoint += price * bonusRadio;
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
