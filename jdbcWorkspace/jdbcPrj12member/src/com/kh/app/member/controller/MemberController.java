package com.kh.app.member.controller;

import java.util.Scanner;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;

public class MemberController {
	
	//필드 == 멤버변수
	private final Scanner sc;
	private final MemberService ms;
	
	//기본 생성자
	public MemberController() {
		sc = new Scanner(System.in);
		ms = new MemberService();
	}
	
	//메뉴선택
	
	//회원가입
	public void join() {
		System.out.println("----- 회원가입 -----");
		
		//데이터
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.print("비밀번호: ");
		String pwd = sc.nextLine();
		System.out.print("닉네임: ");
		String nick = sc.nextLine();
		
		MemberVo vo = new MemberVo();
		vo.setId(id);
		vo.setPwd(pwd);
		vo.setNick(nick);    //서비스 호출에 vo를 전달해 주려고
		
		//서비스 호출
		try {
			int result = ms.join(vo);  //insert 쿼리문이 실행되므로 int 타입으로 리턴됨
			//결과처리 
			if(result == 1) {
				System.out.println("회원가입 성공");
			}else {
				throw new Exception();
			}
		}catch(Exception e) {
			System.out.println("회원가입 실패");
			e.printStackTrace();
		}
		
	}//join end
	
	//로그인
	public void login() {
		System.out.println("----- 로그인 -----");
		
		// 데이터
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.print("비밀번호: ");
		String pwd = sc.nextLine();
		
		MemberVo vo = new MemberVo();
		vo.setId(id);
		vo.setPwd(pwd);
		
		// 서비스 호출
		MemberVo dbVo = ms.login(vo);
		

		// 결과처리
		if(dbVo != null) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
	}//login end
	
	//전체 회원목록 조회
	public void printMemberList() {
		// 데이터

		// 서비스 호출

		// 결과처리
	}//printMemberList end
	
	//회원탈퇴
	public void quit(){
		System.out.println("----- 회원탈퇴 -----");
		
		// 데이터
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.print("비밀번호: ");
		String pwd = sc.nextLine();
		
		MemberVo vo = new MemberVo();
		vo.setId(id);
		vo.setPwd(pwd);
		
		// 서비스 호출
		try {
			int result = ms.quit(vo);
			// 결과처리
			if(result == 1) {
				System.out.println("탈퇴 성공");
			}else {
				throw new Exception();
			}
		}catch(Exception e) {
			System.out.println("탈퇴 실패");
			e.printStackTrace();
		}
		
	}//quit end
	
	//비밀번호 변경
	public void editPwd() {
		System.out.println("----- 비밀번호 변경 -----");
		
		// 데이터
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.print("비밀번호: ");
		String pwd = sc.nextLine();
		
		MemberVo vo = new MemberVo();
		vo.setId(id);
		vo.setPwd(pwd);
		
		// 서비스 호출
		int result = ms.editPwd(vo);

		// 결과처리
		if(result == 1) {
			System.out.println("비밀번호 변경 성공");
		}else {
			System.out.println("비밀번호 변경 실패");
		}

	}//editPwd end

}
