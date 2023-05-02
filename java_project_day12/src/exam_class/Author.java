package exam_class;

public class Author {
	//저자의 이름과나이, 국가명을 필드로 가진다.
	private String name;
	private int age;
	private String nation;
	
	Author(){};
	
	Author(String name,int age,String nation){
		this.name = name;
		this.age = age;
		this.nation = nation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	};
	
	

}
