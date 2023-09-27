package main;

import java.util.LinkedList;
import java.util.Queue;

public class Main5 {

	public static void main(String[] args) {
		
		//여러 개의 객체를 관리할 컬렉션
		Queue<User> q = new LinkedList<User>(); //Queue는 인터페이스라 자체적?으로 호출이 안됨.=> 자식인 LinkedList()로.
		
		//유저 객체 여러개 만들고, 위에서 만든 컬렉션에 담기
		User u1 = new User("김뽀이", "0428");
		User u2 = new User("유꾸꾸", "1019");
		User u3 = new User("김가을", "0701");
		
		q.add(u1);
		q.add(u2);
		q.add(u3);

		//컬렉션에 들어있는 여러 개의 객체 전부 다 출력 (모든 필드 값)
		System.out.println(q);

		//여러 개의 객체 전부 다 출력 ( 객체의 id 필드만 출력)
		//여러 개의 객체 전부 다 출력 ( 객체의 pwd 필드만 출력)
		for(User elem : q) {
			System.out.println(elem.getId());
			System.out.println(elem.getPwd());
		}
	}

}
