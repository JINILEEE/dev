package manager;

import java.util.Scanner;

import main.Main;
import mob.Pokemon;

public class PokemonManager {

	// 포켓몬 선택
	public void selectPokemon() {
		// 포켓몬 생성
		generatePokemon();	//(this.generatePokemon) => 현재 객체.generatePokemon : 현재 객체 안에 있는 메소드
		// 포켓몬 정보 출력
		printPokemonInfo();
		// 유저한테 입력받기
		int num = scanUserInput();
		// 입력받은 정보를 이용하여 유저포켓몬 준비
		setUserPokemon(num);
		// 적 포켓몬 설정
		setEnemyPokemon();
		
	}

	private void setEnemyPokemon() {
		int num = (int) (Math.random() * 3 + 1);  //Math 라는 static 메소드를 호출함
		switch(num) {
		case 1 : Main.enemyPokemon = Main.p1; break;
		case 2 : Main.enemyPokemon = Main.p2; break;
		case 3 : Main.enemyPokemon = Main.p3; break;
		}
	}

	private void setUserPokemon(int num) { //변수 이름에 아무거나 써도됨 (int abc)가능.
		switch(num) {
		case 1 : Main.userPokemon = Main.p1; break;
		case 2 : Main.userPokemon = Main.p2; break;
		case 3 : Main.userPokemon = Main.p3; break;
		}
	}

	private int scanUserInput() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;  //유저한테입력받은값;
	}

	private void printPokemonInfo() {
		System.out.println("------ 포켓몬 목록 ------");
		System.out.println(Main.p1.toString());
		System.out.println(Main.p2.toString());
		System.out.println(Main.p3.toString());
	}

	private void generatePokemon() {
		Main.p1 = new Pokemon("피카츄", 100, 30, 5);  //p1이라는 변수는 static 변수이다.
		Main.p2 = new Pokemon("파이리", 100, 33, 3);
		Main.p3 = new Pokemon("꼬부기", 100, 25, 10);
	}
	
	

}
