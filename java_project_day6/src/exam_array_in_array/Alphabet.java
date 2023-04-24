package exam_array_in_array;

public class Alphabet {

	public static void main(String[] args) {
		//알파벳 소문자를 2글자씩 13줄
		int a = (int)'a';
		int[][] alphabet = new int[13][2];
		
		for(int i =0;i<alphabet.length;i++) {
			for(int j = 0; j<alphabet[i].length; j++) {
				alphabet[i][j] = a;
				a++;
			}
		}
		
		for(int i =0;i<alphabet.length;i++) {
			for(int j = 0; j<alphabet[i].length; j++) {
				
				System.out.print((char)alphabet[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
