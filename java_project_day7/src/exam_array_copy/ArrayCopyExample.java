package exam_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		//향상된 for문
		for(String str: newStrArray) {
			System.out.print(str+", ");
		}
		System.out.println();
		
		
		
		int myArray[] = {100,200,300,400,500};
		int hold[] = {10,9,8,7,6,5,4,3,2,1};
		
		System.out.println("===myArray의 배열값==");
		for(int num:myArray) {
			System.out.print(num+" ");
		}
		System.out.println();

		System.out.println("===hold의 배열값==");
		for(int num:hold) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		System.arraycopy(myArray,0,hold,0,myArray.length);
		
		System.out.println("===arraycopy result==");
		for(int num:hold) {
			System.out.print(num+" ");
		}
		System.out.println();
		
	}

}
