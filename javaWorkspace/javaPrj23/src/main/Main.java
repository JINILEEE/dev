package main;

public class Main {

	public static void main(String[] args) {
		
		String s1 = new String("hello");
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = "hello";
		
		System.out.println(s2 == s1);
		System.out.println(s2 == s3);
		System.out.println(s2 == s4);

	}

}
