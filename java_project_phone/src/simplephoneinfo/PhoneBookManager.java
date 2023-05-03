package simplephoneinfo;


public class PhoneBookManager {
	
	private static final int MAX_CNT = 100;
	PhoneInfo[] Infos;
	private static int totalCount;

	public PhoneBookManager() {
		totalCount = 0;
		Infos = new PhoneInfo[MAX_CNT];
	}
	
	//이름 입력
	public static String inputNameData() {
		System.out.println("검색할 이름을 입력하세요.");
		System.out.print("이름: ");
		return MenuViewer.keyboard.nextLine(); 
	}
	
	// 모든 항목 입력
	public PhoneInfo inputData() {
		PhoneInfo info = new PhoneInfo();
		
		System.out.print("이름: ");
		info.setName(MenuViewer.keyboard.nextLine());
		
		System.out.print("전화번호 :");
		info.setPhoneNumber(MenuViewer.keyboard.nextLine());
		
		System.out.print("생년월일 :");
		info.setBirthday(MenuViewer.keyboard.nextLine());
		
		return info;
	}
	
	//이름 검색 기능이 검색,삭제에서 중복
	//입력된 이름에 index 찾기 
	public int searchIndex(String name) {
		for(int i =0;i<totalCount;i++) {
			if(Infos[i].getName().equals(name) ) {
				return i;
			}
		}
		return -1;// 이름 없을 시 -1 반환
	}
	

	//저장 : 이름, 전화번호, 생년월일 정보(PhoneInfo 클래스)를 대상으로 저장의 과정을 진행한다.
	public void saveInfo() {
		Infos[totalCount++] = inputData();
	}

	
	 
	//검색 
	public void searchInfo() {
		Infos[searchIndex(inputNameData())].showPhoneInfo();
	}
	
	
	//삭제 : 이름을 기준으로 데이터를 찾아서 삭제의 과정을 진행한다.
	public void deleteInfo() {
		String name = inputNameData();
		int deleteIndex =  searchIndex(name);
		
		for(int i = 0;i<totalCount;i++) {
			if(i==deleteIndex) {
				Infos[i] = Infos[i+1];
				deleteIndex++;
			}
		}
		System.out.println(name+"님 전화번호가 삭제 되었습니다.");
		totalCount--;
	}
	
	// 모든 리스트 출력
	public void printAll() {
		for(int i =0;i<totalCount;i++) {
			Infos[i].showPhoneInfo();
		}
	};
	
	
}
