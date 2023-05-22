package exam_file_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileReaderTest {
	public static void main(String[] args) {
		/*
		 * "test.txt" 파일에 "가장 위대한 영관은 한 번도 실패하지 않음이 아니라 실패할 때 마다 다시 일어서는데에 있다."라는
		 * 글을 저장하고 -> 문자 출력 스트림
		 * 이 파일의 내용을 읽어 -> 문자입력 스트림
		 * 콘솔에 출력
		 */
		Writer fw = null;
		BufferedReader in = null;
		try {
			fw = new FileWriter("test.txt");
			fw.write("가장 위대한 영관은 한 번도 실패하지 않음이 아니라 실패할 때 마다 다시 일어서는데에 있다.");
			fw.flush();
			
			in = new  BufferedReader(new FileReader("test.txt"));
			
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(fw != null) fw.close();
				if(in != null) in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
	}

}
