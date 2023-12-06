package edu.kh.test.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.test.user.model.service.UserService;
import edu.kh.test.user.model.vo.UserDTO;

@WebServlet("/selectUser")
public class SelectUserServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
					
			//data
			String no = req.getParameter("no");
			
			//service
			UserService us = new UserService();
			UserDTO vo = us.selectUserByNo(no);
			
			//result
			if(vo == null) {
				throw new Exception();
			}
			req.setAttribute("vo", vo);
			req.getRequestDispatcher("/WEB-INF/views/searchSuccess.jsp").forward(req, resp);
			
		}catch(Exception e) {
			System.out.println("[ERROR-U001] 회원 정보 조회 실패...");
			e.printStackTrace();
			req.getRequestDispatcher("/WEB-INF/views/searchFail.jsp").forward(req, resp);
		}
		
		
	}
}//class
