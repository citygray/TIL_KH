package exam_file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FoodTest {
	public static void fileSave(String fileName) {
		//전달받은 fileName으로 파일 객체생성
		File file = new File(fileName);
		//객체출력 스트림 (파일출력스트임)
		try(ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(file))){
			//파일에 Food객체 기록
			obj.writeObject(new Food("사과",20));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		fileSave("appele");
	}

}
