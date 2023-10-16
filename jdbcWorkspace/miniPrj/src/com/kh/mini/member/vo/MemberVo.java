package com.kh.mini.member.vo;

public class MemberVo {

	public MemberVo() {
	}
	
	public MemberVo(String no, String id, String pwd, String nick, String enrollDate, String modifiyDate,
			String delYn) {
		super();
		this.no = no;
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
		this.enrollDate = enrollDate;
		this.modifiyDate = modifiyDate;
		this.delYn = delYn;
	}

	private String no;            
	private String id;           
	private String pwd;           
	private String nick;         
	private String enrollDate;   
	private String modifiyDate; 
	private String delYn;
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getModifiyDate() {
		return modifiyDate;
	}

	public void setModifiyDate(String modifiyDate) {
		this.modifiyDate = modifiyDate;
	}

	public String getDelYn() {
		return delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", id=" + id + ", pwd=" + pwd + ", nick=" + nick + ", enrollDate=" + enrollDate
				+ ", modifiyDate=" + modifiyDate + ", delYn=" + delYn + "]";
	} 
	
	
	
}
