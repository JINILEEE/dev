package com.kh.app.member.service;

import java.sql.Connection;

import com.kh.app.db.util.JDBCTemplate;
import com.kh.app.member.dao.MemberDao;
import com.kh.app.member.vo.MemberVo;

public class MemberService {

	// 회원가입 처리
	public int join(MemberVo vo) throws Exception{
		
		// conn
		Connection conn = JDBCTemplate.getConnection();
		
		// business login
		// 아이디 4글자 미만 ㄴㄴ
		if(vo.getMemberId().length() < 4) {
			throw new Exception("[ERROR-M002]아이디 4글자 미만");
		}
		// 비번 일치여부 체크
		if(!vo.getMemberPwd().equals(vo.getMemberPwd2())) {
			throw new Exception("[ERROR-M003]비밀번호 일치하지 않음");
		}
		// 비번 4글자 미만 ㄴㄴ
		if(vo.getMemberPwd().length() < 4) {
			throw new Exception("[ERROR-M004]비밀번호 4글자 미만");
		}
		// 닉네임에 관리자 불가능
		if(vo.getMemberNick().equals("관리자") 
				|| vo.getMemberNick().equals("ADMIN") 
				|| vo.getMemberNick().equals("admin")) {
			throw new Exception("[ERROR-M005]닉네임에 관리자 불가능");
		}
		
		// DAO 호출
		MemberDao dao = new MemberDao();
		int result = dao.join(conn, vo);
		
		//tx
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {;
			JDBCTemplate.rollback(conn);
		}
		
		//close
		JDBCTemplate.close(conn);
		return result;
	}

	// 로그인 처리
	public MemberVo login(MemberVo vo) throws Exception{
		
		// conn
		Connection conn = JDBCTemplate.getConnection();
		
		// dao
		MemberDao dao = new MemberDao();
		MemberVo loginMember = dao.login(conn, vo);
		
		// tx
		
		// close
		JDBCTemplate.close(conn);
		return loginMember;
	}
}
