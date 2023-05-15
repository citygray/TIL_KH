package exam_object_stream;

import java.io.Serializable;

public class Account implements Serializable{
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public Account() {}
	
	public Account(String accountNo, String ownerName,int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return String.format("계좌번호:%s\n예금주:%s\n금액:%d",accountNo,ownerName,balance);
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
