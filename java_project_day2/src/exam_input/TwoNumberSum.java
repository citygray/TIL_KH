package exam_input;

//[요구사항] 입력한 두개의 숫자를 더해서 출력하는 프로그램을 작성하시요.
import java.util.Scanner;
public class TwoNumberSum {
	//메인 메서드에서 부터 실행
	public static void main(String args[]) {
		//클래스 참조변수 = 메모리할당연산자 생성자(초기값)
		Scanner input = new Scanner(System.in);
		int x,y;
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		x = input.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요: ");
		y = input.nextInt();
		
		System.out.printf("두 수의 합은 %d",x+y);
		
		input.close();
	}
}
