package main;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println( 13*2==26 || 13+10+3==27-1 );
		System.out.println( 13*2==26 || 24!=21 );
		System.out.println( 0 <= -5 );
		System.out.println( 24 != 24 );
		System.out.println( 11/11+3>=4 && 8*2-12==3 );
		
		int age = 15;
		//변수타입 isAdult = 논리값(true/false);
		boolean isAdult = age >= 20;

		System.out.println(age + "살이면, 성인이 맞는지?");  // + 가 없으면 에러가 난다. 하지만 추가하니까 출력됨. 
//														 →  int + int ⇒ int
//														double + double ⇒ double 
//														String + String ⇒ String
//														타입이 같아야만 연산가능, 문자열과 문자열이 같아야 연산가능
//														ex) 
//														int r = 10;
//														double pi = 3.14;
//														System.out.println( r + pi ); //데이터 손실이 더 적은 쪽으로 컴퓨터가 판단함.
																					  //그래서 int + double로 계산할 수 있는 것임
																					  //같은 이유로 위에도 int + String 이 가능한 거임

		System.out.println(isAdult);

	}

}
