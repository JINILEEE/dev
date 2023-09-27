package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		System.out.println("복습");
		
		//여러 개의 객체를 관리할 컬렉션
		List menuList = new ArrayList();
	
		//메뉴 객체 여러개 만들고, 위에서 만든 컬렉션에 담기
		Menu m1 = new Menu("연세빵 녹차", 3500);
		menuList.add(m1);
		
		Menu m2 = new Menu("젤리", 1500);
		menuList.add(m2);
		
		Menu m3 = new Menu("포카리스웨트", 2200);
		menuList.add(m3);
		
		Menu m4 = new Menu("초콜릿", 1500);
		menuList.add(m4);
		
		//컬렉션에 들어있는 여러 개의 객체 전부 다 출력 (모든 필드 값)
//		System.out.println(menuList.get(0);
//		System.out.println(menuList.get(1);
//		System.out.println(menuList.get(2);
//		System.out.println(menuList.get(3);
		
		//여러 개의 객체 전부 다 출력 ( 객체의 name 필드만 출력)
//		private void printMenu(int num) {
//			Menu result = (Menu) menuList.get(num-1);
			
//		}
		
		//여러 개의 객체 전부 다 출력 ( 객체의 price 필드만 출력)
		
	}

}





















