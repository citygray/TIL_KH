package exam_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputStreamExample {

	public static void main(String[] args) {
		/* 
		 * C:/Temp/intest.txt 를 생성한다
		 * 해당 파일에는 아래의 내용이 저장되어 있다.
		 * 
		 * Hello World!
		 * My Name is IOStream
		 * 
		 * 이 내용을 읽어 C:/Temp/outtest.txt 파일을 생성해라
		 */
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:/Temp/img.jpg");
			fos = new FileOutputStream("C:/Temp/img_copy.jpg");
			int data =-1;
			
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("파일복사가 완료되었습니다.");
		} catch(FileNotFoundException fnf) {
			System.out.println("파일이 존재하지 않거나 경로가 틀림");
		} catch(IOException io) {
			System.out.println("파일 입출력에 문제가 발생하여 더이상 작업을 진행 할 수 없습니ㅏㄷ.");
		} catch(Exception e) {
			System.out.println("오류발생");
		} finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		/*
		
		
		(InputStream fis = new FileInputStream("C:/Temp/intest.txt")){
			int readByteNo;
			byte[] readBytes = new byte[5];
			
			while(true) {
				readByteNo = fis.read(readBytes);
				if(readByteNo == -1) break;
				data += new String(readBytes,0,readByteNo);
			}
			
			System.out.println(data);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try(OutputStream os = new FileOutputStream("C:/Temp/outtest.txt")){
			byte[] byteData = data.getBytes();
			os.write(byteData);
			System.out.println("파일이 생성되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
	}

}
