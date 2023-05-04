package exam_interface;

public class SeparateVolume implements Lendable {
	private static int requestNo = 0;
	private String bookTitle;
	private String writer;
	private String borrower;
	private String checkOutDate;
	private boolean state;
	
	
	SeparateVolume(String bookTitle,String writer){
		requestNo++;
		this.bookTitle = bookTitle;
		this.writer = writer;
	};
	
	

	public boolean isState() {
		return state;
	}

	@Override
	public void checkOut(String borrower, String date) {
		if(this.state == true) {
			System.out.println("대여중입니다.");
			return;
		}
		
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = true;
		
		System.out.printf("[청구번호: %d]%s(%s) 이(가) 대출되었습니다.\n",requestNo,bookTitle,writer);
		System.out.printf("대출인 : %s\n",borrower);
		System.out.printf("대출일 : %s\n\n",date);
	}

	@Override
	public void checkIn() {
		if(this.state == false) {
			System.out.println("이미 반납되었습니다.");
			return;
		}
		this.borrower = null;
		this.checkOutDate = null;
		this.state = false;
		System.out.printf("%s(%s) 이(가) 반납되었습니다.\n\n",bookTitle,writer);
		
	}

}
