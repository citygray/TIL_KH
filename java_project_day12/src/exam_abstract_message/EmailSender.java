package exam_abstract_message;

public class EmailSender extends MessageSender {
	
//	public String title;
//	public String senderName;

	public String senderAddr;
	public String emailBody;
	
	EmailSender(){};
	
	EmailSender(String title,String senderName,String senderAddr,String emailBody){
		super(title,senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	};
	
	
	
	@Override
	public void sendMessage(String emailAdd) {
		System.out.println("제목: "+super.title);
		System.out.println("보내는 사람: "+super.senderName+" "+senderAddr);
		System.out.println("받는 사람: "+emailAdd);
		System.out.println("내용: "+emailBody);
	}

}
