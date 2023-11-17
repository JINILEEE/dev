package com.kh.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/member/logout")
public class MemberLogoutController extends HttpServlet{

	
	//로그아웃
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.invalidate();            //세션 지우는 것 == 로그아웃

//		req.getRequestDispatcher("/WEB-INF/view/home.jsp").forward(req, resp);
		resp.sendRedirect("/app14/home");  // 이제부터 이 경로로 진행한다.
		
	}
	
	
}
