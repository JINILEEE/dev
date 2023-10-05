package com.kh.app.member.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.app.db.JDBCTemplate;
import com.kh.app.member.dao.MemberDao;
import com.kh.app.member.vo.MemberVo;

public class MemberService {
	
	//필드 == 멤버변수
	private final MemberDao dao;
	
	//기본 생성자
	public MemberService() {
		dao = new MemberDao();
	}
	
	//회원가입
	public int join(MemberVo vo) throws Exception {
		
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//dao //MemberController가 넘겨준 vo 객체를 가져와 사용
		int result = dao.join(conn, vo);  
		
		//tx //미리 만들어둔 JDBCTemplate 활용해서 간단하게 코드 작성
		if(result == 1) {
			JDBCTemplate.commit(conn);  
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		//close
		JDBCTemplate.close(conn);
		return result;
		
	}//join end
	
	//로그인
	public MemberVo login(MemberVo vo) {
		
		// conn
		Connection conn = JDBCTemplate.getConnection();
		
		// dao
		MemberVo dbVo = dao.login(conn, vo);
		
		// tx

		// close
		JDBCTemplate.close(conn);
		return dbVo;
	}//login end
	
	//전체 회원목록 조회
	public ArrayList<MemberVo> getMemberList(Connection conn) {
		// conn

		// dao

		// tx

		// close
		return null;
	}//getMemberList end
	
	//회원탈퇴
	public int quit(MemberVo vo) throws Exception{
		// conn
		Connection conn = JDBCTemplate.getConnection();
		
		// dao
		int result = dao.quit(conn, vo);
		
		// tx
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		// close
		JDBCTemplate.close(conn);
		return result;
	}//quit end
	
	//비밀번호 변경
	public int editPwd(Connection conn, MemberVo vo, String newPwd) {
		// conn

		// dao

		// tx

		// close
		return 0;
	}//editPwd end

}
