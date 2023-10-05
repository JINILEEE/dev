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
	public MemberVo login(Connection conn, MemberVo vo) {
		// sql
		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PWD = ?";
		
		// rs
		// close

		return null;
	}// login end

	// 전체 회원목록 조회
	public ArrayList<MemberVo> getMemberList() {
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
	public int editPwd(MemberVo vo, String newPwd) {
		// sql
		// rs
		// close
		return 0;
	}//editPwd end

}
