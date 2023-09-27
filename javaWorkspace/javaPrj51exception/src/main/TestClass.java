package main;

public class TestClass {
	
	public void method01() {
		System.out.println("method01 start");
		method02();
		System.out.println("method01 end");
	}
	
	public void method02() {
		System.out.println("method02 start");
		try {
//			throw new Exception("kk");
			throw new KhException();
		} catch(Exception e) {
			System.out.println("예외 발생.");
			System.out.println(e.getMessage());
		}
		method03();
		System.out.println("method02 end");
	}
	
	public void method_02() {
		System.out.println("method02 start");
		
		try {
			//예외 발생 의심 코드
			System.out.println(1111);
			int x  = 1/1;
			System.out.println(2222);
		} catch(Exception e) { //잡으려는 예외 타입
			//예외를 잡은 후, 실행할 내용
			System.out.println("예외 발생함");
//			System.out.println(e);
//			System.out.println(e.getMessage());
//			e.printStackTrace();
		} finally {
			System.out.println("- 파이널리 블록 -");
		}
		
		method03();
		System.out.println("method02 end");
	}
	
	public void method03() {
		System.out.println("method03 start");
		System.out.println("method03 end");
	}

}
