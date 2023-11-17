package com.kh.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;

@WebServlet("/member/login")
public class MemberLoginController extends HttpServlet {
	// 로그인 화면
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/login.jsp").forward(req, resp);

	}

	// 로그인 처리
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {

			// 데이터
			String memberId = req.getParameter("memberId");
			String memberPwd = req.getParameter("memberPwd");

			MemberVo vo = new MemberVo();
			vo.setMemberId(memberId);
			vo.setMemberPwd(memberPwd);

			// 서비스
			MemberService ms = new MemberService();
			MemberVo loginMember = ms.login(vo);

			// 결과 == 문자열 보내기
			if(loginMember == null) {
				throw new Exception();
			}
			
			// 세션에 로그인유저 정보 담기
			HttpSession session = req.getSession();
			session.setAttribute("userData", loginMember);
			
//			req.getRequestDispatcher("/WEB-INF/views/common/success.jsp").forward(req, resp);
			resp.sendRedirect("/app14/home");
		} catch (Exception e) {
			System.out.println("로그인 에러 발생");
			req.getRequestDispatcher("/WEB-INF/views/common/fail.jsp").forward(req, resp);
			e.printStackTrace();
		}

	}
}