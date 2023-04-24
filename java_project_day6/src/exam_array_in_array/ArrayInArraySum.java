package exam_array_in_array;

public class ArrayInArraySum {

	public static void main(String[] args) {
		// /* 이차원 배열의 가로, 세로, 대각선의 합 구하여 출력하시오. 
		/* 실행결과
		 *  ========  실행 전 ========
		  	10   10   10   10   0    
			30   30   30   30   0    
			40   40   40   40   0    
			50   50   50   50   0    
			0    0    0    0    0 

			======== 계산 후 ========
			10   10   10   10   40   
			30   30   30   30   120  
			40   40   40   40   160  
			50   50   50   50   200  
			130  130  130  130  130 	 
		 * 
		 * */
		
		int[][] arr = {
				{10,10,10,10,0},
				{30,30,30,30,0},
				{40,40,40,40,0},
				{50,50,50,50,0},
				{0,0,0,0,0}
		};
		
		System.out.println("========  실행 전 ========");
		for(int i =0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.printf("%2d  ",arr[i][j]);
			}
			System.out.println();
		}
		
		int sum;
		//가로의 합 구하기
		for(int i =0;i<arr.length-1;i++) {
			sum = 0;
			for(int j=0; j<arr[i].length;j++) {
				sum += arr[i][j];
				if(j==arr[i].length-1) {
					arr[i][j] = sum;
				}
			}
		}
				
		//세로 합 구하기
		for(int i =0;i<arr.length-1;i++) {
			sum = 0;
			for(int j=0; j<arr[i].length;j++) {
				sum += arr[j][i];
				if(j==arr.length-1) {
					arr[j][i] = sum;
				}
			}
		}
		
		//대각선의합 구하기
		sum = 0;
		for(int i =0;i<arr.length-1;i++) {
			for(int j=0; j<arr[i].length-1;j++) {
				if(i==j) {
					sum += arr[i][j];	
				}
			}
		}
		arr[4][4] = sum;
		
		
		//출력
		System.out.println("========  실행 후 ========");
		for(int i =0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.printf("%3d  ",arr[i][j]);
			}
			System.out.println();
		}

	}

}
