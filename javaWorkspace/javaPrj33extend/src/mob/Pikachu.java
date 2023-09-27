package mob;

public class Pikachu extends Pokemon {
	
	public Pikachu() {  //기본생성자
		
	}

	public void skill() {
		System.out.println("백만볼트 !");
	}

	public String toString() {
		return "Pikachu [name=" + name + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}

} //Class
