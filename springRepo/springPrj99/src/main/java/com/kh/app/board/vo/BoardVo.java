package com.kh.app.board.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BoardVo {

	private String no;
	private String title;
	private String content;
	private String enrollDate;
	private String delYn;
	private String writerNo;
	private String writerNick;
	
//	// 생성자 외부에서 접근 못하도록 private으로 사용함
//	private BoardVo() {
//		
//	}
//	
//	private BoardVo (BoardTemp temp) {
//		this.no = temp.no;
//		this.title = temp.title;
//		this.content = temp.content;
//		this.writerNick = temp.writerNick;
//		this.writerNo = temp.writerNo;
//		this.enrollDate = temp.enrollDate;
//		this.delYn = temp.delYn;
//	}
//	
//	//BoardVo 객체필요하면 이거 써라
//	public static BoardTemp builder() {
//		//return new BoardVo(재료);
//		return new BoardTemp();
//	}
//	
//	// 내부 클래스를 static으로 만들어서 사용하면 된다.
//	public static class BoardTemp{
//		private String no;
//		private String title;
//		private String content;
//		private String enrollDate;
//		private String delYn;
//		private String writerNo;
//		private String writerNick;
//		
//		// setter 메소드 쪽 만듦
//		public BoardTemp setNo(String no) {
//			this.no = no;
//			return this;
//		}
//		public BoardTemp setTitle(String title) {
//			this.title = title;
//			return this;
//		}
//		public BoardTemp setContent(String content) {
//			this.content = content;
//			return this;
//		}
//		public BoardTemp setEnrollDate(String enrollDate) {
//			this.enrollDate = enrollDate;
//			return this;
//		}
//		public BoardTemp setDelYn(String delYn) {
//			this.delYn = delYn;
//			return this;
//		}
//		public BoardTemp setWriterNo(String writerNo) {
//			this.writerNo = writerNo;
//			return this;
//		}
//		public BoardTemp setWriterNick(String writerNick) {
//			this.writerNick = writerNick;
//			return this;
//		}
//		
//		// build 객체 만들기
//		public BoardVo build() {
//			return new BoardVo(this);
//		}
//		
//	}//BoardTemp
	
}//class
