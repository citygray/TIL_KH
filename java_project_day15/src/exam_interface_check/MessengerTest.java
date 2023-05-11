package exam_interface_check;

public class MessengerTest {

	public static void main(String[] args) {
		//Messenger msg = new Messenger(); //인터페이스도 인스턴스를 생성할 수 없다.
		
		IPhoneMessenger iphone = new IPhoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		System.out.println("메신저 최소 문자 크기: "+ Messenger.MIN_SIZE);
		System.out.println("메신저 최대 문자 크기: "+ Messenger.MAX_SIZE);
		
		iphone.setLogin(true);
		System.out.println(iphone.getMessage());
		iphone.setMessage("안녕~~");
		iphone.clearMessage();
		
		iphone.draw_textBox();
		iphone.draw_submitButton();
		
		galaxy.setLogin(true);
		System.out.println(galaxy.getMessage());
		galaxy.setMessage("반가워 갤럭시");
		galaxy.changeKeyboard();
		
		galaxy.fileUpload();
		galaxy.fileDownload();
		
		galaxy.setLogin(false);

	}

}
