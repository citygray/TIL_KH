package exam;

public class Exam1 {

	public static void main(String[] args) {
		int[] arr = {90,20,50,70,65,90,100,43,55,87};
		
		for(int i = 0;i<arr.length;i++) {
			System.out.printf("%3d점 : ",arr[i]);
			for(int j = 0;j<=arr[i];j=j+10) {
				//System.out.print(j);
				System.out.print("■");
			}
			System.out.println();
		}
	}
}
