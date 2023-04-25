package exam;

public class CardExample {

	public static void main(String[] args) {
		/*
		 * 카드를 랜덤하게 선택하여 화면에 출력하는 코드를 작성해보자
		 * {"Clubs","Diamonds","Hearts","Spades"}와
		 * {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"}를 
		 * 가지고 문자열 배열을 생성하고 위 내용으로 부터 랜덤하게 하나의 카드를 선택하는 코드를 작성하라.
		 * 실행결과 :  Hearts의 Jack
		 */
		Card card1 = new Card();
		card1.printCard();
	}
}

class Card{
	private final String[] shape = {"Clubs","Diamonds","Hearts","Spades"};
	private final String[] number =  {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	
		
	private int randomNum(int arrLeng) {
		return (int)(Math.random()*arrLeng);
	}
	
	public void printCard() {
		int shapeIndex = randomNum(shape.length); 
		int numberIndex = randomNum(number.length);
		
		System.out.println(shape[shapeIndex]+"의 "+number[numberIndex]);
	} 
}
