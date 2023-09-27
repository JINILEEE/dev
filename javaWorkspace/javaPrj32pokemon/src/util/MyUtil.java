package util;

public class MyUtil {
	
	//특정 범위의 랜덤값 얻어오기			//start ~ end 사이
	public static int getRandomInt(int start, int end) {  //static -> 객체와 관련없이 독립적이게 됨
		if(start > end) {
			System.out.println("잘못된 범위입니다.");
			return -1;  // -1 이유 : 
		}
		int range = end - start + 1; // range(범위)  // +1 이유 : 
		return (int) (Math.random() * range + start);  // 
	}

}
