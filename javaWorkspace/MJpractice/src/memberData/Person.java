package memberData;

public class Person {
	//기본 생성자
	public Person() {
		
	}
	
	//모든필드채우는생성자
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//필드 == 멤버변수
	private String name;
	private int age;
	private char gender;
	
	//getter/setter
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person [이름: " + name + " / 나이: " + age + " / 성별: " + gender + " ]";
	}
	
	
	
}
