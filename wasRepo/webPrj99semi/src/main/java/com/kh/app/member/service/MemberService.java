package com.kh.app.member.service;

import java.sql.Connection;

import com.kh.app.db.util.JDBCTemplate;
import com.kh.app.member.dao.MemberDao;
import com.kh.app.member.vo.MemberVo;

public class MemberService {

	public int join(MemberVo vo) throws Exception{
		
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//business logic
		//아이디 4~12영문소문자 + 숫자
		String id = vo.getMemberId();
		boolean idOk = id.matches("[a-z0-9]{4,12}");
		
		if(!idOk) {
			throw new Exception("아이디 값 잘못됨");
		}
		//비밀번호 일치여부크
		//비밀번호 4글자 이상
		//닉네임에 admin 금
		
		//dao
		MemberDao dao = new MemberDao();
		int result = dao.join(conn,vo);
		
		//tx
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		//close
		JDBCTemplate.close(conn);
		return result;
		
	}//join

	public MemberVo login(MemberVo vo) throws Exception{

		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//dao
		MemberDao dao = new MemberDao(); 
		MemberVo loginMember = dao.login(conn,vo);
		
		//tx
		
		//close
		JDBCTemplate.close(conn);
		return loginMember;
		
	}

	public boolean checkIdDup(String memberId) throws Exception{

		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//dao
		MemberDao dao = new MemberDao();
		boolean result = dao.checkIdDup(conn, memberId);
		
		//tx
		
		//close
		JDBCTemplate.close(conn);
		return result;
		
	}

}//class
