package com.ncs.test.member.controller.MemberController;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncs.test.member.model.service.MemberService.MemberService;
import com.ncs.test.member.model.vo.Member.MemberVo;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberController {

	private final MemberService service;

	//로그인 처리
	@PostMapping("login")
	public String memberLogin(MemberVo memberResultSet, HttpSession session) throws Exception {
		
		MemberVo loginMember = service.login(memberResultSet);
		
		if(loginMember == null){
			session.setAttribute("alertMsg", "로그인 실패");
			throw new Exception("로그인 실패");
		}
		
		session.setAttribute("loginMember", loginMember);
		session.setAttribute("alertMsg", "로그인 성공!");
		return "redirect:/home";
	}
	
}
