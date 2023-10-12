package com.prj.app.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.prj.app.db.JDBCTemplate;
import com.prj.app.member.vo.MemberVo;

public class MemberDao {

	public int generate(Connection conn, MemberVo vo) throws Exception {

		// sql 얻기
		String sql = "INSERT INTO MEMBER(CHARNAME, CHARPWD) VALUES(?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getCharName());
		pstmt.setString(2, vo.getCharPwd());
		int result = pstmt.executeUpdate();
		
		// rs

		// close
		JDBCTemplate.close(pstmt);
		return result;

	}// generate end

	public MemberVo select(Connection conn, MemberVo vo) throws Exception {

		// sql 얻기
		String sql = "SELECT * FROM MEMBER WHERE CHARID = ? AND CHARPWD = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getCharName());
		pstmt.setString(2, vo.getCharPwd());
		ResultSet rs = pstmt.executeQuery();
		
		MemberVo dbVo = null;
		// rs
		if(rs.next()) {
			String dbCharId = rs.getString("CHARID");
			String dbCharPwd = rs.getString("CHARPWD");
			
			dbVo = new MemberVo();
			dbVo.setCharName(dbCharId);
			dbVo.setCharName(dbCharPwd);
		}
		
		// close
		JDBCTemplate.close(rs);
		JDBCTemplate.close(pstmt);
		return dbVo;
	}// select end

	public void printList() {

		/// sql 얻기

		// rs

		// close

	}// printList end

	public void raise() {

		// sql 얻기

		// rs

		// close

	}// raise end

	public void delete() {

		// sql 얻기

		// rs

		// close

	}// delete end

}// class
