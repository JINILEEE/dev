package main;

import java.util.ArrayList;
import java.util.List;

import emp.CounterEmp;
import menu.Burger;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("---복습---");
		
		//버거 여러 개 담을 컬렉션 준비
		List<Burger> burgerList = new ArrayList<Burger>();
		
		//버거 초기 셋팅
		burgerList.add(new Burger("슈비버거", 6000));
		burgerList.add(new Burger("치즈버거", 5000));
		burgerList.add(new Burger("불고기버거", 4000));
		burgerList.add(new Burger("새우버거", 3000));
		burgerList.add(new Burger("치킨버거", 2000));
		
		System.out.println("메인 메소드에서 버거리스트 출력");
		System.out.println(burgerList);
		
		//카운터 직원 통해서 모든 버거 메뉴 출력
		CounterEmp cemp = new CounterEmp();
		cemp.showBurgerMenu(burgerList);
		
		System.out.println("메인 메소드에서 버거리스트 출력");
		System.out.println(burgerList);
		
		
	}	
}
