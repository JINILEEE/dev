package main;

//import data.Person;
import data.Pokemon;

public class Main {

	public static void main(String[] args) {
		
//		System.out.println("======캡슐화======");
//		
//		Person p1 = new Person();
//		p1.name = "홍길동";
//		p1.age = 20;  //앞으로는 이런걸 field 라고 부른다. (멤버 변수 = field = 객체변수)
//		p1.setName("홍길동");
//		p1.setAge(20);
//		
//		p1.setAge(-21);
//		
//		System.out.println(p1.getName());
//		System.out.println(p1.getAge());	//만 나이
//		
//		System.out.println("안녕하세요 " + p1.getName() + "입니다. 제 나이는 " + p1.getAge() + "살 입니다.");
		
		
		Pokemon p = new Pokemon();
		
		p.setName("피카츄");
		p.setHp(100);
		p.setAtk(30);

//		p.printIfo();
		
		String s = p.toString();
		System.out.println(s);
		
	}//main

}//class
