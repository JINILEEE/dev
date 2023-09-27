package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("조건문");

		/*
		* <조건문>
		* - 조건 맞으면 코드 실행
		* - if, else, else if
		*
		*
		* [문법]
		* if(조건식{명령~~~}
		* else if(조건식){명령~~~} -> 여러 번 추가가능
		* else{명령~~~}
		*
		*/

//				int age = 10;
//				if(age >=20) {
//					System.out.println("성인입니다.");
//				} else {
//					System.out.println("미셩년자입니다.");
//				}

		int num = 0;
		if (num > 0) {
		System.out.println("양수");
		} else if(num < 0){
		System.out.println("음수");
		} else {
		System.out.println("zero");
		}

	}

}
