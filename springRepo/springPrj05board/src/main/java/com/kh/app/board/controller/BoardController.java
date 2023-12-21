package com.kh.app.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("board")      //class위에 이렇게 작성해주면 아래의 모든 url은 /board/~ 가 된다!!
@RequiredArgsConstructor
public class BoardController {

	private final BoardService service;
	
	// 위에서 서비스 호출 시 final이 있는 필드면 값이 바로 있어야하므로 이 생성자를 만들어서 값을채워둔다. ==  @RequiredArgsConstructor
//	public BoardController(BoardService x) {
//		this.service = x;
//	}	
	
	// 게시글 작성하기
	@PostMapping("insert")
	public void insert(BoardVo vo) {
		
		//data - 위에 파라미터로 (BoardVo vo) 적었으므로 끝!
		
		//service
		int result = service.insert(vo);
		
		//result
		System.out.println("insert > result : " + result);
		
	}
	
	// 게시글 목록조회
	@GetMapping("list")
	public void selectList() {
		
	}
	
	// 게시글 상세조회
	@GetMapping("detail")
	public void selectOne() {
		
	}
	
	// 게시글 삭제하기
	@GetMapping("delete")
	public void delete() {
		
		
	}
	
	
	// 게시글 수정하기
	@PostMapping("edit")
	public void edit() {
		
	}
	
	
}
