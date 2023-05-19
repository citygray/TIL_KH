package exam_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileTwoTest {
	/*
	 * 주어진 2개의 텍스트파일(test.txt, result.txt)을 합하여
	 * 하나의 파일(writer.txt)로 만들어라 
	 */
	public static void main(String[] args) {
		
		BufferedReader reader1 = null;
		BufferedReader reader2 = null;
		Writer fw = null;
		
		try {
			reader1 = new BufferedReader(new FileReader("test.txt"));
			reader2 = new BufferedReader(new FileReader("result.txt"));
			
			fw = new FileWriter("writer.txt");
			/*
			String str1= null;
			while((str1 = reader1.readLine())!=null) {
				System.out.println(str1);
			}
			*/
			
			while(true) {
				String line = reader1.readLine();
				if(line == null) break;
				fw.write(line+"\n");
			}
			while(true) {
				String line = reader2.readLine();
				if(line == null) break;
				fw.write(line+"\n");
			}
			
			fw.flush();//writer는 내부적으로 버퍼를 가지고 있어서 flush해줘야함
			System.out.println("파일복사 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try{
				if(reader1 != null) reader1.close();
				if(reader2 != null) reader2.close();
				if(fw != null) fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
