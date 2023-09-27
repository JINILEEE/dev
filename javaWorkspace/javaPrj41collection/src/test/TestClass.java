package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import mob.Pokemon;

public class TestClass {
	
	//List //인덱스로 요소들을 관리
	public void method01() {
		System.out.println("-------리스트-------");
		List al = new ArrayList();
		
		//넣기==삽입
		Pokemon p = new Pokemon();
		al.add(p); //al.add(객체);
		
		//꺼내기
		Object result = al.get(0); //al.get(인덱스);
		System.out.println(result);
	}
	
	//Set //중복 X
	public void method02() {
		System.out.println("------Set------");
		
		HashSet s = new HashSet();
		
		//넣기(삽입)
		Pokemon p = new Pokemon();
		s.add(p); //Pokemon 말고도 모든 객체 다 됨.
		
		//꺼내기
		System.out.println(s);
	}
	
	//Map //Key - Value 쌍으로 데이터를 관리  //Key는 중복 X //자주쓰임
	public void method03() {
		System.out.println("------Map------");
		
		Map m = new HashMap();

		//넣기
		m.put("first", new Pokemon());
		
		//꺼내기
		Object result = m.get("first");
		System.out.println(result);
	}
	
	//Stack //LIFO (Last In First Out) : 마지막으로 넣은 게 첫번째로 나오는 특징.
	public void method04() {
		System.out.println("------Stack------");
		
		Stack s = new Stack();
		 
		//넣기
		s.add(new Pokemon());
		
		//꺼내기
		Object result = s.pop();
		System.out.println(result);
	}
	
	//Queue //FIFO (First In First Out) : 첫번째로 넣은 게 첫번째로 나온다
	public void method05() {
		System.out.println("------Queue------");
		
		LinkedList q = new LinkedList();
		
		//넣기
		q.add(new Pokemon());
		
		//꺼내기
		Object result = q.poll();
		System.out.println(result);
	}

} //Class
