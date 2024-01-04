package com.kh.app.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;
import com.kh.app.member.vo.MemberVo;

import lombok.RequiredArgsConstructor;

@RequestMapping("api/board")
@RequiredArgsConstructor
@RestController
@CrossOrigin("*")
public class BoardApiController {
	
	private final BoardService service;
	
	//게시글 목록 조회
	@GetMapping("list")
	public List<BoardVo> list() {
		return service.list();
	}
	
	//게시글 작성하기
	@PostMapping("write")
	public Map<String, String> write(@RequestBody BoardVo vo, HttpSession session) {
		
		//writerNo정보는 세션에서 가져온 데이터로 채움
		vo.setWriterNo("1");
		
		int result = service.insert(vo);
		
		Map<String, String> map = new HashMap<String, String>();
		
		if(result == 1) {
			map.put("msg", "good");
		}else {
			map.put("msg", "bad");
		}
		return map;
	}
	
}//class








