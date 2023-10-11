package com.prj.app.member.service;

import java.sql.Connection;

import com.prj.app.db.JDBCTemplate;
import com.prj.app.member.vo.MemberVo;

public class MemberService {

	public int generate(MemberVo vo) throws Exception {
		
		//conn 얻기
		Connection conn = JDBCTemplate.getConnection();
		
		//dao 호출
		
		//tx
		
		//close
		
		return 0;
		
	}//generate end
	
	public void select() {
		
		//conn 얻기

		//dao 호출
		
		//tx
		
		//close
		
	}//select end
	
	public void printList() {
		
		//conn 얻기

		//dao 호출
		
		//tx
		
		//close
		
	}//printList end
	
	public void raise() {
		
		//conn 얻기
		
		//dao 호출
		
		//tx
		
		//close

	}//raise end
	
	public void delete() {
		
		//conn 얻기
		
		//dao 호출
		
		//tx
		
		//close
		
	}//delete end
	
}//class
