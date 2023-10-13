package com.prj.app.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

	public ArrayList<MemberVo> printList(Connection conn) throws Exception{

		/// sql 얻기
		String sql = "SELECT * FROM MEMBER";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		// rs
		ArrayList<MemberVo> voList = new ArrayList<MemberVo>();
		while(rs.next()){
			String dbCharId = rs.getString("CHARID");
			String dbCharPwd = rs.getString("CHARPWD");
			
			MemberVo dbVo = new MemberVo();
			dbVo.setCharName(dbCharId);
			dbVo.setCharPwd(dbCharPwd);
			
			voList.add(dbVo);
		}
		
		// close
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		
		return voList;
	}// printList end

	public void raise() {

		// sql 얻기

		// rs

		// close

	}// raise end

	public int delete(Connection conn, MemberVo vo) {

		// sql 얻기
		String sql = "SELECT * FROM MEMBER WHERE CHARID = ? AND CHARPWD = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getCharName());
		pstmt.setString(2, vo.getCharPwd());
		
		// rs

		// close
		JDBCTemplate.close(pstmt);
		return result;

	}// delete end

}// class
