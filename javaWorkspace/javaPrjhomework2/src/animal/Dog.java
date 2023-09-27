package animal;

public class Dog extends Animal {

	private boolean hasShots; // 예방 접종 여부
	
	public Dog(String name, int age, boolean hasShots) {
	super("강아지", name, age);
	this.hasShots = hasShots;
	}
	
	@Override
	public void checkHealth() {
	super.checkHealth();
	System.out.println("강아지의 건강 상태를 확인합니다 ♡");
	}
	
	@Override
	public void vaccinate() {
	super.vaccinate();
	if (!hasShots) {
	System.out.println("강아지에게 예방 접종을 합니다 ♡\n");
	hasShots = true;
	} else {
	
	System.out.println("강아지는 이미 예방 접종을 받았습니다 ! ♡\n");
	}
	}

}