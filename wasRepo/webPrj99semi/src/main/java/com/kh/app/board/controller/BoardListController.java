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

	// 게시글 목록 화면
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			//data
			
			//service
			BoardService bs = new BoardService();
			List<BoardVo> boardVoList = bs.selectBoardList();
			
			//result (==view)
			req.setAttribute("boardVoList", boardVoList);  //x라는 키값을 통해 boardVoList에 있는 값을 꺼내올 수 있다.
			req.getRequestDispatcher("/WEB-INF/views/board/list.jsp").forward(req, resp);
			
			
		}catch(Exception e) {
			System.out.println("[ERROR-B001]게시글 목록 조회 중 에러 발생 ...");
			e.printStackTrace();
			req.setAttribute("errorMsg", "게시글 목록 조회 에러");
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
	}//doget
		
}//class
