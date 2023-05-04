package exam_interface;

public class AppCDInfo extends CDInfo implements Lendable {
	private String borrower;
	private String checkOutDate;
	private boolean state;//대출가능:false/대출불가:true

		
	AppCDInfo(String title){
		super(title);
	}
	
	public boolean isState() {
		return state;
	}
	
	@Override
	public void checkOut(String borrower, String date) {
		//대출
		if(this.state == true) {
			System.out.println("대출불가");
			return;
		}
		
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = true;
		
		System.out.printf("[관리번호: %d]%s CD 이(가) 대출되었습니다.\n",super.getRegisterNo(),super.getTitle());
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
		
		System.out.printf("%s CD 이(가) 반납되었습니다.\n\n",super.getTitle());
		

	}

}
