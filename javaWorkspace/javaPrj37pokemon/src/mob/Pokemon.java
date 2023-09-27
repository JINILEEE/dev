package mob;

public abstract class Pokemon {
	
	public Pokemon(String name, int hp, int atk, int def) {
		super();
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}

	// 멤버 변수
	protected String name;   // protected : 내 자식에겐 허용.
	protected int hp;
	protected int atk;
	protected int def;
	
	// 멤버 메소드
	public void bodyAttack() {
		System.out.println(name + "의 몸통박치기~!");
	}
	
	public abstract void skill(); // 추상메소드 abstract -> 호출되지 않게 할 때 이용
								  // 추상화 : 클래스들의 공통적인 요소를 뽑아서 상위 클래스를 만들어내는 것
	
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

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

	public void setDef(int def) {
		this.def = def;
	}
	
	
	
	@Override	//이 메소드는 오버라이드 한 거임
	public String toString() {
		return "Pokemon [name:" + this.name + ", " + "hp:" + this.hp + ", " + "atk:" + this.atk + ", " + "def:" + this.def + "]";
	}
	
}
