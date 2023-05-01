package exam_Q6;

public class Card {
	public static int serialNum = 1000;
	private int cardNum;
	private String cardNickName;
	
	public Card() {}
	
	public Card(String cardNickName) {
		serialNum++;
		this.cardNickName = cardNickName;
		this.cardNum = serialNum;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Card.serialNum = serialNum;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}

	public String getCardNickName() {
		return cardNickName;
	}

	public void setCardNickName(String cardNickName) {
		this.cardNickName = cardNickName;
	}
	
	public String toString() {
		return String.format("%s의 카드번호: %d", cardNickName,cardNum);
	}
	
}
