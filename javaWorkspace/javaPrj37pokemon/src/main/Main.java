package main;

import mob.Pairi;
import mob.Pikachu;
import mob.Pokemon;
import mob.Turtle;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====== 포켓몬 ======");
		
		Pokemon[] pokemonArr = new Pokemon[3];
		pokemonArr[0] = new Pikachu(100, 30, 10); //기본생성자가 빨간줄 그어지는 이유는 기본생성자가 없어서임.
		pokemonArr[1] = new Pairi(95, 33, 8);
		pokemonArr[2] = new Turtle(98, 26, 9);
		
		//모든 포켓몬 정보(멤버변수==필드==객체변수==인스턴스변수) 확인
		for(int i = 0; i < pokemonArr.length; i++) {
			System.out.println( pokemonArr[i].toString() );
		}
		
		//모든 포켓몬 몸통박치기
		for(int i = 0; i < pokemonArr.length; i++) {
			pokemonArr[i].bodyAttack();
		}
		
		//모든 포켓몬 스킬
		for(int i = 0; i < pokemonArr.length; i++) {
			pokemonArr[i].skill();
		}
		
	}

}
