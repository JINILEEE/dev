package com.kh.miniPractice.member.controller;

import com.kh.miniPractice.main.Main;
import com.kh.miniPractice.member.service.MemberService;
import com.kh.miniPractice.member.vo.MemberVo;

public class MemberController {
	
	private final MemberService service;
	
	//기본생성자
	public MemberController() {
		service = new MemberService();
	}

	// 메뉴선택
	public void selectMenu() {
		System.out.println("======= MEMBER =======");
		
		System.out.println("1. 회원가입");
		
		String num = Main.SC.nextLine();
		
		switch(num) {
		case "1" : join();break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
		
	}//selectMenu end
	
	// 회원가입
	public void join() {
		
		try {
			System.out.println("------- 회원가입 -------");
			
			// 데이터
			System.out.print("아이디: ");
			String id = Main.SC.nextLine();
			System.out.print("비밀번호: ");
			String pwd = Main.SC.nextLine();
			System.out.print("닉네임: ");
			String nick = Main.SC.nextLine();
			
			MemberVo vo = new MemberVo();
			vo.setId(id);
			vo.setPwd(pwd);
			vo.setNick(nick);
			
			// 서비스
			int result = service.join(vo);
			
			// 결과처리
			if(result != 1) {
				throw new Exception();
			}
			
			System.out.println("회원가입 성공 !!!");
		}catch(Exception e) {
			System.out.println("회원가입 실패 ...");
			e.printStackTrace();
		}
		
	}//join end
	
}//class
