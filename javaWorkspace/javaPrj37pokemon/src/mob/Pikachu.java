package mob;

public class Pikachu extends Pokemon {
	
	public Pikachu(int hp, int atk, int def) {
		super("피카츄", hp, atk, def);	//부모 만들기(Pokemon)
	}

	public void skill() {
		System.out.println("백만볼트 !");
	}
	
}
