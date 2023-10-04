package com.kh.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.kh.app.jdbc.JDBCTemplate;
import com.kh.app.vo.MemberVo;

public class MemberDao {
	
	public int join(Connection conn, MemberVo vo) throws Exception{
		//sql
		String sql = "INSERT INTO MEMBER(ID,PWD) VALUES(?,?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPwd());
		int result = pstmt.executeUpdate();
		
		//close
		JDBCTemplate.close(pstmt);
		
		return result;
	}//join end
	
	public MemberVo login(Connection conn, MemberVo vo) throws Exception {
		//sql
		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PWD = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPwd());
		ResultSet rs = pstmt.executeQuery();
		
		//rs
		MemberVo dbVo = null;
		if(rs.next()) {
			String id = rs.getString("ID");
			String pwd = rs.getString("PWD");
			
			dbVo = new MemberVo();
			dbVo.setId(id);
			dbVo.setPwd(pwd);
		}
		
		//close
		JDBCTemplate.close(rs);
		JDBCTemplate.close(pstmt);
		
		return dbVo;
	}//login end
	
	public ArrayList<MemberVo> getMemberList(Connection conn) throws Exception{
		//sql
		String sql = "SELECT * FROM MEMBER";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		//rs
		ArrayList<MemberVo> voList = new ArrayList<MemberVo> ();
		while(rs.next()) {
			String dbId = rs.getString("ID");
			String dbPwd = rs.getString("PWD");
			
			MemberVo vo = new MemberVo();
			vo.setId(dbId);
			vo.setPwd(dbPwd);
			
			voList.add(vo);
		}
		
		//close
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		
		return voList;
	}

}//class
