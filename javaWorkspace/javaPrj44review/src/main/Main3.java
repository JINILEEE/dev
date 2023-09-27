package main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) {
		
		//여러 개의 객체를 관리할 컬렉션
		Set<User> s = new HashSet<User>();
		
		//유저 객체 여러개 만들고, 위에서 만든 컬렉션에 담기
		User a = new User("user01", "1111");
		User b = new User("user02", "2222");
		User c = new User("user03", "3333");
		
		s.add(a);
		s.add(b);
		s.add(c);
		
		//컬렉션에 들어있는 여러 개의 객체 전부 다 출력 (모든 필드 값)
		System.out.println(s + "\n");
		
		//여러 개의 객체 전부 다 출력 ( 객체의 id 필드만 출력)
		//여러 개의 객체 전부 다 출력 ( 객체의 pwd 필드만 출력)
		
		for(User elem : s) { //(변수 : 컬렉션) <- 컬렉션에 있는 거 하나하나 꺼내서 변수에 담아주겠다. 라는 뜻
			System.out.println(elem.getId());
			System.out.println(elem.getPwd());
		}

	}

}
