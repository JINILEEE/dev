package com.kh.mini.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.kh.jdbc.JDBCTemplate;
import com.kh.mini.member.vo.MemberVo;

public class MemberDao {
	
	/*
	 * sql
	 * rs
	 * close
	 */

	//회원가입
	public int join(Connection conn, MemberVo vo) throws Exception {
		
		//sql
		String sql = "INSERT INTO MEMBER(NO, ID, PWD, NICK) VALUES(SEQ_MEMBER_NO.NEXTVAL,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPwd());
		pstmt.setString(3, vo.getNick());
		int result = pstmt.executeUpdate();
		
		//rs -- select 쿼리에서만 필요한것이다...
		
		//close -- 내가 추가한 것만 닫을 수 있다!!
		JDBCTemplate.close(pstmt); 
		
		return result;
	}//join end
	
	//로그인
	public MemberVo login(Connection conn, MemberVo vo) throws Exception {
		
		//sql
		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PWD = ? AND DEL_YN = 'N'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPwd());
		ResultSet rs = pstmt.executeQuery();
		
		MemberVo dbVo = null;
		//rs -> vo 로 변경
		if(rs.next()) {
			String no = rs.getString("NO");
			String id = rs.getString("ID");
			String pwd = rs.getString("PWD");
			String nick = rs.getString("NICK");
			String enrollDate = rs.getString("ENROLL_DATE");
			String modifyDate = rs.getString("MODIFY_DATE");
			String delYn = rs.getString("DEL_YN");
			
			dbVo = new MemberVo();
			dbVo.setNo(no);
			dbVo.setId(id);
			dbVo.setPwd(pwd);
			dbVo.setNick(nick);
			dbVo.setEnrollDate(enrollDate);
			dbVo.setModifiyDate(modifyDate);
			dbVo.setDelYn(delYn);
		}
		
		//close
		JDBCTemplate.close(rs);
		JDBCTemplate.close(pstmt);
		
		return dbVo;
	}//login end

	//회원 탈퇴
	public int quit(Connection conn, String no) throws Exception {
		
		//sql
		String sql = "UPDATE MEMBER SET DEL_YN = 'Y' , MODIFY_DATE = SYSDATE WHERE NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		int result = pstmt.executeUpdate();
		
		//rs
		
		//close
		JDBCTemplate.close(pstmt);
		return result;
		
	}//quit end
	
	
	
	
	
}
