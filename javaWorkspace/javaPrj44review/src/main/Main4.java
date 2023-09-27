package main;

import java.util.Stack;

public class Main4 {

	public static void main(String[] args) {
		
		//여러 개의 객체를 관리할 컬렉션
		Stack<User> s = new Stack<User>();
		
		//유저 객체 여러개 만들고, 위에서 만든 컬렉션에 담기
		User u1 = new User("user01", "1234");
		User u2 = new User("user02", "12345");
		User u3 = new User("user03", "123456");
		
		s.add(u1);
		s.add(u2);
		s.add(u3);

		//컬렉션에 들어있는 여러 개의 객체 전부 다 출력 (모든 필드 값)
		System.out.println(s);

		//여러 개의 객체 전부 다 출력 ( 객체의 id 필드만 출력)
		//여러 개의 객체 전부 다 출력 ( 객체의 pwd 필드만 출력)
		for(User elem : s) {
			System.out.println(elem.getId());
			System.out.println(elem.getPwd());
		}
		
	}

}
