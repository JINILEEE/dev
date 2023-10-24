package com.kh.mini.test;

import com.kh.mini.member.dao.MemberDao;
import com.kh.mini.member.service.MemberService;
import com.kh.mini.member.vo.MemberVo;

public class TestMain {

	public static void main(String[] args) {

		testMemberIdDup();
		
	}//main
	
	public static void testMemberIdDup() {
		try {
			//회원가입 아이디 중복 테스트
			MemberVo vo = new MemberVo();
			vo.setId("ADMIN");   // 중복된 아이디
			vo.setPwd("0000");
			vo.setNick("JJHDF");
			int result = new MemberService().join(vo);
			
			if(result == 1) {
				System.out.println("테스트 실패 ...");
			}else {
				System.out.println("테스트 성공 !!!");  //아이디 중복이니까 result 1 아닌게 성공
			}
			
		}catch(Exception e) {
			System.out.println("테스트 성공 !!!"); //아이디 중복이니까, 예외 발생하는게 정상
		}
	}// m01

}//class
