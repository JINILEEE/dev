package com.kh.miniPractice.member.service;

import java.sql.Connection;

import com.kh.jdbc.JDBCTemplate;
import com.kh.miniPractice.member.dao.MemberDao;
import com.kh.miniPractice.member.vo.MemberVo;

public class MemberService {
	
	public final MemberDao dao;
	
	// 기본 생성자
	public MemberService() {
		dao = new MemberDao();
	}
	
	// 회원가입
	public int join(MemberVo vo) throws Exception {
		
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//dao
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
		
	}//join end

}
