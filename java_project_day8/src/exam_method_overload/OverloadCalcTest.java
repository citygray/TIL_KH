package exam_method_overload;

public class OverloadCalcTest {

	public static void main(String[] args) {
		OverloadCalc calc = new OverloadCalc();
		
		int i = calc.plus(3,5);
		System.out.println("int의 합 : "+i+"\n");

		float j = calc.plus(1.5f,3.2f);
		System.out.println("float의 합 : "+j+"\n");

		double k = calc.plus(2.4,4.5);
		System.out.println("double의 합 : "+k+"\n");

		
		int num = calc.plus(5,3,8,9,2);
		System.out.println("가변길이 메서드 호출에 의한 합 : "+num+"\n");

		int[] values = {1,2,3};
		int result = calc.plusInt(values);
		System.out.println("\n배열을 매개변수로 갖는 메서드 호출에 의한 합1 : "+result+"\n");
		
		
		int result2 = calc.plusInt(new int[]{1,2,3,4,5,6});
		System.out.println("\n배열을 매개변수로 갖는 메서드 호출에 의한 합2 : "+result2+"\n");

	}

}
