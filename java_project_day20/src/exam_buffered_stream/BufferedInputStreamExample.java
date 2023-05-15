package exam_buffered_stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		BufferedInputStream bis = null;
		long start = 0;
		long end = 0;
		
		try {
			
			//버퍼 없이 input
			fis1 = new FileInputStream("C:/images/img.jpg");
			start =System.currentTimeMillis();
			while(fis1.read() != -1) {
				
			}
			end = System.currentTimeMillis();
			System.out.println("사용하지 않을 때: "+(end-start)+"ms");
			fis1.close();
			
			//버퍼 이용한 input
			//fis2 = new FileInputStream("C:/images/img.jpg");
			//bis = new BufferedInputStream(fis2);
			
			bis = new BufferedInputStream(new FileInputStream("C:/images/img.jpg"));
			
			start =System.currentTimeMillis();
			while(bis.read() != -1) {
				
			}
			end = System.currentTimeMillis();
			System.out.println("사용했을 때: "+(end-start)+"ms");
			bis.close();
			//fis2.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
