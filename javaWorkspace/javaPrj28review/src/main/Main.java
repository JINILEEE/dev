package main;

import mob.Pokemon;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("포켓몬~~~");
		
		Pokemon p = new Pokemon();
		//setter를 이용하여 필드값 할당
		p.setName("피카츄");
		p.setHp(100);
		p.setAtk(70);
		
		//gerFieldInfo를 이용하여 값 확인
		String str = p.getFieldInfo();
		System.out.println(str);

	}

}
