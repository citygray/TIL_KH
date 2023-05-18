package exam_user_define_exception;

//사용자 정의 예외 클래스 선언
public class DivideByZeroException extends Exception {
	private String msg;
	
	public DivideByZeroException() {}
	
	public DivideByZeroException(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		if(msg == null) {
			return "0으로 나눌수는 없음";
		}else {
			return msg;
		}
	}
}
