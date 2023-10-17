package com.kh.mini.member.service;

import java.sql.Connection;

import com.kh.jdbc.JDBCTemplate;
import com.kh.mini.member.dao.MemberDao;
import com.kh.mini.member.vo.MemberVo;

public class MemberService {
	
	private final MemberDao dao;
	
	public MemberService() {
		dao = new MemberDao();
	}
	
	/*
	 * conn
	 * DAO 호출
	 * tx
	 * close
	 */
	
	//회원가입 insert ~~ 아이디, 비번, 닉네임
	public int join(MemberVo vo) throws Exception {
		
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//dao 호출
		int result = dao.join(conn, vo);
		
		//tx
		if(result ==1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		//close
		JDBCTemplate.close(conn);
		return result;
	}//join end
	
	//로그인
	public MemberVo login(MemberVo vo) throws Exception {
		
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//dao
		MemberVo x = dao.login(conn,vo);
		
		//tx -- insert 타입이 아니라 필요 없다...
		
		//close
		JDBCTemplate.close(conn);
		return x;
	}//login end

	//회원 탈퇴
	public int quit(String no) throws Exception {
		
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//DAO
		int result = dao.quit(conn, no);
		
		//tx
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		//close
		JDBCTemplate.close(conn);
		return result;
		
	}//quit end
	

}
