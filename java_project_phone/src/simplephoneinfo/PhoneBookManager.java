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
	

	//저장 : 이름, 전화번호, 생년월일 정보(PhoneInfo 클래스)를 대상으로 저장의 과정을 진행한다.
	public void saveInfo() {
		Infos[totalCount++] = inputData();
	}

	
	 
	//검색 : 이름을 기준으로 데이터를 찾아서 해당 데이터의 정보를 출력해준다.
	public void searchInfo() {
		System.out.println("검색할 이름을 입력하세요.");
		String name = inputNameData();
		for(int i =0;i<totalCount;i++) {
			if(Infos[i].getName().equals(name) ) {
				System.out.println("-----검색결과----");
				Infos[i].showPhoneInfo();
			}
		}
	}
	
	
	//삭제 : 이름을 기준으로 데이터를 찾아서 삭제의 과정을 진행한다.
	public void deleteInfo() {
		System.out.println("삭제할 이름을 입력하세요.");
		String name = inputNameData();
		
		
		int deleteIndex = 0;
		for(int i =0;i<totalCount;i++) {
			if(Infos[i].getName().equals(name) ) {
				System.out.println(name+"삭제");
				deleteIndex = i;
			}
		}
		
		for(int i = 0;i<totalCount;i++) {
			if(i==deleteIndex) {
				Infos[i] = Infos[i+1];
				deleteIndex++;
			}
		}
		
		totalCount--;
	}
	
	// 모든 리스트 출력
	public void printAll() {
		for(int i =0;i<totalCount;i++) {
			Infos[i].showPhoneInfo();
		}
	};
	
	
}
