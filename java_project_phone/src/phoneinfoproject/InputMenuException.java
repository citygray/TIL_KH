package phoneinfoproject;

public class InputMenuException extends Exception {
	public InputMenuException(int num) {
		super(num+"에 해당하는 메뉴는 없습니다.");
	}
}
