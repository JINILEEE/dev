package main;

public class TestClass {
	
	public void method01() {
		System.out.println("method01 start ~");
		method02();
		System.out.println("method01 end ...");
	}
	
	public void method02() {
		System.out.println("method02 start ~");
		int[] arr = new int[3];
		
		try {
			System.out.println(1111);
//			arr[7] = 10;
			int x = 3 / 0 ;  // 예외가 발생할 것으로 의심되는 코드
			System.out.println(2222);
		} catch(Exception e) {	// 잡으려고 하는 예외종류
			System.out.println("잡았다");	// 예외를 잡아서 처리할 내용
		} 
//		catch(ArithmeticException y) {
//			System.out.println("0으로 나누려는 거 잡았다");
//		}
		
		method03();
		System.out.println("method02 end ...");
	}
	
	public void method03() {
		System.out.println("method03 start ~");
		System.out.println("method03 end ...");
	}

}
