package exam;

import java.util.regex.Pattern;

/*
[요구사항 3]
학생 정보를 저장하기 위한 Student 클래스를 생성해야 한다 Student 클래스는 이름(name), 학과(department), 학번(id), 학점평균(grade)을 저장하는 필드가 있다.

- 실행 클래스의 이름은 StudentManager이다.
- 사용자로 하여금 학생정보를 입력받아 Student 객체를 생성하고 4명의 학생 정보를 ArrayList<Student> 컬렉션에 저장한 후에(read()), ArrayList<Student>의 모든 학생(4명) 정보를 출력한다(printAll())
반복문을 통해서 학생 이름을 입력받아 학생의 정보를 출력하되 종료를 입력하면 프로그램을 종료하도록(processQuery()) 프로그램을 작성하라.

 */

public class Student {
    private Name name;
    private Department department;
    private Id id;
    private Grade grade;
       

    public Student(String name,String department,String id,String grade) {
        this.name = new Name(name);
        this.department = new Department(department);
        this.id = new Id(id);
        this.grade = new Grade(grade);
    }
    
    
    
    public Name getName() {
		return name;
	}



	public void setName(Name name) {
		this.name = name;
	}



	@Override
    public String toString() {
    	String str ="";
    	str += "이름: "+this.name+"\n";
    	str += "학과: "+this.department+"\n";
    	str += "학번: "+this.id+"\n";
    	str += "학점평균: "+this.grade+"\n";
    	return str;
    }
}

class Name {
    private String name;

    public Name(String name) {
        if (name.length() < 2) {
            throw new RuntimeException("이름은 두 글자 이상이어야 합니다.");
        }
        this.name = name;
    }
    @Override
    public String toString() {
    	return this.name;
    }
}

class Department{
	private String department;
	
	public Department(String department) {
		if(department.length()<2) {
			throw new RuntimeException("학과를 입력해야합니다.");
		}
		this.department = department;
	}
	@Override
    public String toString() {
    	return this.department;
    }
}


class Id{
	private String id;
	final String pattern = "^[0-9]{4}$";
	
	
	public Id(String id) {
		if(!Pattern.matches(pattern, id)) { 
			throw new RuntimeException("학번은 4자리 숫자만 유효합니다.");
		}
		
		this.id = id;
	}
	@Override
    public String toString() {
    	return this.id;
    }
	
}

class Grade{
	private String grade;
	final String pattern = "^([0-9])(\\.[0-9]{0,1})?$";
	
	public Grade(String grade) {
		if(!Pattern.matches(pattern,grade)) {
			throw new RuntimeException("학점은 10점 미만, 소숫점 첫째 짜리 까지 유효합니다");
		}
		this.grade = grade;
	}
	@Override
    public String toString() {
    	return this.grade;
    }
	
}

