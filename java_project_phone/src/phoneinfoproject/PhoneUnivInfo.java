package phoneinfoproject;

public class PhoneUnivInfo extends PhoneInfo {

	private String major;
	private int year;
	
	PhoneUnivInfo(){};
	
	PhoneUnivInfo(String name,String phoneNumber,String major,int year) {
		super(name,phoneNumber);
		this.major = major;
		this.year = year;
	};
	
	
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String showPhoneInfo() {
		return super.showPhoneInfo()+String.format("major: %s\nyear: %d\n",major,year);
	}
	
}
