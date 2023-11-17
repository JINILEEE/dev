package com.kh.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;

@WebServlet("/member/join")
public class MemberJoinController extends HttpServlet{

	//회원가입 화면
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/join.jsp").forward(req, resp);
	}

	// 회원가입 처리
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			//data
			String memberId = req.getParameter("memberId");   // 요청받은 key-value 데이터에서 input 태그의 name 값만을 이용해 가져오는 것이다.
			String memberPwd = req.getParameter("memberPwd");
			String memberPwd2 = req.getParameter("memberPwd2");
			String memberNick = req.getParameter("memberNick");
			
			MemberVo vo = new MemberVo();
			vo.setMemberId(memberId);
			vo.setMemberPwd(memberPwd);
			vo.setMemberPwd2(memberPwd2);
			vo.setMemberNick(memberNick);
			
			//service
			MemberService ms = new MemberService();
			int result = ms.join(vo);
			
			//result (==view(==문자열내보내기==화면))
//			if(result == 1) {
//				req.getRequestDispatcher("/WEB-INF/views/common/success.jsp").forward(req, resp);
//			}else {
//				throw new Exception();
//			}
			
			// if, else 모든 분기점을 사용한 코드보다 아래와 같이 간단하게 if 처리만 해두는 방식으로 작성하기!!!
			// 가능한 분기점은 적게 사용하는 것이 좋다!!!
			if(result != 1) {
				throw new Exception();
			}
			req.getRequestDispatcher("/WEB-INF/views/common/success.jsp").forward(req, resp);
		}catch(Exception e) {
			req.getRequestDispatcher("/WEB-INF/views/common/fail.jsp").forward(req, resp);
			e.printStackTrace();
			System.out.println("회원가입 중 에러발생...");
		}
		
	}
	
	
}//class
