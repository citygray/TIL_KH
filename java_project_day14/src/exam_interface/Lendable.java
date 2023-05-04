package exam_interface;

public interface Lendable {

	public abstract void checkOut(String borrower,String date); //대출 관련메서드
	void checkIn();//반납 관련메서드
	
}
