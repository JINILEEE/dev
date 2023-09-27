package main;

public class KhClass implements Runnable { //인터페이스(Runnable) 상속받기

	//현재 스레드의 이름을 출력하는
	@Override 
	public void run() {
		Thread x = Thread.currentThread();
		String str = x.getName(); 
		System.out.println(str);
	} 
	

}
