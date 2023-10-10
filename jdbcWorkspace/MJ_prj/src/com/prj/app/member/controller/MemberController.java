package com.prj.app.member.controller;

import java.util.Scanner;

public class MemberController {
	
	//필드 == 멤버변수
	private final Scanner sc;
	
	//기본 생성자
	public MemberController() {
		sc = new Scanner(System.in);
	}
			
	// 메뉴선택
	public void selectMenu() {
		System.out.println("1. 캐릭터 생성");
		System.out.println("2. 캐릭터 선택");
		System.out.println("3. 캐릭터 목록 조회");
		System.out.println("4. 캐릭터 삭제");
		
		String num = sc.nextLine();
		
		switch(num) {
		case "1" : generate();break;
		case "2" : select();break;
		case "3" : printList();break;
		case "4" : delete();break;
		default : 	
		}
		
	}//selectMenu end
	
	
	// 캐릭터 생성
	public void generate() {
		
		System.out.println("------- 캐릭터 생성 -------");
		
		
		
	}//generate end
	
	
	// 캐릭터 선택
	public void select() {
		
	}//select end
	
	
	// 캐릭터 목록 조회
	public void printList() {
		
	}//printList end
	
	
	// 캐릭터 삭제
	public void delete() {
		
	}//delete end

}//class
