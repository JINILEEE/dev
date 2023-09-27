package main;

import data.Person;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("복습~~~");
		
		Person p = new Person();
		p.setName("김송희");
		p.setAge(24);
		p.setGender('F');
		
		String str = p.getFieldInfo();
		System.out.println(str);
		
	} //main

} //class
