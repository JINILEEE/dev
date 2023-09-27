package main;

import java.util.Scanner;

import manager.BattleManager;
import manager.PokemonManager;
import mob.Pokemon;

public class Main {
	
	public static Pokemon userPokemon;
	public static Pokemon enemyPokemon;
	public static final Scanner sc = new Scanner(System.in);  //public-어디서든 사용되게, final-수정하지 않을 거니까 고정되게. 
	

	public static void main(String[] args) {
		
		System.out.println("====== 포켓몬ver0905 ======");
		
		PokemonManager pokemonManager = new PokemonManager();
		BattleManager battleManager = new BattleManager();
		
		//포켓몬 선택
		pokemonManager.selectPokemon();
		
		//배틀
		battleManager.startBattle();
		
		//프로그램 종료
		System.out.println("====== 프로그램 종료 ======");
		
	}
	
}
