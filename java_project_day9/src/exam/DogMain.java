package exam;

public class DogMain {

	public static void main(String[] args) {
		/*
		 * 강아지를 나타내는 Dog라는 이름의 클래스를 설계한다.
		 * Dog클래스는 강아지의 이름(name), 강아지의 종류(breed) 예를 들어 "요크셔테리어", 강아지의나이(age)를 필드로 가진다.
		 * 생성자 및 설정자, 접근자를 생성하여 보자 
		 */
		Dog myPuppy = new Dog("쯔부쯔부","똥개",1);
		System.out.println(myPuppy);
		
		Dog urPuppy = new Dog("유부유부",7);
		System.out.println(urPuppy);

	}

}
class Dog{
	private String name;
	private String breed;
	private int age;
	
	//default 생성자
	Dog(){}
	
	//생성자의 오버로딩
	Dog(String name, int age){
		this(name,"",age);
	}
	
	Dog(String name,String breed, int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getBreed() {
		return breed;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	
	
	public String toString() {
		return String.format("나의 반려견 [이름:%s, 종류:%s, 나이:%d]",getName(),getBreed(),getAge());
	}
}
