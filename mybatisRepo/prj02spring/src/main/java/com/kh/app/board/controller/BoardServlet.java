package com.kh.app.board.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/*")
public class BoardServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uri = req.getRequestURI(); //특정 컨트롤러 불러오기 위해서 
		String method =req.getMethod(); 
		
		String data1 = req.getParameter("title");
		String data2 = req.getParameter("content");
		String data3 = req.getParameter("");
		String data4 = req.getParameter("");
		String data5 = req.getParameter("");
		
		HashMap<String, String> dataMap = new HashMap<String, String>();
		dataMap.put("title", data1);
		dataMap.put("content", data2);
		dataMap.put("~~~", data3);
		dataMap.put("~~~", data4);
		dataMap.put("~~~", data5);
		
		String result = "";
		if(uri.equals("/board/list") && method.equals("GET")) {
			result = new BoardController().selectList(dataMap);
		}else if(uri.equals("/board/write") && method.equals("GET")) {
			result = new BoardController().showBoardWritePage(dataMap);
		}else if(uri.equals("/board/write") && method.equals("POST")) {
			result = new BoardController().insertBoard(dataMap);
		}else if(uri.equals("/board/edit") && method.equals("GET")) {
			result = new BoardController().insertBoard(dataMap);
		}else if(uri.equals("/board/edit") && method.equals("POST")) {
			result = new BoardController().insertBoard(dataMap);
		}else if(uri.equals("/board/delete") && method.equals("POST")) {
			result = new BoardController().insertBoard(dataMap);
		}
			
		//view resolve
		if(result.startsWith("redirect:")) {
			resp.sendRedirect(result);
		}else {
			String a = "/WEB-INF/views";
			String b = ".jsp";
			req.getRequestDispatcher(a + result + b).forward(req, resp);
		}
			
		
	}//service
	
}//class
