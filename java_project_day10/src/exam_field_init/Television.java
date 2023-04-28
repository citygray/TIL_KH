package exam_field_init;

public class Television {
	public static String company = "Samsung";
	public static String model = "LCD";
	public static String info;
	
	static {
		info = company +"-"+model;
	}

}
