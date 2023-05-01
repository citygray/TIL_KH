package exam_inheritance4;

public class Person {
	private String name;
	private int age;
	
	Person(){}
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
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
	
	public void show() {
		System.out.printf("사람[이름:%s, 나이:%d]\n",name,age);
	}

}
