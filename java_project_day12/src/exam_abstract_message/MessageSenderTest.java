package exam_abstract_message;

public class MessageSenderTest {

	public static void main(String[] args) {
		
		//SMSSender(String title,String senderName,String returnPhoneNo,String message){
		System.out.println("==================================");
		MessageSender msg1 = new SMSSender("생일을 축하합니다.","고객센터","02-000-0000","10% 할인쿠폰이 발행되었습니다");
		msg1.sendMessage("010-000-0000");

		System.out.println("==================================");
		
		//EmailSender(String title,String senderName,String senderAddr,String emailBody){
		EmailSender msg2 = new EmailSender("생일을 축하합니다.","고객센터","admin@dukeeshop.co.kr","10% 할인쿠폰이 발행되었습니다");
		msg2.sendMessage("nanee12@naver.com");
	}
	
	

}
