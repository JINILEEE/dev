package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== generic =====");
		
		MyBox<Integer> box = new MyBox<Integer>();
		
		box.data = 123;
	}

}
