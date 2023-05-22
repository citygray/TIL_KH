package exam_scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner s = null;
		PrintWriter out = null;
		int sum = 0;
		
		try {
			out = new PrintWriter(new FileWriter("input.txt"));
			out.println("15");
			out.println("9.5");
			out.println("7");
			out.println("Java");
			out.println("3");

			out.flush();
			
			s = new Scanner(new BufferedReader(new FileReader("input.txt")));
			//s.useDelimiter(",");//콤마를 분리자로 사용 
			while(s.hasNext()) {
				//System.out.println(s.next());
				if(s.hasNextInt()) {
					sum += s.nextInt();
				}else {
					s.next();
				}
			}
			
			System.out.println("정수의 합: "+sum);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(s!=null) s.close();
			if(out!=null) out.close();
		}
		

	}

}
