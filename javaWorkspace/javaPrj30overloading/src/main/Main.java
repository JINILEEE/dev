package main;

import data.Person;

public class Main {

	public static void main(String[] args) {

		System.out.println("생성자 오버로딩 ~~~");
		
		//생성자를 이용한 초기화
//		Person p = new Person("김송희", 24);
//		System.out.println(p.getFieldInfo());
		
		//setter를 이용하여 객체 준비
		Person p = new Person();
		p.setName("김송희");
		p.setAge(24);
		System.out.println(p);
	}

}
