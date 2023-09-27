package battle;

import mob.Pokemon;

public class BattleManager {
	
	//승자  								
	String winner = null;			//멤버 변수
	
	Pokemon p1 = null;
	Pokemon p2 = null;
	
	
	//포켓몬 생성 메소드
	public void generatePokemon() {
		
		p1 = new Pokemon();
		p1.name = "피카츄";
		p1.hp = 100; 
		p1.atk = 30;
		
		p2 = new Pokemon();
		p2.name = "파이리";
		p2.hp = 90; 
		p2.atk = 33;
	}
	
	
	//배틀시작 메소드
	public void battleStart() {
	
		//포켓몬 2마리 생성
		this.generatePokemon();   //this. 멤버변수의

		//반복문	//this.winner -> this. 없어도됨
		while(winner == null) {			//winner 가 널값이 아니라면 누군가 져서 죽었다는 것이니까 거기까지
			// ㄴ> (승자가없음)을 의미		// 아니라면 계속 반복 winner가 널일때
			//피카츄가 파이리 공격
			mobAttack(p1, p2);
			if(winner != null) {break;}			//(승자가정해짐)
			mobAttack(p2, p1);	 
			if(winner != null) {break;}			// (승자가정해짐)
		}
		
		//결과 출력
		System.out.println(winner);
		
	}
	
	
	public void mobAttack(Pokemon attacker, Pokemon deffenser){
		//번갈아가며 공격 (출력문) //p1 공격
		System.out.println(attacker.name + "이(가)" + deffenser.name + "를 공격함");
		//공격마다 데미지를 계산하여 체력을 감소시켜줘야함 (체력 수정)
		deffenser.hp -= attacker.atk;	//p2의 체력에서 p1.atk 만큼 빼기위해 복합 연산자 사용
										// 그럼 이건 피카츄(p1)가 파이리(p2)를 공격
		//죽었는지 살았는지 승패 판단
		if(deffenser.hp <= 0) {
			winner = attacker.name;
		}
	}


} //class