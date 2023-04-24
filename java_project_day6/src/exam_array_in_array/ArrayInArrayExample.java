package exam_array_in_array;

public class ArrayInArrayExample {

	public static void main(String[] args) {

		/*
		int[][] arr = {{1,2,3},{4,5,6}};
		for(int i= 0;i<arr.length;i++ ) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
		*/
		
		//2차원 배열(가변 배열)
		/*
		int[][] arr2 = new int[2][];
		arr2[0] = new int[] {1,5};
		arr2[1] = new int[3];
		*/
		
		
		/*
		 * 오른쪽 대각선 순회하는 2차원 배열에 원하는 요소들만 접근하기 위한 예제이다.
		 * 다음 2차원 배열에서 색칠된 부분의 함?
		 */
		
		int[][] arr3 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int sum =0;
		for(int i =0; i<arr3.length;i++) {
			for(int j =0;j<arr3[i].length;j++) {
				System.out.printf("%2d ",arr3[i][j]);
				//if(i==j) sum += arr3[i][j];
				if(j<=i) sum += arr3[i][j];
				
			} 
			System.out.println();
		}
		
		System.out.println("합계는 "+sum);

	}

}
