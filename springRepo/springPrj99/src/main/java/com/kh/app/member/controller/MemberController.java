package com.kh.app.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberController {

	private final MemberService service;
	
	//회원가입
	@PostMapping("join")
	public String join(MemberVo vo) throws Exception {
		
		int result = service.join(vo);
		if(result != 1) {
			throw new Exception();
		}
		
		return "redirect:/home";
	}
	
	//로그인
	@PostMapping("login")
	public String login(MemberVo vo, HttpSession session) throws Exception {
		
		MemberVo loginMember = service.login(vo);
		
		if(loginMember == null){
			throw new Exception("로그인 실패");
		}
		
		session.setAttribute("loginMember", loginMember);
		session.setAttribute("alertMsg", "로그인 성공!");
		return "redirect:/home";
	}
	
	//회원 정보 수정
	@PostMapping("edit")
	public String edit() {
		return "";
	}
	
	//회원 탈퇴
	@GetMapping("quit")
	public String quit() {
		return "";
	}
	
	
	//회원 목록 조회
	@GetMapping("list")
	public String list() {
		return "";
	}
	
}//class
