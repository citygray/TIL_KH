package exam_buffered_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		try {
			//버퍼 없이 out
			fis = new FileInputStream("C:/images/img.jpg");
			bis = new BufferedInputStream(new FileInputStream("C:/images/img.jpg"));
			fos = new FileOutputStream("C:/Temp/img_copy1.jpg");
			start = System.currentTimeMillis();
			
			while((data = bis.read()) != -1) {
				fos.write(data);
			}
			end = System.currentTimeMillis();
			fos.close();
			bis.close();
			fis.close();
			System.out.println("사용하지 않을때: "+(end-start)+"ms");
			
			//버퍼를 이용한 out
			fis = new FileInputStream("C:/images/img.jpg");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("C:/Temp/img_copy2.jpg");
			bos = new BufferedOutputStream(fos);
			start = System.currentTimeMillis();
			
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			end = System.currentTimeMillis();
			bos.close();
			fos.close();
			bis.close();
			fis.close();
			System.out.println("사용하지 했을 때: "+(end-start)+"ms");
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
