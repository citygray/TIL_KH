package phoneinfoproject;

public class PhoneInfo {
	private String name;
	private String phoneNumber;
		
	//default 생성자
	PhoneInfo() {}
	
	
	//생성자 오버로딩
	PhoneInfo(String name,String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
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
	
	
	public String showPhoneInfo() {
		return String.format("name: %s\nphone: %s\n",getName(),getPhoneNumber());
	}
}
