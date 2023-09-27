package mob;

public class Pokemon {
	
	//멤버==구성요소 (멤버변수,멤버메소드)
	
	public String name;  //public, 즉 접근제한자가 없으면 빨간줄 그어짐 -> 다른 클래스에서도 사용할 수 있게 해야함.
	public int hp;
	public int atk;
	
	
	public void attack() {
		System.out.println("공격.");
	}

}
