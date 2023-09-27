package manager;

import main.Main;
import mob.Pokemon;
import util.MyUtil;

public class BattleManager {

	public void startBattle() {
		boolean isFinish = false;
		
		// 유저 vs 적
		
		// 두 포켓몬의 정보 출력 
		printPokemonInfo();
		
		while(true) {
		
		// 유저 행동 입력받기 (1. 몸통박치기(bodyAttack) 2. 스킬(skill))
		int num = scanUserAction();
		
		//입력값에 따라 공격
		isFinish = fight(Main.userPokemon, Main.enemyPokemon, num);  //(공격하는 포켓몬 정보, 맞는 포켓몬 정보, num)
		if(isFinish) {
			//결과 출력
			System.out.println("유저 승리 !!!");
			//배들 종료
			System.out.println("----- 배틀 종료 -----");
			return;
		}
		
		//적 행동 랜덤값에 따라 진행 (1. 몸통박치기 2. 스킬)
		isFinish = fight(Main.enemyPokemon, Main.userPokemon, MyUtil.getRandomInt(1, 2));
		if(isFinish) {
			System.out.println("유저 패배 ...");
			System.out.println("----- 배틀 종료 -----");
			return;
		}
	}
}	
	private int scanUserAction() {
		// 행동 목록 보여주기
		printActionList();
		
		// 유저 입력받기
		int num = Main.sc.nextInt();
		return num;
	}

	private boolean fight(Pokemon attacker, Pokemon defender, int num) {
		//공격 메소드 호출
		switch(num) {
		case 1 : attacker.bodyAttack(); break;
		case 2 : attacker.skill(); break;
		}
		
		// 데미지 계산
		int dmg = attacker.getAtk() * num - defender.getDef();
		System.out.println("데미지 : " + dmg);
		
		// 체력 감소
		defender.setHp(defender.getHp() - dmg);
		System.out.println(defender.getName() + " 남은 체력 : " + defender.getHp());
		
		//죽었는지 체크
		if(defender.getHp() <= 0) {
			return true;
		} else {
			return false;
		}
	}

	private void printActionList() {
		System.out.println("----- 원하는 동작의 번호를 입력하세요 -----");
		System.out.println("1. 몸통박치기");
		System.out.println("2. 스킬 사용");
		System.out.println("\n");
	}

	private void printPokemonInfo() {
		System.out.println("------ 유저 포켓몬 정보 ------");
		System.out.println(Main.userPokemon);
		System.out.println("\n");
		
		System.out.println("------ 적 포켓몬 정보 ------");
		System.out.println(Main.enemyPokemon);
		System.out.println("\n");
	}

}
