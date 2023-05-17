package exam_try_catch_finally;

public class DivideByZeroTest {

	public static void main(String[] args) {
		try {
			int x = 1,y =0;
			int result = x/y; //ArithmeticException발생
			System.out.println("result:"+result);
		}catch(ArithmeticException a) {
			System.out.println("0으로 나눌수 없습니다.");
		}
	}
}
