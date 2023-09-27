package main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main6 {

	public static void main(String[] args) {
		
		//여러 개의 객체를 관리할 컬렉션
		Map<String, User> x = new HashMap<String, User>(); //Map은 인터페이스라서 자식인 HashMap을 사용
		
		//유저 객체 여러개 만들고, 위에서 만든 컬렉션에 담기
		User u1 = new User("서울시", "1234");
		User u2 = new User("강남구", "12345");
		User u3 = new User("역삼동", "123456");

		x.put(u1.getId(), u1); // put(key, value);
		x.put(u2.getId(), u2);
		x.put(u3.getId(), u3);
		
		//컬렉션에 들어있는 여러 개의 객체 전부 다 출력 (모든 필드 값)
		System.out.println(x);

		//여러 개의 객체 전부 다 출력 ( 객체의 id 필드만 출력)
		//여러 개의 객체 전부 다 출력 ( 객체의 pwd 필드만 출력)
		
		Set<String> ks = x.keySet();  // ks는 x(Map) 안에서 key값만 Set타입으로 담은 것.
//		Collection ks = x.values();
		
		for(String k : ks) {
			System.out.println(k);
			User v = x.get(k);
			System.out.println(v);
		}
		
		
	}

}
