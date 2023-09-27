package manager;

import main.Main;
import mob.Pokemon;

public class BattleManager {
	
	public BattleManager() {  // 리턴 타입이 없는 생성자
		
	}

	// 배틀 시작
	public void startBattle() {  //멤버 메소드 //public : 전체공개
		
		int userHp = Main.userPokemon.getHp();
		int enemyHp = Main.enemyPokemon.getHp();
		
		// 번갈아가며 공격
		boolean isDead = false;
		while(!isDead) {
			// 데미지 계산
			Pokemon attacker = Main.userPokemon;
			Pokemon defender = Main.enemyPokemon;
			attacker.bodyAttack();
			int damage = calcDamage(attacker.getAtk() , defender.getDef());  //공격력, 방어력
			System.out.println("데미지 : " + damage);
			
			// 체력 감소
			enemyHp -= damage;
			System.out.println("남은 체력 : " + enemyHp);
			
			// 죽음 판단
			isDead = checkHp(enemyHp);  //checkHp(맞은포켓몬체력);
		
		}
		
		
		// 결과 출력
		if(userHp <= 0) {
		System.out.println(Main.enemyPokemon.getName() + "승리 !");  //공격한포켓몬 승리
		} else {
			System.out.println(Main.userPokemon.getName() + "승리 !");
		}
	}

	private boolean checkHp(int enemyHp) {  //멤버메소드  //private : 나만보기, 즉 객체에만.
		return enemyHp <= 0;
	}

	private int calcDamage(int atk, int def) {  //멤버메소드  //private : 나만보기, 즉 객체에만.
		return atk - def;
	}
	
	

}