package com.kh.app.board.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;

//@Controller
//@ResponseBody   	//리턴값을 그대로 화면에 보여주는 어노테이션
@RestController     // @Controller + @ResponseBody
public class BoardController {

	private final BoardService bs;   //재할당이 불가능하도록 final 작성
	
	//이렇게 기본 생성자를 만들어서 직접 객체 할당해주면 위에 final사용할 수 있다!!!
	public BoardController(BoardService bs) {
		this.bs = bs; 
	}
	
	//게시글 작성
	@PostMapping("/board/write")
	public HashMap<String, String> write(BoardVo vo) {
		int result = bs.write(vo);
		System.out.println("게시글 작성 result : " + result);
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("msg", "gooooooooooood!!!!!!!");
		
		return map;
	}
	
}//class
