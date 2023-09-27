package main;

import java.util.Scanner;

public class Main {
	
	//final : 재할당 불가능 - 딱 한번만 할당 가능. 두번 이상 X
	static final String BURGER01 = "상하이스파이시";  //상수이면 대문자로!!!!!!!!!!!
	static final String BURGER02 = "베이컨 토마토 디럭스"; //상수라서 글자 기울어짐
	static final String BURGER03 = "슈비버거";			 // static final하면 할당 안되는 값
	static final String SIDE01 = "감자튀김";			 //static final 재할당을 막기위함
	static final String SIDE02 = "치즈스틱";
	static final String SIDE03 = "코울슬로";
	static final String SIDE04 = "치킨봉&윙";
	static final String DRINK01 = "제로콜라";
	static final String DRINK02 = "사이다";
	static final String DRINK03 = "환타";
	
	//스캐너 객체(도구) 준비
	static final Scanner sc = new Scanner(System.in);

	//맥도날드 키오스크
	public static void main(String[] args) {
		
		
		System.out.println("주문하시겠습니까 ? ");
		
		//포장 매장
		System.out.println("1.포장하기  2.매장에서 먹고가기");
		int packageType = sc.nextInt();
		
		
		//메뉴선택(버거)  //메뉴판 보여주고  //입력받기
		Menu m = new Menu();
		int burger = m.burgerMenu();
		
		//메뉴선택(사이드)
		int side = m.sideMenu();
		
		//메뉴선택(음료)
		int drink = m.drinkMenu();
		
		//결제 
		
		
		//주문번호 발급
		
		
		//메뉴명 준비				 // "" : NULL / 아예 그냥 없는 것. 존재하지 않는 것 / 0과 다르다.
		String burgerName = null;  //"" <- 이거는 참조형 변수의 기본값은 NULL 즉, 0번지이다.
		String sideName = null;
		String drinkName = null;
		
		switch (burger) {
		case 1 : burgerName = BURGER01; break;
		case 2 : burgerName = BURGER02; break;
		case 3 : burgerName = BURGER03; break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
		//아래 코드를 switch문 써서 작성가능.
//		if(burger == 1) {
//			burgerName = "상하이스파이시";
//		} else if(burger == 2) {
//			burgerName = "베이컨 토마토 디럭스";
//		} else if(burger == 3) {
//			burgerName = "슈비버거";
//		}
		
		
		//사이드 메뉴명 준비
		switch (side) {
		case 1 : sideName = SIDE01; break;
		case 2 : sideName = SIDE02; break;
		case 3 : sideName = SIDE03; break;
		case 4 : sideName = SIDE04; break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
		
		//음료 메뉴명 준비
		switch (drink) {
		case 1 : drinkName = DRINK01; break;
		case 2 : drinkName = DRINK02; break;
		case 3 : drinkName = DRINK03; break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
		
		//주문확인서 출력
		System.out.println("주문하신 메뉴는");
		System.out.println("햄버거 : " + burgerName);
		System.out.println("사이드 : " + sideName);
		System.out.println("음료수 : " + drinkName);
		System.out.println("입니다.");

	}

}
