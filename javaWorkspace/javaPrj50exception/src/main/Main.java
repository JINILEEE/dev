package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== 예외 처리 (throws) =====");
		
		TestClass tc = new TestClass();
		try {
			tc.method01();
		} catch (Exception e) {
			System.out.println("메인에서 잡았음");
		}
		

	}

}
