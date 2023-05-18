package phoneinfoproject;

import simplephoneinfo.MenuViewer;


public class PhoneBook implements Menu{
	
	public static void main(String[] args){
		// 4. 싱글톤 인스턴스 사용하는 코드 만들기
		PhoneBookManager mng = PhoneBookManager.getInstance();
				
		int inputMenu;
		
			while(true) {
				try {
					MenuViewer.showMenu();
					inputMenu = MenuViewer.keyboard.nextInt();
					MenuViewer.keyboard.nextLine(); //nextLine 버퍼처리
					
					//예외 객체 생성
					if(inputMenu< LIST || EXIT < inputMenu) {
						throw new InputMenuException(inputMenu);
					}
					
					if(inputMenu==EXIT) {
						System.out.println("프로그램을 종료합니다.");
						break;
					}else if(inputMenu==LIST) {
						mng.printAll();
					}else if(inputMenu==INPUT) {
						//데이터 입력
						mng.saveInfo();
					}else if(inputMenu==SEARCH) {
						//데이터 검색
						mng.searchInfo();
					}else if(inputMenu==DELETE) {
						//데이터 삭제
						mng.deleteInfo();
					}
				} catch(InputMenuException e) {
					System.out.println(e.getMessage());
					System.out.println("메뉴를 다시 선택합니다.");
				}
			}
		
		
	}

}
