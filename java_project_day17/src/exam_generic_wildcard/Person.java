package exam_generic_wildcard;

//일반인
public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {return name;}
	public String toString() {return name;}

}

//직장인
class Worker extends Person {
	public Worker (String name) {
		super(name);
	}
}


