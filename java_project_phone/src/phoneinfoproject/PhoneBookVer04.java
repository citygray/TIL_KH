package phoneinfoproject;

import simplephoneinfo.MenuViewer;

public class PhoneBookVer04 {
	
	public static void main(String[] args) {
		
		PhoneBookManager mng = new PhoneBookManager();
		 
		
		int inputMenu;
		while(true) {
			MenuViewer.showMenu();
			inputMenu = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine(); //nextLine 버퍼처리
			
			if(inputMenu==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(inputMenu==0) {
				mng.printAll();
			}else if(inputMenu==1) {
				//데이터 입력
				mng.saveInfo();
			}else if(inputMenu==2) {
				//데이터 검색
				mng.searchInfo();
			}else if(inputMenu==3) {
				//데이터 삭제
				mng.deleteInfo();
			}else {
				System.out.println("멍충아 뭘 입력한거야!");
			}
		}
		
		
	}

}
