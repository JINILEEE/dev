package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("----- 인터페이스 -----");
		
		HongGilDong hong = new HongGilDong();
		hong.coding();
		hong.fishing();
		
//		if(hong instanceof Programmer) {	//instanceof 연산자 : ~타입의 객체 확인해주는 연산자 (프로그래머 타입의 객체인지 확인할 수 있음.)
//			System.out.println("프로그래머 맞음");
//		} else {
//			System.out.println("프로그래머 아님");
//		}
		
//		if(hong instanceof Fisherman) {	
//			System.out.println("낚시꾼 맞음");
//		} else {
//			System.out.println("낚시꾼 아님");
//		}
		
//		if(hong instanceof Pokemon) {	
//			System.out.println("포켓몬 맞음");
//		} else {
//			System.out.println("포켓몬 아님");
//		}
		
//		if(hong instanceof Object) {	
//			System.out.println("오브젝트 맞음");
//		} else {
//			System.out.println("오브젝트 아님");
//		}
		
//		Person p = new Person();
//		String s = p.say();
//		int cnt = p.walk();
//		p.eat();
	}

}
