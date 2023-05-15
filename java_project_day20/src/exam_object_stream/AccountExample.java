package exam_object_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AccountExample {
	
	/*[조건]
	 * 클래스: Account
	 * 필드: accountNo, ownerName, balance
	 * 
	 * 파일명은 account.dat
	 * 직렬화하여 저장되어야하는데 데이터는 123-4569-3345 홍길동 100000
	 * 역직렬화하여 화면에 보여지는 형태는 
	 * 계좌번호 : 123-4569-3345
	 * 예금주명 : 홍길동
	 * 금액: 100000
	 * */

	public static void main(String[] args) {
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("account.dat"));
			out.writeObject(new Account("123-1234-1234","김난이",10000));
			out.flush();
			
			in = new ObjectInputStream(new FileInputStream("account.dat"));
			Account ea = (Account)in.readObject();
			System.out.println(ea.toString());
		}catch(ClassNotFoundException c){
			System.out.println(c.getMessage());
		}catch(IOException i) {
			//커서가 파일에 끝에 있기 때문에 IOException 발생
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally{
			try {
				if(in != null) in.close();
				if(out != null) out.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
