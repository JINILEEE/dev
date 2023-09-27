package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {  //직원

	//멤버변수
	private ArrayList<Menu> menuList = new ArrayList<Menu>();  //menuList를 직원만 볼 수 있도록 -> private
	private int totalPrice = 0;
	
	//일시작
	public void startWork() {

		//메뉴판 준비
		prepareMenu();
		
		//메뉴판 보여주기
		showMenu();
		
		//주문 받기
		order();
		
		//결제하기
		pay();
		
	}
	
	//메뉴판 준비
	private void prepareMenu() {
		menuList.add(new Menu("라볶이", 4500));
		menuList.add(new Menu("김밥", 3000));
		menuList.add(new Menu("라면", 4000));
		menuList.add(new Menu("철판김치볶음밥", 7500));
		menuList.add(new Menu("칼국수", 7000));
	}

	//메뉴판 보여주기
	private void showMenu() {
		for(Menu menu : menuList) {
			System.out.println(menu);
		}
	}
	
	//주문 받기
	private void order() {
		System.out.println("\n원하시는 메뉴 번호를 선택하세요.");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		switch(str) {
		case "1" : totalPrice = 4500; break;
		case "2" : totalPrice = 3000; break;
		case "3" : totalPrice = 4000; break;
		case "4" : totalPrice = 7500; break;
		case "5" : totalPrice = 7000; break;
		default : System.out.println("잘못골랐음");
		}
	}
	
	//결제하기
	private void pay() {
		System.out.println("결제하실 금액은 " + totalPrice + "원입니다.");
	}
	
} //class







