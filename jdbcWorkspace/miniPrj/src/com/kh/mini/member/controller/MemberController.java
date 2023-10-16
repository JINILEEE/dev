package com.kh.mini.member.controller;

import com.kh.mini.main.Main;
import com.kh.mini.member.service.MemberService;
import com.kh.mini.member.vo.MemberVo;

public class MemberController {

	private final MemberService service;
	
	public MemberController() {
		service = new MemberService();
	}
	
	//메뉴선택
	public void selectMenu() {
		System.out.println("===== MEMber =====");
		
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		
		String num = Main.SC.nextLine();
		
		switch(num) {
		case "1" : join();break;
		case "2" : login();break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
	}//selectMenu end
	
	/*
	 * <컨트롤러>
	 * 데이터
	 * 서비스 호출
	 * 결과처리
	 * */
	
	
	/**
	 * 회원가입
	 * 
	 * 클라이언트로부터
	 * 아이디, 패스워드, 닉네임 을 입력받아서 DB에 저장
	 * 
	 * INSERT INTO MEMBER(NO, ID, PWD, NICK)
	 * VALUES (SEQ_MEMBER_NO.NEXTVAL, 아이디, 패스워드, 닉네임);
	 */
	public void join() {
		try {
			System.out.println("------- 회원가입 -------");
			
			//데이터
			System.out.print("아이디: ");
			String id = Main.SC.nextLine();
			System.out.print("패스워드: ");
			String pwd = Main.SC.nextLine();
			System.out.print("닉네임: ");
			String nick = Main.SC.nextLine();
			
			MemberVo vo = new MemberVo();
			vo.setId(id);
			vo.setPwd(pwd);
			vo.setNick(nick);
			
			//서비스 호출
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
		
	}//end join
	
	/**
	 * 로그인
	 * 
	 * 아이디, 비번 입력받기
	 * DB에서 1개 행 조회 - 아이디가 중복 안되므로...
	 * 
	 * SELECT * FROM MEMBER
	 * WHERE ID = 아이디 AND PWD = 패스워드
	 */
	public void login() {
		try {
			System.out.println("------- 로그인 -------");
			
			//데이터
			System.out.print("아이디: ");
			String id = Main.SC.nextLine();
			System.out.print("패스워드: ");
			String pwd = Main.SC.nextLine();
			
			MemberVo vo = new MemberVo();
			vo.setId(id);
			vo.setPwd(pwd);
			
			//서비스
			MemberVo x = service.login(vo);
			
			//결과
			if(x == null) {
				throw new Exception();
			}
			System.out.println("로그인 성공 !!!");
		}catch(Exception e) {
			System.out.println("로그인 실패 ...");
			e.printStackTrace();
		}
		
	}
	
	//회원 탈퇴
	
	//마이페이지(현재 로그인한 본인 정보 조회)
	
	//비밀번호 수정
	
	//닉네임 수정
	
	//전체 회원 조회     (관리자만 가능)
	
	//회원 조회 - 번호   (관리자만 가능)
	
	//회원 조회 - 아이디  (관리자만 가능)
	
	//회원 조회 - 닉네임  (관리자만 가능)
	
	//회원 강제탈퇴      (관리자만 가능)
	
	
}//class
