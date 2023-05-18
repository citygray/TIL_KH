package exam_class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class FileExample {
		public static void main(String[] args) {
		/*
		 * 랜덤 메서드나 랜덤클래스 등을 이용하여 
		 * 정수 10개(각자 임의의 수)를 문자열의 형태로 들어있는 있는(input.txt)을 생성한다. 
		 * 생성된 파일을 읽어서 오름차순으로 정렬한 다음 정렬된 숫자를 문자열의 형태로 파일(output.txt)프로그램을 작성하라
		 */
		
		//랜덤 메서드나 랜덤클래스 등을 이용하여 
		//정수 10개(각자 임의의 수)를 문자열의 형태로 들어있는 있는(input.txt)을 생성한다. 				
		try {
			Writer writer = new FileWriter("input.txt");
			StringBuffer sb = new StringBuffer();
			
			for(int i =0; i<10;i++) {
				sb.append((int)(Math.random()*300)+1) ;
				if(i!=9) {sb.append(",");};
			}
			writer.write(sb.toString());
			
			System.out.println("input.txt파일 출력 완료");
			writer.flush();
			writer.close();
		}catch(IOException io) {
			io.printStackTrace();
		}
		
		//생성된 파일을 읽기
		String str = "";
		try {
			BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
			str=reader.readLine();
			reader.close();
		}catch(IOException io) {
			io.printStackTrace();
		}
		
		//오름차순으로 정렬
		String[] strArr = str.split(",");
		int strArrLeng = strArr.length;
		int[] intArr = new int[strArrLeng];
		for(int i=0;i<strArrLeng;i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		Arrays.sort(intArr);
		System.out.println("오름차순 정렬된 배열: "+Arrays.toString(intArr));
		
		
		//정렬된 숫자를 문자열의 형태로 파일(output.txt)프로그램을 작성
		try {
			Writer writer = new FileWriter("output.txt");
			StringBuffer sb = new StringBuffer();
			
			for(int i =0; i<strArrLeng;i++) {
				sb.append(intArr[i]) ;
				if(i!=9) {sb.append(",");};
			}
			writer.write(sb.toString());
			
			System.out.println("output.txt파일 출력 완료");
			writer.flush();
			writer.close();
		}catch(IOException io) {
			io.printStackTrace();
		}
		
	}

}
