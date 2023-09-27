package main;

public class TestClass {
	
	public void method01() throws Exception {
		System.out.println("method01 start ~");
		
//		try {
			method02();
//		} catch(Exception e) {  //예외객체 e
//			System.out.println("메소드01에서 잡았음");
//		}
		
		System.out.println("method01 end ...");
	}
	
	public void method02() throws Exception {
		System.out.println("method02 start ~");
//		int x = 3 / 0 ;  //예외가 발생하도록 유도하는,, // 예외객체 발생 : e
		throw new Exception(); //강제로 예외 발생
		
//		method03();
//		System.out.println("method02 end ...");
	}
	
	public void method03() {
		System.out.println("method03 start ~");
		System.out.println("method03 end ...");
	}

}
