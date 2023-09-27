package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import mob.Pokemon;

public class PracticeClass {
	
	//List
	public void method01() {
		System.out.println("------List------");
		List al = new ArrayList();
		
		Pokemon p = new Pokemon();
		int num = 10;
		String str = "hello";
		
		al.add(p); //p, num, str 세개를 넣어도 중복 가능 !!
		al.add(num);
		al.add(str);
		
//		System.out.println(al.get(0));
//		System.out.println(al.get(1));
//		System.out.println(al.get(2));
		
		System.out.println(al);  //tostring()
		
//		al.add(0,"안녕");
//		al.clear(); //내용을 지워주는 메소드
//		boolean result = al.contains(10);
//		System.out.println(result);
		
		System.out.println(al); //tostring()
	}
	
	//Set - 중복된건 제거가 되고, 순서없이 마구 들어간다
	public void method02() {
		System.out.println("------Set------");
		
		HashSet s = new HashSet();
		
		s.add("one");
		s.add("one");
		s.add("two");
		s.add("three");
		s.add(4);
		s.add(5);
		
		System.out.println(s);
	}
	
	//Map
	public void method03() {
		System.out.println("------Map------");
		
		Map map = new HashMap(); // "웬만하면 상위 타입으로 받는게 좀 더 유연하구나.~~" 정도로만 알고 있기.
		
		map.put("name", "김송희");  //(key, value)
		map.put("name", "김송히");  
		map.put("age", 24);
		map.put("gender", 'F');
		
		Object result = map.get("name"); //value 값 받기  
		System.out.println(result);
		
		map.remove("name");
		
		System.out.println(map);  //== tostring()
	}
	
	//Stack
	public void method04() {
		System.out.println("------Stack------");
		
		Stack stack = new Stack();
		
		stack.add("one");
		stack.add("two");
		stack.add("three");
		
		Object result = stack.peek(); //pop() - 젤 위에꺼 출력하기
		System.out.println(result);
		
		Object result2 = stack.peek(); //pop() - 젤 위에꺼 출력하기
		System.out.println(result2);
		
		System.out.println(stack);
	}
	
	//Queue
	public void method05() {
		System.out.println("-------Queue------");
		
		Queue q = new LinkedList(); //Queue의 자손 중에 하나인 LinkedList.
		
		q.add("one"); 
		q.add("two");
		q.add("three");
		
//		Object result = q.poll();
//		System.out.println(result);
//		
//		Object result2 = q.poll();
//		System.out.println(result2);
		
		System.out.println(q);
	}
}
