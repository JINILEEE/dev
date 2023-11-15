package com.kh.app.home;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/" , "/home" , "/home/*"})  // "/" 로 작성하거나 "/home" , "/home/뒤에 어떤 문자열이 와도 다 포함"으로 요청해도 다 잘 나온다.
public class HomeServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
		
	}
	
}
