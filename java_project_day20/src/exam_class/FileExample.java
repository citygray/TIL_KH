package exam_class;

import java.io.*;
import java.util.TreeSet;

public class FileExample {

	public static void main(String[] args) {
		/*
		 * 랜덤 메서드나 랜덤클래스 등을 이용하여 
		 * 정수 10개(각자 임의의 수)를 문자열의 형태로 들어있는 있는(input.txt)을 생성한다. 
		 * 생성된 파일을 읽어서 오름차순으로 정렬한 다음 정렬된 숫자를 문자열의 형태로 파일(output.txt)프로그램을 작성하라
		 */
		
		//TreeSet<Integer> set = new TreeSet<Integer>();
		
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("input.txt"));
			String str = "";
			for(int i=0;i<10;i++) {
				int ranNum = (int)(Math.random()*300)+1;
				str += ranNum + "\r\n";
				out.write(str.getBytes());	
			}
			
			System.out.println("input.txt 생성되었습니다.");
			out.flush();
		}catch(IOException io) {
			io.printStackTrace();
		}finally {
			try {
				if(out!= null) {out.close();}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
