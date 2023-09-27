package main;

import java.util.ArrayList;
import java.util.List;

import menu.Burger;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== 맥날 =====");
		
		//메뉴(햄버거) 준비
		Burger b1 = new Burger("슈비버거", 6300);
		Burger b2 = new Burger("핫크리스피버거", 6800);
		Burger b3 = new Burger("대파버거", 7000);
		
		//여러 객체 한번에 관리하기 (배열)
//		Burger[] burgerArr = new Burger[3];
//		burgerArr[0] = b1;
//		burgerArr[1] = b2;
//		burgerArr[2] = b3;
		
		//여러 객체 한번에 관리하기 (컬렉션)
		List<Burger> burgerList = new ArrayList<Burger>();
		burgerList.add(b1);
		burgerList.add(b2);
		burgerList.add(b3);
		
		//메뉴 보여주기
//		for(int i = 0; i < burgerArr.length; i++) {
//			System.out.println(burgerArr[i]);
//		}
		
		for(Burger burger : burgerList) {
			System.out.println(burger);
		}
		
	}

}
