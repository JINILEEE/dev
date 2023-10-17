package com.kh.miniPractice.board.vo;

public class BoardVo {

	public BoardVo() {
	}
	
	public BoardVo(String no, String title, String content, String writer_no, String writer_nick, String hit,
			String enroll_date, String modify_date, String del_yn) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer_no = writer_no;
		this.writer_nick = writer_nick;
		this.hit = hit;
		this.enroll_date = enroll_date;
		this.modify_date = modify_date;
		this.del_yn = del_yn;
	}
	
	private String no;
	private String title;
	private String content;
	private String writer_no;
	private String writer_nick;
	private String hit;
	private String enroll_date;
	private String modify_date;
	private String del_yn;
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter_no() {
		return writer_no;
	}

	public void setWriter_no(String writer_no) {
		this.writer_no = writer_no;
	}

	public String getWriter_nick() {
		return writer_nick;
	}

	public void setWriter_nick(String writer_nick) {
		this.writer_nick = writer_nick;
	}

	public String getHit() {
		return hit;
	}

	public void setHit(String hit) {
		this.hit = hit;
	}

	public String getEnroll_date() {
		return enroll_date;
	}

	public void setEnroll_date(String enroll_date) {
		this.enroll_date = enroll_date;
	}

	public String getModify_date() {
		return modify_date;
	}

	public void setModify_date(String modify_date) {
		this.modify_date = modify_date;
	}

	public String getDel_yn() {
		return del_yn;
	}

	public void setDel_yn(String del_yn) {
		this.del_yn = del_yn;
	}

	@Override
	public String toString() {
		return "BoardVo [no=" + no + ", title=" + title + ", content=" + content + ", writer_no=" + writer_no
				+ ", writer_nick=" + writer_nick + ", hit=" + hit + ", enroll_date=" + enroll_date + ", modify_date="
				+ modify_date + ", del_yn=" + del_yn + "]";
	}
	
}
