package main;

import memberData.MemberController;

public class MainPrj61review {

	public static void main(String[] args) {

		System.out.println("===== 회원관리 =====");
		
		MemberController mc = new MemberController();
		
		//회원가입
//		mc.join();
		
		//로그인
		mc.login();
		
	}//main

}//class
