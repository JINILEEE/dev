package com.kh.app.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/join")
public class MemberJoinServlet extends HttpServlet{
	
	// 회원가입 화면
	// 요펑이 GET 방식일 때 동작
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/member/join.jsp").forward(req, resp);
		
	}
	
	// 회원가입 처리
	// 요청이 POST 방식일 때 동작
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 데이터
		String memberId = req.getParameter("memberId");
		String memberPwd = req.getParameter("memberPwd");
		String memberPwd2 = req.getParameter("memberPwd2");
		String memberNick = req.getParameter("memberNick");
		
		// 서비스
		int result = 0;
		if(memberPwd.equals(memberPwd2)) {
			result = 1;
		}
		
		// 결과
		req.setAttribute("str", "회원가입");
		if(result == 1) {
			req.getRequestDispatcher("/WEB-INF/views/common/success.jsp").forward(req, resp);
		}else {
			req.getRequestDispatcher("/WEB-INF/views/common/fail.jsp").forward(req, resp);
		}
		
	}
	
}
