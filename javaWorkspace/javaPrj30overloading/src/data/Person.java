package data;

public class Person {
	
	
	
//	//기본 생성자
//	public Person() {
//		
//	}
//	
//	//모든 필드를 매개변수로 받는 생성자
//	public Person(String name, int age) {  //기본생성자(파라미터x)
//		this.name = name;
//		this.age = age;
//	}
	
	public Person() {
		
	}

	public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}



	private String name;
	private int age;
	
	public void breath() {
		System.out.println("ㅋㅋ");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
//	public String toString() {
//		return "Person [name : " + this.name + ", age : " + this.age + "]";
//	}
	
	
	

}
