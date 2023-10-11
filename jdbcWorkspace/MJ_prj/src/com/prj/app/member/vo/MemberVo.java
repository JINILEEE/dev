package com.prj.app.member.vo;

public class MemberVo {

	public MemberVo() {
	}
	
	
	public MemberVo(String charName, String charPwd) {
		this.charName = charName;
		this.charPwd = charPwd;
	}

	private String charName;
	private String charPwd;
	
	public String getCharName() {
		return charName;
	}


	public void setCharName(String charName) {
		this.charName = charName;
	}


	public String getCharPwd() {
		return charPwd;
	}


	public void setCharPwd(String charPwd) {
		this.charPwd = charPwd;
	}


	@Override
	public String toString() {
		return "MemberVo [캐릭터 이름: " + charName + ", 접속코드: " + charPwd + "]";
	}
	
	
	
}
