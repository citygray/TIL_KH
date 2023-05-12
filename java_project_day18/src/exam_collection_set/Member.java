package exam_collection_set;

public class Member implements Comparable<Member>{
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return String.format("member - (name: %s, age: %d)",name,age);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
//			if(this.age == member.age)
//				return true;
			if(this.name.equals(member.name) && this.age == member.age)
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	public int compareTo(Member obj) {
		//int r = this.getAge()- obj.getAge(); 
		/*
		int r = this.getName().hashCode()- obj.getName().hashCode(); 
		if(r>0)
			return 1;
		else if(r==0)
			return 0;
		else 
			return -1;
		*/
		//참조형
		return this.name.compareTo(obj.name);
		
	}

}
