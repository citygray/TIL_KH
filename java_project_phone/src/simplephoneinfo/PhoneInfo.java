package simplephoneinfo;

public class PhoneInfo {

	/*
		클래스의 이름은 PhoneInfo 이다. 그리고 클래스에는 데이터들의 문자열의 형태로 저장 가능해야 하며, 저장된 데이터의 출력이 가능하도록 메소드도 정의한다.

	- 이름           name           String
	- 전화번호        phoneNumber    String
	- 생년월일        birthday       String
	
	단 생년월일 정보는 저장할 수도, 저장하지 않을 수도 있게 생성자를 정의한다.
	 
	
	[실행 예시]
	name: 임미경
	phone: 010-2345-6573
	birth: 1965.03.28
	
	name: 김현수
	phone: 011-6435-1249
	birth: 
	
	*/
	
	private String name;
	private String phoneNumber;
	private String birthday;
	
	//default 생성자
	PhoneInfo() {}
	
	//생성자 오버로딩
	PhoneInfo(String name,String phoneNumber) {
		this(name,phoneNumber,null);
	}
	//생성자 오버로딩
	PhoneInfo(String name,String phoneNumber,String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public void showPhoneInfo() {
		String str;
		if(birthday==null) {
			str = String.format("name: %s\nphone: %s\n",getName(),getPhoneNumber());
		}else {
			str = String.format("name: %s\nphone: %s\nbirth: %s\n",getName(),getPhoneNumber(),getBirthday());
		}
		 
		System.out.println(str);
	}
}
