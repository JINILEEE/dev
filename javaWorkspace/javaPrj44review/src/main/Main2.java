package main;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		
		//여러 개의 객체를 관리할 컬렉션
		List<User> al = new ArrayList<User>(); //ArrayList<User>() <- User만 들어가는 ArrayList()
 		
		//유저 객체 여러개 만들고, 위에서 만든 컬렉션에 담기
		User a = new User("song01", "7332");
		User b = new User("hee01", "1225");
		User c = new User("yo01", "4658");
		
		al.add(a); //ArrayList에 a 라는 객체 저장 //(유저객체)만 넣을 수 있음
		al.add(b);
		al.add(c);
		
		//컬렉션에 들어있는 여러 개의 객체 전부 다 출력 (모든 필드 값)
		System.out.println(al + "\n"); //(al.tostring())
		
		//여러 개의 객체 전부 다 출력 ( 객체의 id 필드만 출력)
		//여러 개의 객체 전부 다 출력 ( 객체의 pwd 필드만 출력)
		
		for(User e : al) { // (변수 : 컬렉션) <- 컬렉션에 있는 거 하나하나 꺼내서 변수에 담아주겠다. 라는 뜻
			System.out.println(e.getId());
			System.out.println(e.getPwd());
		}
		
//		for(int i = 0; i < al.size(); i++) {
//			User e = (User) al.get(i); // User 타입으로 변경
//			System.out.println(e.getId());
//			System.out.println(e.getPwd() + "\n");
		
		
//		User elem01 = (User) al.get(0); // User 타입으로 변경
//		System.out.println(elem01.getId());
//		System.out.println(elem01.getPwd());
//		
//		User elem02 = (User) al.get(1); // User 타입으로 변경
//		System.out.println(elem02.getId());
//		System.out.println(elem02.getPwd());
//		
//		User elem03 = (User) al.get(2); // User 타입으로 변경
//		System.out.println(elem03.getId());
//		System.out.println(elem03.getPwd());

	}

}




