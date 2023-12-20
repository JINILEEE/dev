package com.kh.app.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;

@Controller
public class BoardController {

	@Autowired
	private BoardService bs;
	
	//게시글 목록
	@GetMapping("/board/list")
	public String getBoardList() {
		List<BoardVo> voList = bs.getBoardList();
	}
	
	//게시글 작성화면
	
	//게시글 작성처리
	
}
