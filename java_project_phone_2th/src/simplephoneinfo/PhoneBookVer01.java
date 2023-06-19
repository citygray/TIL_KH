package simplephoneinfo;

public class PhoneBookVer01 {

	public static void main(String[] args) {
		PhoneInfo pInfo1 = new PhoneInfo("임미경","010-2345-6873","1965.03.28");
		PhoneInfo pInfo2 = new PhoneInfo("김현수","010-6435-1249");
		
		pInfo1.showPhoneInfo();
		pInfo2.showPhoneInfo();

	}

}
