package mob;

public class Pokemon {
	
	//구성품==멤버 (변수, 메소드)
	
	// public : 구성요소가 있을 때는 앞에 접근제한자 를 앞에 써준다. ex)접근제한자 구성요소
	// 접근제한자 - public, protected, default, private
	public String name;
	public int hp;
	public int atk;
	public int def;
	
	public void attack() {
		System.out.println("공격!!!");
	}
	

}
