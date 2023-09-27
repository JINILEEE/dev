package com.kh.test.person.model.vo;

public class Person {
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public Person() {
		super();
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}


}
