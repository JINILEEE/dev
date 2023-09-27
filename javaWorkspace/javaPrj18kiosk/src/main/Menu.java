package main;

public class Menu {
	
	//버거 메뉴
	//입력받기
	public int burgerMenu() {  //void : 리턴값이 없음
		
		System.out.println("========햄버거=======");
		System.out.println("1. " + Main.BURGER01);  //Main.(대문자)~~ <- 
		System.out.println("2. " + Main.BURGER02);
		System.out.println("3. " + Main.BURGER03);
		int burger = Main.sc.nextInt();
		return burger;
	}
		
	//사이드 메뉴 소개
	//정수 입력받기
	public int sideMenu() {
		System.out.println("========사이드=======");
		System.out.println("1. " + Main.SIDE01);
		System.out.println("2. " + Main.SIDE02);
		System.out.println("3. " + Main.SIDE03);
		System.out.println("4. " + Main.SIDE04);
		int side = Main.sc.nextInt();
		return side;
	}
		
	//음료 메뉴 소개
	//정수 입력받기
	public int drinkMenu() {
		System.out.println("========음료=======");
		System.out.println("1. " + Main.DRINK01);
		System.out.println("2. " + Main.DRINK02);
		System.out.println("3. " + Main.DRINK03);
		int drink = Main.sc.nextInt();
		return drink;
	}
	
	

}
