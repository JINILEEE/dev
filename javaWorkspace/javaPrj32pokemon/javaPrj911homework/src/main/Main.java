package main;

import animal.AnimalHospital;
import animal.Cat;
import animal.Dog;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("| +++ 동물병원 +++ |");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
		
	    AnimalHospital hospital = new AnimalHospital(7);
	
	    Dog dog1 = new Dog("뽀이", 5, true);
	    Dog dog2 = new Dog("가을이", 7, true);
	    Dog dog3 = new Dog("꾸꾸", 9, true);
	    Dog dog4 = new Dog("미소", 9, false);
	    Dog dog5 = new Dog("뭉치", 1, false);
	    Cat cat1 = new Cat("리드", 4, true);
	    Cat cat2 = new Cat("다올이", 1, false);
	    
	    hospital.admitAnimal(dog1);
	    hospital.admitAnimal(dog2);
	    hospital.admitAnimal(dog3);
	    hospital.admitAnimal(dog4);
	    hospital.admitAnimal(dog5);
	    hospital.admitAnimal(cat1);
	    hospital.admitAnimal(cat2);
	
	    hospital.treatPatients();
	}

}