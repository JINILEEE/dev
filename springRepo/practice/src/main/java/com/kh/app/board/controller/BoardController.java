package com.kh.app.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;

import lombok.RequiredArgsConstructor;
import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardController {

	private final BoardService service;
	
	//게시글 작성
	@PostMapping("write")
	public void write(BoardVo vo) {
		int result = service.write(vo);
		System.out.println("게시글 작성 결과 : " + result);
	}
	
	//게시글 목록보기
	@GetMapping("list")
	public void list() {
		List<BoardVo> voList = service.list();
		System.out.println("게시글 조회 결과 : " + voList);
	}
	
	//게시글 상세조회
	@GetMapping("detail")
	public void detail(String no) {
		BoardVo vo = service.detail(no);
		System.out.println("게시글 조회결과 : " + vo);
	}
	
	//게시글 수정
	@PostMapping("edit")
	public void edit(BoardVo vo) {
		int result = service.edit(vo);
		System.out.println("게시글 수정 결과 : " + result);
	}
	
	//게시글 삭제
	@GetMapping("delete")
	public void delete(String no) {
		int result = service.delete(no);
		System.out.println("게시글 삭제 결과 : " + result);
	}
	
}
