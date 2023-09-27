package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		// 소수 판별
		
		
		// 정수 입력받기
		Scanner sc = new Scanner(System.in);  //스캐너 객체 준비
		int num = sc.nextInt(); 
		
		// 소수인지 판단
		// - 약수가 2개 (1과 자신)
		// ==> 1,자신 빼고 다른 수로 나누어 떨어지면 안됨.
		
		// 2 ~ num-1 중에서 num이랑 나누었을 때, 나누어 떨어지는지?
		boolean isPrime = true;  // 소수인지 확인 -> 일단 맞다고 해두고 아래 과정에서 확인
		for(int i = 2; i < num; i++) {
			if(num % i == 0) { 
				isPrime = false;
			}
		}
		
		// 결과 출력

		String str = "";
		
		//삼항연산자  //조건 ? A : B  
		// 아래 두 줄의 주석 내용은 동작하긴 하지만 가급적 하지말기,,,
		//+삼항연산자는 중첩해서 사용할 수 있음.(가능하다고만 알고 있기! but, 읽기 좋은거 하기)
		// => str = num == 1 ? "not prime" : isPrime ? "Prime" : isPrime
		str = isPrime ? "prime" : "not prime";  //소수가 맞으면 "prime"출력, 아니면 "not prime"출력됨
		if(num == 1) {
			System.out.println("not prime");
		} else {
		System.out.println(str);
		}
		
//		if(isPrime) {
//			System.out.println("Prime");
//		} else {
//			System.out.println("not prime");
//		}
		
		
	}

}
