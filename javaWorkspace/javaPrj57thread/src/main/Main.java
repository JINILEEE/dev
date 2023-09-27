package main;

public class Main {

	public static void main(String[] args) { //main thread
		
		System.out.println("===== 쓰레드 =====");
		
		Thread t0 = Thread.currentThread();
		
		String t0name = t0.getName();
		System.out.println(t0name);
		
		//스레드 생성 
		Thread t1 = new Thread(new KhClass());
		t1.setName("내가만든쓰레드");
		t1.start(); //start메소드 호출 -> create, run  // 메인스레드 가 실행하는거임

	} //main

} //class






