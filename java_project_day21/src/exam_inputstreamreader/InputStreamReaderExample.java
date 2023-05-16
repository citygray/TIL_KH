package exam_inputstreamreader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	//InputStreamReader 바이트스트림 -> 문자스트림 
	// 다른 컴퓨터(외부 바이트데이터)랑 데이터를 주고 받을때 바이트로 전송하므로
	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		/*
		int readCharNo;
		String data;
		char[] cbuf = new char[10];
		System.out.println("문자를 입력해 주세요");
		
		while((readCharNo = reader.read(cbuf)) != -1) {
			data = new String(cbuf, 0, readCharNo-2);
			System.out.println(data);
		}*/
		
		BufferedReader br = new BufferedReader(reader);
		String str;
		System.out.println("문자를 입력해주세요");
		while((str= br.readLine())!= null) {
			System.out.println(str);
		}
		
		
		reader.close();
	}

}
