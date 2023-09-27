package mob;

import util.MyUtil;

public class Pokemon {  //Pokemon 클래스에는 3개의 생성자 존재하게 됨.
	
	//static 변수
	public static final String NAME01 = "피카츄";  //앞으로 이름을 바꿀 일이 없으니까 final 이용함.
	public static final String NAME02 = "파이리";
	public static final String NAME03 = "꼬부기";
	private static final int MIN_ATK = 20;  //private 접근제한자를 이용해서 내부에서만 사용하도록 함
	private static final int MAX_DEF = 20;
	
	//생성자
	public Pokemon(String name) {  //name값만 전달받는 생성자 생성. //파라미터(=매개변수) 1개만 존재
		this.name = name;
		this.hp = 100;  //100 고정 설정값					//체력
		this.atk = MyUtil.getRandomInt(MIN_ATK, 30);  //랜덤  //최소 공격력
		this.def = MyUtil.getRandomInt(1, MAX_DEF);  //랜덤  //최대 방어력
	}
	
	public Pokemon(String name, int hp, int atk, int def) {  // => 생성자 오버로딩(=위랑 '포켓몬'이란 이름 같은데 매개변수가 다름)
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	public Pokemon() {
		
	}

	//멤버 변수
	private String name;
	private int hp;
	private int atk;
	private int def;
	
	
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

	public void setDef(int def) {
		this.def = def;
	}
	
	
	public void bodyAttack() {
		System.out.println(this.name + "의 몸통박치기 ~! ");
	}
	
	public void skill() {
		System.out.println("스킬사용 ~!");
	}

	public String toString() {
		return "Pokemon [name = " + name + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}
	
}
