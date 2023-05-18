package exam_object_stream;

import java.io.Serializable;

public class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	//이름(name)과 나이(age)를 필드로 가진 Person 클래스를 생성한다.
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	};
	
	@Override
	public String toString() {
		return String.format("이름:%s, 나이:%d" , name,age);
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
	
	
	
	
}
