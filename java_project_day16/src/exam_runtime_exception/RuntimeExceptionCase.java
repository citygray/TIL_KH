package exam_runtime_exception;

public class RuntimeExceptionCase {

	public static void main(String[] args) {
		//RuntimeException 종류 - 비체크 예외
		
		//ArrayIndexOutOfBoundsException예외 발생
		try {
			int[] arr = new int[3];
			arr[4] = 20;
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	
		//ClassCastException 발생
		try {
			Object x = Integer.valueOf(0);
			System.out.println((String)x);
		}catch(ClassCastException e) {
			e.printStackTrace();
		}

		//NegativeArraySizeException
		try {
			int[] arr = new int[-10];
			System.out.println(arr.toString());
		}catch(NegativeArraySizeException e) {
			e.printStackTrace();
		}
	}

}
