package com.kh.app.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService bs;
	
	//게시글 목록
	@GetMapping("board/list")
	public String getBoardList() {
		List<BoardVo> voList = bs.getBoardList();
		System.out.println(voList);
		return "board/list";
	}
	
	//게시글 작성화면
	@GetMapping("board/write")
	public String write() {
		return "board/write";
	}
	
	//게시글 작성처리
	@PostMapping("board/write")
	public String write(BoardVo vo) {
		
		//data
		
		//service
		int result = 1;
		
		//result
		if(result == 1) {
			System.out.println("클라이언트로부터 전달받은 vo :: " + vo);
			return "redirect:/board/list";
		}else {
			return "error";
		}
		
	}

}
