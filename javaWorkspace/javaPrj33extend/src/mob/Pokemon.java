package mob;

public class Pokemon {
	
	public Pokemon() {
		
	}
	
	protected String name;  
	protected int hp;
	protected int atk;
	protected int def;
	
	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {  //외부에서 값이 들어옴 -> this.def가 곧 그 값이 됨. = def
		this.def = def;
	}

	public void bodyAttack() {
		System.out.println(name + "의 몸통박치기 !");
	}
	
	public void skill() {
		
	}

	public String toString() {
		return "Pokemon [name=" + name + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}
	

}//Class
