package com.kh.app.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/reply/list")
public class BoardReplyListController extends HttpServlet{

	// 댓글 목록 조회하여 JSON 형태로 문자열 내보내기
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//data
		
		//service
		
		//result (replyVoList 를 JSON 문자열로 바꿔서 내보내기 - GSON 활용 예정)
	
	}
}//class
