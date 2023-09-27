package main;

import com.kh.test.person.model.vo.Person;

public class Test02_1 {

	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		
		pArr[0] = new Person("rose");
		pArr[1] = new Person("james");
		pArr[2] = new Person("eddy");
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getName());
		}
	}

}
