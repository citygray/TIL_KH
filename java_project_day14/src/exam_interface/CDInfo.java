package exam_interface;

public class CDInfo {
	private static int registerNo = 0;
	private String title;
	
	CDInfo(){
		System.out.println("CDInfo() 디폴트");
		registerNo++;
	}
	
	CDInfo(String title){
		this();
		this.title = title;
	}

	public int getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(int registerNo) {
		this.registerNo = registerNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
