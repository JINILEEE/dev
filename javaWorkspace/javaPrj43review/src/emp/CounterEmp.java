package emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import menu.Menu;

public class CounterEmp {
	
	//스캐너
	private final Scanner sc = new Scanner(System.in);
	private List<Menu> menuList = new ArrayList<Menu>();
	
	
	//메뉴 보여주기
	private void showMenu() {
		//메뉴판 준비
		
		menuList.add(new Menu("아메리카노", 2000));
		menuList.add(new Menu("카페라떼", 2700));
		menuList.add(new Menu("바닐라라떼", 3200));
		menuList.add(new Menu("딸기라떼", 3700));
		menuList.add(new Menu("토피넛라떼", 3500));
		menuList.add(new Menu("쿠키프라페", 4300));
		
		//메뉴판의 모든 메뉴 출력
		for(int i = 0; i < menuList.size(); i++) {
			Menu x = (Menu) menuList.get(i);
			System.out.println(i+1 + " : " + x.getName() + "(" + x.getPrice() + "원)");
		}
		
		
//		for(int i = 0; i < menuList.size(); i++) {
//			Menu x = (Menu) menuList.get(i);
//			System.out.println(i+1 + " : " + x.getName() + "원");
//		}
		
	}

	//손님받기
	public void work() {
		System.out.println("주문 도와드릴게요 ~\n");
		
		//메뉴 보여주기
		showMenu();
		
		System.out.println("\n원하시는 메뉴 번호를 입력해 주세요.");
		//메뉴 입력받기
		int menuNum = ScanUserInput();
		//선택한 메뉴 확인시켜주고, 금액 더하기
		printMenu(menuNum);
		//갯수 입력받기
		System.out.println("수량을 입력해 주세요.");
		int menuCnt = ScanUserInput();
		
		//결제 (금액)
		int totalPrice = 0;
		int price = getMenuPrice(menuNum);
		totalPrice += price * menuCnt; //메뉴가격 * menuCnt;
		System.out.println("결제금액은 " + totalPrice + "원입니다.");
	}

	//메뉴 입력받기
	private int ScanUserInput() {
		String numStr = sc.nextLine(); //숫자 입력받고, 다음 엔터키가 나오지 않게 하기.
		int num = Integer.parseInt(numStr);  //Interger.parseInt : String->int 로 타입(형)변환(Casting)
		return num;
	}
	
	private int getMenuPrice(int n) {
		Menu result = (Menu) menuList.get(n-1);
		int price = result.getPrice();
		return price;
	}
	
	private void printMenu(int num) {  // int num = 3
		Menu result = (Menu) menuList.get(num-1);  // int num = 2
		System.out.println("메뉴이름 : " + result.getName());
		System.out.println("메뉴가격 : " + result.getPrice() + "원");
	}
	
	//결제 (금액)
	
			
}
