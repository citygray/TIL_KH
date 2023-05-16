package exam_reader;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadExample {

	public static void main(String[] args) throws Exception{
		/*
		Reader reader = new FileReader("test.txt");
		int readData;
		
		while(true) {
			readData = reader.read();
			if(readData == -1) break;
			System.out.print((char)readData);
		}
		*/
		
		/*
		Reader reader = new FileReader("test.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		
		String data = "";
		while(true) {
			readCharNo = reader.read(cbuf);
			if(readCharNo == -1) break;
			data += new String(cbuf,0,readCharNo);
		}
		System.out.println(data);
		*/
		
		// 가장 많이 사용함
		// 문자를 읽어 오고자 할때 BufferedReader의 readLine()메서드 이용
		BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
		String str = null;
		while((str = reader.readLine())!= null) {
			System.out.println(str);
		}
		
		reader.close();

	}

}
