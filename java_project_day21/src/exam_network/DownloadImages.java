package exam_network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DownloadImages {

	public static void main(String[] args) {
		// 웹에서 이미지 파일을 다운로드 할 수 있도록 코드를 작성해주세요
		
		InputStream in = null;
		OutputStream out = null;
		
		int readByteNo;
		String website ="http://photos1.blogger.com/blogger/2921/1916/1600/photoshop_apples.jpg";
		
		try {
			URL url = new URL(website);
			URLConnection con = url.openConnection();
			in = new BufferedInputStream(con.getInputStream());
			
			out = new BufferedOutputStream(new FileOutputStream("C:/temp/photoshop_apples.jpg"));
			
			byte[] data = new byte[2048];
			while((readByteNo = in.read(data)) != -1) {
				out.write(data,0,readByteNo);
			}
			System.out.println(website +"에서 이미지를 다운로드 완료되었습니다.");
			
		}catch(MalformedURLException e) {
			System.out.println();
		}catch(IOException i) {
			System.out.println("IO error");
		}finally {
			try {
				if(out!=null)out.close();
				if(in != null)in.close();
			}catch(Exception e) {
				System.out.println("CLOSE error");
			}
		}
		
	}

}
