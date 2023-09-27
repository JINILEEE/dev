package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== 맥날 =====");
		
		Burger b1 = new Burger("슈비버거", 6300);
//		b1.setName("슈비버거");
//		b1.setPrice(6300);
		
		String s = b1.getName();
		System.out.println(s);
		
		int p = b1.getPrice();
		System.out.println(p);
		
	} //main

} //class
