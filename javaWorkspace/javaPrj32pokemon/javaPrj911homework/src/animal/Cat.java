package animal;

public class Cat extends Animal {

	private boolean hasShots; // 예방 접종 여부
	
	public Cat(String name, int age, boolean hasShots) {
		super("고양이", name, age);
		this.hasShots = hasShots;
	}
	
	@Override
	public void checkHealth() {
		super.checkHealth();
		System.out.println("고양이의 건강 상태를 확인합니다 ♡");
	}
	
	@Override
	public void vaccinate() {
		super.vaccinate();
		if (!hasShots) {
			System.out.println("고양이에게 예방 접종을 합니다 ♡\n");
			hasShots = true;
		} else {
			System.out.println("고양이는 이미 예방 접종을 받았습니다 ! ♡\n");
		}
	
	}

}