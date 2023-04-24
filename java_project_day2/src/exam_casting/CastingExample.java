package exam_casting;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 65;
		System.out.println((char)intValue); //A
		
		long longValue = 500L;
		intValue = (int)longValue;
		System.out.println(intValue);//500
		
		double doubleValue = 500L;
		intValue = (int)doubleValue;
		System.out.println(intValue);//500
		
		int result;
		double resultDouble;
		
		result = 3/2;
		System.out.println(result);//1
		
		resultDouble = 3/2;
		System.out.println(resultDouble);//1.0
		
		resultDouble = (double)3/2;
		System.out.println(resultDouble); //1.5

	}

}
