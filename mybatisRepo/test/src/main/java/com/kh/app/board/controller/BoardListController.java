package com.kh.app.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;

@WebServlet("/board/list")
public class BoardListController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			//data
			
			//service
			BoardService bs = new BoardService();
			List<BoardVo> voList = bs.selectBoardList();
			
			//result
			for(BoardVo vo:voList) {
				System.out.println(vo);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}//class
