package phoneinfoproject;

public class PhoneCompanyInfo extends PhoneInfo {
	private String company;
	
	PhoneCompanyInfo(){};
	
	PhoneCompanyInfo(String name,String phoneNumber,String company) {
		super(name,phoneNumber);
		this.company = company;
	};
	
	
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String showPhoneInfo() {
		return super.showPhoneInfo()+String.format("company: %s\n",company);
	}
}
