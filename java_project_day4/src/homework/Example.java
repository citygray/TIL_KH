package homework;

public class Example {

	public static void main(String[] args) {
		/*
		 * [요구사항]
			곱셈은 덧셈을 편리하게 하기 위해 등장한 연산이다. 덧셈으로 곱셈을 하는 코드를 작성하시오.
			3 * 9 일 경우, 3을 9번 더하는 것과 9를 3번 더하는 것 중 어느 것이 효율적인가?
		 */
		
		int num1 = 3;
		int num2 = 9;
		int result = 0;
		
		for(int i = 0;i<num2;i++) {
			result += num1;
		}
		System.out.println(result);
		
		
	}

}
