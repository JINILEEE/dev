package mob;

import game.GameManager;

public class Pokemon {
	
	public String name;
	public int atk;
	public int def;
	public int hp;
	
	public void bodyAttack() {
		System.out.println("\n" + name + "의 몸통박치기~~\n");
		

		// 게임시작
		GameManager gm = new GameManager();
		gm.gameStart();


	}

}
