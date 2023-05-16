package phoneinfoproject;

import simplephoneinfo.MenuViewer;

public class PhoneBook {
	
	public static void main(String[] args) {
		// 4. 싱글톤 인스턴스 사용하는 코드 만들기
		PhoneBookManager mng = PhoneBookManager.getInstance();
				
		int inputMenu;
		while(true) {
			MenuViewer.showMenu();
			inputMenu = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine(); //nextLine 버퍼처리
			
			if(inputMenu==Menu.EXIT) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(inputMenu==Menu.LIST) {
				mng.printAll();
			}else if(inputMenu==Menu.INPUT) {
				//데이터 입력
				mng.saveInfo();
			}else if(inputMenu==Menu.SEARCH) {
				//데이터 검색
				mng.searchInfo();
			}else if(inputMenu==Menu.DELETE) {
				//데이터 삭제
				mng.deleteInfo();
			}else {
				System.out.println("멍충아 뭘 입력한거야!");
			}
		}
	}

}
