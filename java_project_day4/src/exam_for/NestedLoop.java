package exam_for;

public class NestedLoop {

	public static void main(String[] args) {
		/*
		for(int i =2;i<=9;i++) {
			for(int j =1; j<=9;j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
		*/
		for(int i =1;i<=9;i++) {
			for(int j =2; j<=9;j++) {
				System.out.printf("%d * %d = %2d\t",j,i,i*j);
			}
			System.out.println();
		}

	}

}
