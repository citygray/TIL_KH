package exam_object_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("object.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(Integer.valueOf(10));
			oos.writeObject(Double.valueOf(3.14));
			oos.writeObject(new int[] {1,2,3});
			oos.writeObject(new String("홍길동"));
			
			oos.flush();
			oos.close();
			
			FileInputStream fis = new FileInputStream("object.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Integer obj1 = (Integer) ois.readObject();
			Double obj2 = (Double) ois.readObject();
			int[] obj3 = (int[]) ois.readObject();
			String obj4 = (String)ois.readObject();
			
			ois.close();
			fis.close();
			
			System.out.println(obj1);
			System.out.println(obj2);
			System.out.println(Arrays.toString(obj3));
			System.out.println(obj4);
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
