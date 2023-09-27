package animal;

public class AnimalHospital {

	private Animal[] patients;
	private int currentPatients;

	public AnimalHospital(int capacity) {
	patients = new Animal[capacity];
	currentPatients = 0;
	}
	
	public void admitAnimal(Animal animal) {
	if (currentPatients < patients.length) {
	patients[currentPatients++] = animal;
	} else {
	System.out.println("병원이 만원입니다.");
	}
	}
	
	public void treatPatients() {
	for (int i = 0; i < currentPatients; i++) {
	System.out.println("< 환자 " + (i + 1) + " >");
	patients[i].displayInfo();
	patients[i].checkHealth();
	patients[i].vaccinate();
	System.out.println();
	}
	
	}

}