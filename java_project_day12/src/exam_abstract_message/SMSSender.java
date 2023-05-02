package exam_abstract_message;

public class SMSSender extends MessageSender {
	//public String title;
	//public String senderName;
	public String returnPhoneNo;
	public String message;
	
	SMSSender(){};
	
	SMSSender(String title,String senderName,String returnPhoneNo,String message){
		super(title,senderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	};
	
	
	@Override
	public void sendMessage(String details) {
		System.out.println("제목: "+super.title);
		System.out.println("보내는 사람: "+super.senderName);
		System.out.println("전화번호 : "+details);
		System.out.println("회신 전화번호: "+returnPhoneNo);
		System.out.println("메시지 내용: "+message);

	}

}
