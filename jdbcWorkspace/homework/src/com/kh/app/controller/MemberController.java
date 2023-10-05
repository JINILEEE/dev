package com.kh.app.controller;

import java.util.Scanner;

import com.kh.app.service.MemberService;

public class MemberController {

	// 멤버 변수 == 필드
	private final Scanner sc;
	private final MemberService ms;

	// 기본 생성자
	public MemberController() {
		sc = new Scanner(System.in);
		ms = new MemberService();
	}
	
	// 메뉴 선택
	public void selectMenu() {
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 회원 목록 조회");
		
		String n = sc.nextLine();
		
		switch(n) {
		case "1" : join();break;
		case "2" : login();break;
		case "3" : printMemberList();break;
		default : System.out.println("그런 메뉴 없음");
		}
	}

	// 회원가입

	// 서비스

	// 결과처리

	// 로그인

	// 서비스 호출

	// 결과처리

	// 회원 목록 조회

	// 데이터 준비

	// 서비스 호출
	// 결과처리

}// class
