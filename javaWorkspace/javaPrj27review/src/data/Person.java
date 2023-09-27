package data;

public class Person {
	
	//기본 생성자 (파라미터 X, JVM이 자동으로 만들어줌(다른생성자가 없을때)
	public Person() {
		
	}
	
	
	//멤버 변수	//private 접근 제한자 : 내부에서만 사용 가능
	private String name;
	private int age;	//음수 ㄴㄴ, 기존보다 작게 ㄴㄴ
	private char gender;	//M, F  //gender : 성별
	
	//멤버 메소드  //캡술화 (private를 달아주고, getter,setter 해준 구성)
	public void breath() {
		System.out.println("호흡");
	}
	
	//getter (name)
	public String getName() {
		return name;	//멤버변수 반환 : return
	}
	
	//getter (age)
	public int getAge() {
		return age;
	}
	
	//getter (gender)
	public char getGender() {
		return gender;
	}
	
	
	//setter
	public void setName(String name){ 
		if(name.length() < 2) {  //(잘못된이름)  //length : 길이
			System.out.println("잘못된 이름입니다.");
		}else {
			this.name = name;
		}
	}
	
	//setter (age) 
	//접근제한자 리턴타입 메소드이름(파라미터)
	public void setAge(int age) {
		if(age < 0 || age < this.age) {
			System.out.println("나이 이상함");
		} else {
			this.age = age;
		}
	}
	
	//setter (gender)
	//접근제한자 리턴타입 메소드이름(파라미터)
	public void setGender(char gender) {	
		if(gender == 'M' || gender == 'F' ) {  //값 이상하면
			this.gender = gender;
		} else {
			System.out.println("성별 확인바람");
		}
	
	}
//	위랑 같은 내용이며, 값을 똑같이 출력할 수 있음
//	public void setGender(char gender) {
//		if(gender != 'M' || gender != 'F' ) {  //값 이상하면
//			System.out.println("성별 확인바람");
//		} else {
//			this.gender = gender;
//		}
//		
//	}
	
	//객체 안의 모든 멤버변수(==필드)들의 정보를 리턴하는 메소드
	//접근제한자 리턴타입 메소드이름(파라미터)
	public String getFieldInfo() {	//메소드 Head(=시그니처)  //리턴 할 게 없어서 void라 씀.
		return "name : " + this.name + ",  age : " + this.age + ",  gender : " + this.gender;
		
	}  // {~~~} <- 중괄호는 메소드 Body

} //class
