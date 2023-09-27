package animal;

class Animal {

	protected String species;
	protected String name;
	protected int age;
	
	public Animal(String species, String name, int age) {
		this.species = species;
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("종: " + species);
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "살");
	}
	
	public void checkHealth() {
		System.out.println("...");
		System.out.println("건강 상태를 확인합니다 ~");
	}
	
	public void vaccinate() {
		System.out.println("예방 접종을 합니다 !");
	}

}