package com.prj.app.member.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.prj.app.member.service.MemberService;
import com.prj.app.member.vo.MemberVo;

public class MemberController {
	
	//필드 == 멤버변수
	private final Scanner sc;
	private final MemberService ms;
	
	//기본 생성자
	public MemberController() {
		sc = new Scanner(System.in);
		ms = new MemberService();
	}
			
	// 메뉴선택
	public void selectMenu() {
		System.out.println("1. 캐릭터 생성");
		System.out.println("2. 캐릭터 선택");
		System.out.println("3. 캐릭터 목록 조회");
		System.out.println("4. 캐릭터 키우기");
		System.out.println("5. 캐릭터 삭제");
		
		String num = sc.nextLine();
		
		switch(num) {
		case "1" : generate();break;
		case "2" : select();break;
		case "3" : printList();break;
		case "4" : raise();break;
		case "5" : delete();break;
		default : System.out.println("1 - 5 사이의 숫자를 골라주세요.")	;
		}
		
	}//selectMenu end
	
	
	// 캐릭터 생성
	public void generate() {
		
		System.out.println("------- 캐릭터 생성 -------");
		
		//데이터 입력받기
		System.out.print("캐릭터 이름: ");
		String charName = sc.nextLine();
		System.out.print("접속코드: ");
		String charPwd = sc.nextLine();
		
		MemberVo vo = new MemberVo();
		vo.setCharName(charName);
		vo.setCharPwd(charPwd);
		
		//서비스 호출
		try {
			int result = ms.generate(vo);
			
			//결과 출력
			if(result == 1) {
				System.out.println("캐릭터 생성 성공!!!");
			}else {
				throw new Exception();
			}
		}catch(Exception e) {
			System.out.println("캐릭터 생성 실패...");
			e.printStackTrace();
		}
		
	}//generate end
	
	
	// 캐릭터 선택
	public void select() {
		
		System.out.println("------- 캐릭터 선택 -------");
		
		//데이터 입력받기
		System.out.print("접속할 캐릭터: ");
		String charName = sc.nextLine();
		System.out.print("접속 코드: ");
		String charPwd = sc.nextLine();
		
		MemberVo vo = new MemberVo();
		vo.setCharName(charName);
		vo.setCharPwd(charPwd);
		
		//서비스 호출
		MemberVo dbVo;
		
		try {
			dbVo = ms.select(vo);
			
			//결과 출력
			if(dbVo != null) {
				System.out.println("캐릭터 선택 완료!!!");
				System.out.println("캐릭터 정보: " + vo);
			}else {
				throw new Exception();
			}
			
		}catch(Exception e) {
			System.out.println("캐릭터 선택 실패...");
			e.printStackTrace();
		}
		
	}//select end
	
	
	// 캐릭터 목록 조회
	public void printList() {
		
		System.out.println("------- 전체 캐릭터 조회 -------");
		
		//서비스 호출
		try {
			ArrayList<MemberVo> voList = ms.printList();
			
			//결과 출력
			if(voList.isEmpty()) {
				System.out.println("캐릭터 없음...캐릭터를 생성해주세요!!");
				return;
			}
			for(MemberVo vo : voList) {
				System.out.println(vo);
			}
		}catch(Exception e) {
			System.out.println("캐릭터 목록 조회 실패");
			e.printStackTrace();
		}
	}//printList end
	
	
	// 캐릭터 키우기 // 밥 주면 허기짐이 차서 일정량이 넘으면 잠자기로 넘어감
	public void raise() {
		
		System.out.println("------- 캐릭터 키우기 -------");
		
		//데이터 입력받기
		
		//서비스 호출
		
		//결과 출력
		
	}//raise end
	
	
	// 캐릭터 삭제
	public void delete() {
		
		System.out.println("------- 캐릭터 방출 -------");
		
		//데이터 입력받기
		System.out.print("캐릭터 이름: ");
		String charName = sc.nextLine();
		System.out.print("접속코드: ");
		String charPwd = sc.nextLine();
		
		MemberVo vo = new MemberVo();
		vo.setCharName(charName);
		vo.setCharPwd(charPwd);
		
		//서비스 호출
		int result = ms.delete(vo);
		
		//결과 출력
		if(result ==1) {
			System.out.println("캐릭터 방출 성공");
		}else {
			throw new Exception();
		}
		
		
	}//delete end

}//class
