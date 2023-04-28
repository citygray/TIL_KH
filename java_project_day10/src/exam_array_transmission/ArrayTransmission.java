package exam_array_transmission;

// 배열을 선언한다. 그 배열을 출력할 수 있는 메서드를 정의하여 출력하도록 프로그램을 작성한다.
public class ArrayTransmission {

	public static void main(String[] args) {
		//배열 선언 및 생성
		int[] array;
		array = getData();
		//배열의 값 출력
		printData(array);
		

	}
	
	//배열생성
	public static int[] getData() {
		return new int[] {10,20,30,40,50};
	}
	
	//배열의 값 출력
	public static void printData(int[] array) {
		for(int i =0; i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
