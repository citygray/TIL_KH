package phoneinfoproject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import simplephoneinfo.MenuViewer;

public class PhoneBookManager {
	
	private static final int MAX_CNT = 100;
	//private PhoneInfo[] infos;
	private Set<PhoneInfo> infos;
	private static int totalCount;

	//1. private 생성자 만들기
	private PhoneBookManager() {
		totalCount = 0;
		//infos = new PhoneInfo[MAX_CNT];
		infos = new HashSet<PhoneInfo>();
	}
	
	//2. 클래스 내부에 static으로 유일한 인스턴스 생성하기
	private static PhoneBookManager instance = null;
	
	//3. 외부에서 참조할 수 있는 public 메서드 만들기
	public static PhoneBookManager getInstance() {
		if(instance == null) {
			instance = new PhoneBookManager();
		}
		return instance;
	}
	
	
	//이름 입력
	public static String inputNameData() {
		System.out.println("검색할 이름을 입력하세요.");
		System.out.print("이름: ");
		return MenuViewer.keyboard.nextLine(); 
	}
	
	// 모든 항목 입력
	public PhoneInfo inputData(int inputMenu) {
		PhoneInfo info = null;
		System.out.print("이름: ");
		String name = MenuViewer.keyboard.nextLine();
		
		System.out.print("전화번호 :");
		String phoneNumber = MenuViewer.keyboard.nextLine();
		
		//1. 일반, 2. 대학, 3. 회사
		switch (inputMenu) {
		case InputMenu.NORMAL: 
			info = new PhoneInfo(name,phoneNumber);
			break;
		case InputMenu.UNI: 
			System.out.print("전공 :");
			String major = MenuViewer.keyboard.nextLine();
			
			System.out.print("학년 :");
			int year = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine(); //nextLine 버퍼처리
			info = new PhoneUnivInfo(name,phoneNumber,major,year);
			break;
		case InputMenu.COMP: 
			System.out.print("회사 :");
			String company = MenuViewer.keyboard.nextLine();
			info = new PhoneCompanyInfo(name,phoneNumber,company);
			break;
		default:
			System.out.println("멍충아 뭘 입력한거야!");
		}
		 
		System.out.println("데이터의 입력이 완료되었습니다.\n");
		return info;
	}
	
	//이름 검색 기능이 검색,삭제에서 중복
	//입력된 이름에 index 찾기 
	public PhoneInfo searchIndex(String name) {
		/*
		for(int i =0;i<totalCount;i++) {
			if(infos[i].getName().equals(name) ) {
				return i;
			}
		}
		return -1;// 이름 없을 시 -1 반환
		*/
		
		Iterator<PhoneInfo> it = infos.iterator();
		while(it.hasNext()) {
			PhoneInfo info = it.next();
			if(info.getName().equals(name) ) {
				return info;
			}
			
		}
		return null;
		
	}
	

	//저장 : 이름, 전화번호, 생년월일 정보(PhoneInfo 클래스)를 대상으로 저장의 과정을 진행한다.
	public void saveInfo() {
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.println("선택>>");
		int inputMenu = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine(); //nextLine 버퍼처리
		
		//infos[totalCount++] = inputData(inputMenu);
		infos.add(inputData(inputMenu));
	}

	
	 
	//검색 
	public void searchInfo() {
		PhoneInfo obj = searchIndex(inputNameData());
		if(obj == null) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		}else {
			System.out.println(obj.showPhoneInfo());
		}
	}
	
	
	//삭제 : 이름을 기준으로 데이터를 찾아서 삭제의 과정을 진행한다.
	public void deleteInfo() {
		String name = inputNameData();
		PhoneInfo obj =  searchIndex(name);
		
		if(obj == null) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		}else {
			infos.remove(obj);
			System.out.println(name+"님 전화번호가 삭제 되었습니다.");
//			totalCount--;
		}
	}
	
	// 모든 리스트 출력
	public void printAll() {
//		for(int i =0;i<totalCount;i++) {
//			System.out.println(infos[i].showPhoneInfo());
//		}
		
		Iterator<PhoneInfo> iterator = infos.iterator();
		while(iterator.hasNext()) {
			PhoneInfo infor = iterator.next();
			System.out.println("\t" + infor.toString());
		}
		
		
		
	};
	
	
}
