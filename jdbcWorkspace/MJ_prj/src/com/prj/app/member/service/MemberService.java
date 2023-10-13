package com.prj.app.member.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.prj.app.db.JDBCTemplate;
import com.prj.app.member.dao.MemberDao;
import com.prj.app.member.vo.MemberVo;

public class MemberService {

	//필드 == 멤버변수
	private final MemberDao dao;
	
	//기본생성자
	public MemberService() {
		dao = new MemberDao();
	}
	
	
	public int generate(MemberVo vo) throws Exception {
		
		//conn 얻기
		Connection conn = JDBCTemplate.getConnection();
		
		//dao 호출
		int result = dao.generate(conn, vo);
		
		//tx
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		//close
		JDBCTemplate.close(conn);
		return result;
		
	}//generate end
	
	public MemberVo select(MemberVo vo) throws Exception {
		
		//conn 얻기
		Connection conn = JDBCTemplate.getConnection();
		
		//dao 호출
		MemberVo dbVo = dao.select(conn, vo); 
		
		//tx
		
		//close
		JDBCTemplate.close(conn);
		return dbVo;
				
	}//select end
	
	public ArrayList<MemberVo> printList() throws Exception {
		
		//conn 얻기
		Connection conn = JDBCTemplate.getConnection();

		//dao 호출
		ArrayList<MemberVo> voList = dao.printList(conn);
		
		//tx
		
		//close
		JDBCTemplate.close(conn);
		return voList;
	}//printList end
	
	public void raise() {
		
		//conn 얻기
		
		//dao 호출
		
		//tx
		
		//close

	}//raise end
	
	public int delete(MemberVo vo) {
		
		//conn 얻기
		Connection conn = JDBCTemplate.getConnection();
		
		//dao 호출
		int result = dao.delete(conn, vo);
		
		//tx
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		//close
		JDBCTemplate.close(conn);
		return result;
		
	}//delete end
	
}//class
