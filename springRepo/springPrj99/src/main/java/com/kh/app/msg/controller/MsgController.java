package com.kh.app.msg.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.app.board.vo.BoardVo;

@RestController
@RequestMapping("msg")
public class MsgController {

	@PostMapping
	public void m01(String str) {
		
		//객체 만들기
//		BoardVo vo = new BoardVo();
//		vo.setTitle(str);
//		vo.setContent(str);
//		vo.setWriterNick(str);
		
		// builder사용해서 객체 들기
		BoardVo
			.builder()
			.no("777")
			.title("제목01")
			.content("내용01")
			.writerNick("작성자닉네임01")
			.build();
		
		System.out.println("str:::: " + str);
		
	}
	
}
