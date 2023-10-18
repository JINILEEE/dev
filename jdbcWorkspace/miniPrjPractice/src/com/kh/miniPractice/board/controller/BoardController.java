package com.kh.miniPractice.board.controller;

import java.util.List;

import com.kh.miniPractice.board.service.BoardService;
import com.kh.miniPractice.board.vo.BoardVo;
import com.kh.miniPractice.main.Main;

public class BoardController {
	
	//필드
	private final BoardService service;
	
	// 기본 생성자
	public BoardController() {
		service = new BoardService();
	}
	
	public void selectMenu() {
		
		System.out.println("======= BOARD =======");
		
		System.out.println("1. 게시글 작성");
		System.out.println("2. 게시글 목록 (최신순)");
		
		String num = Main.SC.nextLine();
		
		switch(num) {
		case "1" : write();break;
		case "2" : boardList();break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
	}//selectMenu end
	
	public void write() {
		
		try {
			System.out.println("------- 게시글 작성 -------");
			
			// 로그인 여부 체크
			if(Main.loginMember == null) {
				throw new Exception("회원만 게시글 작성이 가능합니다.");
			}
			
			// 데이터
			System.out.print("제목: ");
			String title = Main.SC.nextLine();
			System.out.print("내용: ");
			String content = Main.SC.nextLine();
			
			BoardVo vo = new BoardVo();
			vo.setTitle(title);
			vo.setContent(content);
			
			// 서비스
			int result = service.write(vo);
			
			//결과
			if(result != 1) {
				throw new Exception();
			}
			System.out.println("게시글 작성 성공 !!!");
		}catch(Exception e) {
			System.out.println("게시글 작성 실패 ...");
			e.printStackTrace();
		}
		
	}//write end
	
	public void boardList() {
		
		try {
			System.out.println("------- 게시글 목록 (최신순) -------");
			
			// 데이터
			
			// 서비스
			List<BoardVo> voList = service.boardList();
			
			// 결과
			System.out.print("번호");
			System.out.print("/");
			System.out.print("제목");
			System.out.print("/");
			System.out.print("닉네임");
			System.out.print("/");
			System.out.print("조회수");
			System.out.print("/");
			System.out.print("작성일자");
			System.out.println();
			
			for(BoardVo vo : voList) {
				System.out.print(vo.getNo());
				System.out.print("/");
				System.out.print(vo.getTitle());
				System.out.print("/");
				System.out.print(vo.getWriterNick());
				System.out.print("/");
				System.out.print(vo.getHit());
				System.out.print("/");
				System.out.print(vo.getEnrollDate());
				System.out.println();
			}
		}catch(Exception e) {
			System.out.println("게시판 목록 조회 실패 ...");
			e.printStackTrace();
		}
		
	}//boardList end

}
