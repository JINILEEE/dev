package mob;

public class Turtle extends Pokemon {

	public Turtle(int hp, int atk, int def) {
		super("꼬부기", hp, atk, def);
	}
	
	public void skill() {
		System.out.println("물대포 !");
	}


}
