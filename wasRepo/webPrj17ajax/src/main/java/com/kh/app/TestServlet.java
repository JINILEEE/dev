package com.kh.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("요청 받았음~~~~");
		PrintWriter out = resp.getWriter();
		
		BoardVo vo = new BoardVo();
		vo.setTitle("title01zzzz");
		vo.setContent("content02zzzz");
		
		// str = 객체를 JSON 형식으로 만들어주는 메소드(vo);
		String str = "{\"title\":\"ttt\",\"content\":\"ccc\"}";
		
		out.write(str);
		
	}
}//class
