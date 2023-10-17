package com.kh.miniPractice.board.controller;

import com.kh.miniPractice.main.Main;

public class BoardController {
	
	public void selectMenu() {
		
		System.out.println("======= BOARD =======");
		
		System.out.println("1. 게시글 작성");
		
		String num = Main.SC.nextLine();
		
		switch(num) {
		case "1" : write();break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
	}//selectMenu end
	
	public void write() {
		
	}

}
