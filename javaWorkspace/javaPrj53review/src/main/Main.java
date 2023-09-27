package main;

public class Main {

	public static void main(String[] args) {

		System.out.println("===== 회원 =====");
		
		MemberManager mm = new MemberManager();
		
		while(true) {
			mm.startWork();
		}
		
		
	}

}
