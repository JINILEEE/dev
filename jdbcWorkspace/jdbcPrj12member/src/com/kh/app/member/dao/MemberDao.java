package com.kh.app.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.kh.app.db.JDBCTemplate;
import com.kh.app.member.vo.MemberVo;

public class MemberDao {
	
	// 회원가입
	public int join(Connection conn, MemberVo vo) throws Exception {
		//sql //MembserService에서 받아온 vo, conn 사용
		String sql = "INSERT INTO MEMBER(ID,PWD,NICK) VALUES(?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPwd());
		pstmt.setString(3, vo.getNick());
		int result = pstmt.executeUpdate();
		
		//rs  //select 쿼리문일 경우만 작성해주면 된다.
		
		//close
		JDBCTemplate.close(pstmt);
		return result;
		
	}// join end
	
	// 로그인
	public MemberVo login(Connection conn, MemberVo vo) throws Exception{
		// sql
		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PWD = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPwd());
		ResultSet rs = pstmt.executeQuery();
		
		// rs
		MemberVo dbVo = null;
		if(rs.next()) {
			String dbId = rs.getString("ID");
			String dbPwd = rs.getString("PWD");
			String dbNick = rs.getString("NICK");
			
			dbVo = new MemberVo();
			dbVo.setId(dbId);
			db
		}
		
		// close

		return dbVo;
	}// login end

	// 전체 회원목록 조회
	public ArrayList<MemberVo> getMemberList(Connection conn) {
		// sql
		// rs
		// close
		return null;
	}// getMemberList end

	// 회원탈퇴
	public int quit(Connection conn, MemberVo vo) throws Exception {
		// sql
		String sql = "DELETE FROM MEMBER WHERE ID = ? AND PWD = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPwd());
		int result = pstmt.executeUpdate();
		
		// rs //delete 쿼리라 사용 x
		
		// close
		JDBCTemplate.close(pstmt);
		return result;
		
	}// quit end

	// 비밀번호 변경
	public int editPwd(Connection conn, MemberVo vo, String newPwd) throws Exception {
		// sql
		String sql = "UPDATE MEMBER SET PWD = ? WHERE ID = ? AND PWD = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, newPwd);
		pstmt.setString(2, vo.getId());
		pstmt.setString(3, vo.getPwd());
		int result = pstmt.executeUpdate();
		
		// rs
		// close
		JDBCTemplate.close(pstmt);
		
		return result;
	}//editPwd end

}
