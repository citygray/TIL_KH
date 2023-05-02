package exam_abstract_message;

public abstract class MessageSender {
	public String title;
	public String senderName;
	
	MessageSender(){};
	
	MessageSender(String title,String senderName){
		this.title = title;
		this.senderName = senderName;
	}
	
	public abstract void sendMessage(String details);

}
