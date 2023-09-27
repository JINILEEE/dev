package main;

public class Run {

	public static void main(String[] args) {
		
		/*
		* <변수>
		*
		* 변수 : 값을 저장하는 공간
		*
		* [문법]
		* 변수(변수타입(종류)) x(변수이름(명)) = 10(값);
		* = 변수타입 변수명 = 값;
		*
		* - 값 의미 파악 용이함
		* - 여러 곳에서 동일한 값을 사용하는 경우 관리가 편리함
		* 
		* - 변수 타입들..
		* - 타입별 메모리 크기...
		* <변수명명 규칙>
		* - 예약어 사용 불가(예약어? ex. int x = 10;(가능) But, int int = 10;(불가능)
		* - snake_case : 띄어쓰기 하려면! ex) int student_score = 80; => camCase로 작성
		* 
		* <자바변수명명규칙>
		* 클래스 이름을 camelCase를 사용
		*
		*/

		//정수 : 기본이 int ☆
		byte a = 10;
		System.out.println(a);
		
		short b = 20;
		System.out.println(b);
		
		int c = 30;
		System.out.println(c);
		
		int d = 40;
		System.out.println(d);
		
		//실수 : 기본이 double
		float f = 3.14f; //3.14f 는 f의 3.14f라는 의미
		System.err.println(f);
		
		double x = 3.14;
		System.out.println(x);
		
		// 문자 (한 글자) <=> 문자열 : 문자배열 : 여러 개의 문자
		// 문자 : 작은따옴표로 표현
		// 문자열 : 쌍따옴표로 표현

		char y = 'A';  // 문자는 '' 작은따옴표로 표현함
		System.out.println(y);

		String s = "abcdefghijk";   // String에만 진한 글자가 아닌 이유 : 변수 중엔 기본자료형(String 제외한 모든), 참조자료형(String)이 있다.
		System.out.println(s);

		// 논리형
		boolean t = true;  //참을 의미하는.
		System.out.println(t);

		boolean fl = false;  //거짓을 의미하는.
		System.out.println(fl);
		
//		int stdScore = 10;  // integer : 정수형 변수
//		System.out.println(stdScore);  // 학생 성적
//		System.out.println(stdScore);
//		System.out.println(stdScore);
//		System.out.println(stdScore);
//		System.out.println(stdScore);
//		System.out.println(stdScore);
		
	}

}
