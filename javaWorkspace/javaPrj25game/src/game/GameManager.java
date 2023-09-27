package game;

import game.updown.RcpGameManager;
import game.updown.UpDownGameManager;
import main.Main;

public class GameManager {
	
	public void printGameInfo() {
		
		//게임 번호 안내
		System.out.println("\n\n");
		System.out.println("======메인 화면======");
		System.out.println("1. UPDOWN");
		System.out.println("2. 가위바위보");
		System.out.println("3 포켓몬");
		System.out.println("9. 게임종료");
		
	}
	
	public static String scanUserInput() {  //static 메모리에 저장해서 어디서든 사용할 수 있게 함.
		String x = Main.sc.nextLine();
		return x;
	}
	
	public void startUpDown() {
		UpDownGameManager gm = new UpDownGameManager();
		gm.startGame();
	}
	
	
	public void startRcp() {
		RcpGameManager gm = new RcpGameManager();
		gm.startGame();
	}
	
	
	public void startPokemon() {
		System.out.println("------포켓몬------");

		System.out.println("준비중");
	}
	
	
	
} //class
