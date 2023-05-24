package phoneinfoproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import simplephoneinfo.MenuViewer;

public class PhoneBookManager implements Menu {
	static ObjectInputStream  in = null;
	static ObjectOutputStream out= null;

	private Set<PhoneInfo> infos;

	// 1. private 생성자 만들기
	private PhoneBookManager() {
		infos = new HashSet<PhoneInfo>();
	}

	// 2. 클래스 내부에 static으로 유일한 인스턴스 생성하기
	private static PhoneBookManager instance = null;

	// 3. 외부에서 참조할 수 있는 public 메서드 만들기
	public static PhoneBookManager getInstance() {
		if (instance == null) {
			instance = new PhoneBookManager();
		}
		return instance;
	}

	// 이름 입력
	public static String inputNameData() {
		System.out.println("검색할 이름을 입력하세요.");
		System.out.print("이름: ");
		return MenuViewer.keyboard.nextLine();
	}

	// 선택:일반
	private PhoneInfo readFriendInfo() {
		System.out.print("이름: ");
		String name = MenuViewer.keyboard.nextLine();

		System.out.print("전화번호 :");
		String phoneNumber = MenuViewer.keyboard.nextLine();

		return new PhoneInfo(name, phoneNumber);
	}

	// 선택:대학
	private PhoneInfo readUnivFriendInfo() {
		System.out.print("이름: ");
		String name = MenuViewer.keyboard.nextLine();

		System.out.print("전화번호 :");
		String phoneNumber = MenuViewer.keyboard.nextLine();

		System.out.print("전공 :");
		String major = MenuViewer.keyboard.nextLine();

		System.out.print("학년 :");
		int year = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine(); // nextLine 버퍼처리

		return new PhoneUnivInfo(name, phoneNumber, major, year);
	}

	// 선택:회사
	private PhoneInfo readCompFriendInfo() {
		System.out.print("이름: ");
		String name = MenuViewer.keyboard.nextLine();

		System.out.print("전화번호 :");
		String phoneNumber = MenuViewer.keyboard.nextLine();

		System.out.print("회사 :");
		String company = MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name, phoneNumber, company);
	}

	// 모든 항목 입력
	public PhoneInfo inputData(int inputMenu) throws InputMenuException{
		PhoneInfo info = null;

		if (inputMenu < NORMAL || COMP < inputMenu) {
			throw new InputMenuException(inputMenu);
		}
		
		// 1. 일반, 2. 대학, 3. 회사
		switch (inputMenu) {
		case NORMAL:
			info = readFriendInfo();
			break;
		case UNI:
			info = readUnivFriendInfo();
			break;
		case COMP:
			info = readCompFriendInfo();
			break;
		}
		

		System.out.println("데이터의 입력이 완료되었습니다.\n");
		return info;
	}

	// 입력된 이름에 객체찾기
	public PhoneInfo searchObj(String name) {
		Iterator<PhoneInfo> it = infos.iterator();
		while (it.hasNext()) {
			PhoneInfo info = it.next();
			if (info.getName().equals(name)) {
				return info;
			}
		}
		return null;
	}

	// 저장 : 이름, 전화번호, 생년월일 정보(PhoneInfo 클래스)를 대상으로 저장의 과정을 진행한다.
	public void saveInfo() throws InputMenuException {
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.println("선택>>");
		int inputMenu = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine(); // nextLine 버퍼처리

		infos.add(inputData(inputMenu));
	}

	// 검색
	public void searchInfo() {
		PhoneInfo obj = searchObj(inputNameData());
		if (obj == null) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			System.out.println(obj.showPhoneInfo());
		}
	}

	// 삭제 : 이름을 기준으로 데이터를 찾아서 삭제의 과정을 진행한다.
	public void deleteInfo() {
		String name = inputNameData();
		PhoneInfo obj = searchObj(name);

		if (obj == null) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			infos.remove(obj);
			System.out.println(name + "님 전화번호가 삭제 되었습니다.");
		}
	}

	// 모든 리스트 출력
	public void printAll() {
		Iterator<PhoneInfo> iterator = infos.iterator();
		while (iterator.hasNext()) {
			PhoneInfo infor = iterator.next();
			System.out.println("\t" + infor.toString());
		}
	}

	//전화번호부 정보는 PhoneBook.dat파일로 저장
	public void savePhoneBook() {
		try {
			out = new ObjectOutputStream(new FileOutputStream("PhoneBook.dat"));
			out.writeObject(infos);
			out.flush();
		}catch(IOException e) {
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(out!= null) out.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	// 프로그램이 다시 실행되면 파일에 저장된 데이터를 프로그램상으로 복원
	@SuppressWarnings("unchecked")
	public void loadInfos() {
		File file = new File("PhoneBook.dat");
		if(file.exists()) {
			try {
				in = new ObjectInputStream(new FileInputStream(file));
				infos = (Set<PhoneInfo>)in.readObject();
			} catch(ClassNotFoundException e) {
				System.out.println(e.getMessage());
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}finally {
				try {
					if(in!= null) in.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}else {
			System.out.println("작업할 파일이 존재하지 않습니다.");
		}
		
	};

}
