package simplephoneinfo;

public class PhoneBookVer01 {

	public static void main(String[] args) {
		PhoneInfo info1 = new PhoneInfo("임미경","010-1234-1234","1965.03.28");
		PhoneInfo info2 = new PhoneInfo("김현수","010-5555-1234");

		info1.showPhoneInfo();
		info2.showPhoneInfo();
	}

}
