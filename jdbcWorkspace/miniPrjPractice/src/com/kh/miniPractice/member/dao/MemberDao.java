package com.kh.miniPractice.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.kh.jdbc.JDBCTemplate;
import com.kh.miniPractice.member.vo.MemberVo;

public class MemberDao {
	
	// 회원가입
	public int join(Connection conn, MemberVo vo) throws Exception {
		
		//sql
		String sql = "INSERT INTO MEMBER (NO, ID, PWD, NICK) VALUES (SEQ_MEMBER_NO.NEXTVAL, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPwd());
		pstmt.setString(3, vo.getNick());
		int result = pstmt.executeUpdate();
		
		//rs
		
		//close
		JDBCTemplate.close(pstmt);
		return result;
		
	}//join end

}
