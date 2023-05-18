package exam_data_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		double[] prices = {19.99,9.97,23.89,4.23};
		int[] units = {12,8,23,56};
		String[] descs = {"Apple","Orange","banana","grape"};
		
		/*
		 * base.dat 파일에 각각 배열의 내용을 순서대로 저장하고 순서대로 읽어와서 
		 * 전체 합(가격*수량)을 출력
		 * */
		
		DataInputStream in = null;
		DataOutputStream out = null;
		
		try {
			FileOutputStream fs = new FileOutputStream("base.dat");
			BufferedOutputStream bs = new BufferedOutputStream(fs);
			out = new DataOutputStream(bs);
			
			int size = prices.length;
			for(int i =0; i<size;i++) {
				out.writeDouble(prices[i]);
				out.writeInt(units[i]);
				out.writeUTF(descs[i]);
			}
		}catch(IOException io) {
			io.printStackTrace();
		}finally {
			try {
				if(out != null) out.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		double price;
        int unit;
        String desc;
        double total = 0.0;

        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream("base.dat")));
            System.out.println("-------------------- Your Order --------------------");
            while(in.available()>0) {
            	price = in.readDouble();
            	unit = in.readInt();
            	desc = in.readUTF();
            	System.out.printf("price: %.2f, unit: %d, description: %s\n", price, unit, desc);
                total += (unit * price);
            }
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            try {
                if (in != null)
                    in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("total:" + total);
		
	}

}
