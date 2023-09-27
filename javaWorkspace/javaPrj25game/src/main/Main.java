package main;

import java.util.Scanner;

import game.GameManager;

public class Main {
	
	public static final Scanner sc = new Scanner(System.in);  //static 변수 만들어서 초기화 진행
			//final static (순서상관x)
	
	public static void main(String[] args) {
		
		System.out.println("======미니게임천국======");
		
		GameManager gm = new GameManager();
		
		while(true) {
			//게임 정보 출력
			gm.printGameInfo();
			
			//게임번호 입력받기
			String userInput = scanUserInput();
		
			//게임번호에 따라 게임시작
			switch(userInput) {
			case "1" : gm.startUpDown(); break;
			case "2" : gm.startRcp(); break;
			case "3" : gm.startPokemon(); break;
			case "9" : System.out.println("프로그램을 종료합니다.");return;	//게임종교
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}
		
	}	//main
	
	public static String scanUserInput() {  //static 메모리에 저장해서 어디서든 사용할 수 있게 함.
		String x = Main.sc.nextLine();
		return x;
	}

}	//class
