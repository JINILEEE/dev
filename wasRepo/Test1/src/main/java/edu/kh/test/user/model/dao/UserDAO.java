package edu.kh.test.user.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import edu.kh.test.user.model.vo.UserDTO;
import test.JDBCTemplate;

public class UserDAO {

	public UserDTO selectUserByNo(Connection conn, String no) throws Exception{
		//sql
		String sql = "SELECT USER_NO ,USER_ID ,USER_NAME ,USER_AGE FROM TB_USER WHERE USER_NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		ResultSet rs = pstmt.executeQuery();
		
		//rs
		UserDTO vo = null;
		if(rs.next()) {
			String userNo = rs.getString("USER_NO");
			String userId = rs.getString("USER_ID");
			String userName = rs.getString("USER_NAME");
			String userAge = rs.getString("USER_AGE");
			
			vo = new UserDTO();
//			vo.setUserNo(userNo);
			vo.setUserId(userId);
			vo.setUserName(userName);
//			vo.setUserAge(userAge);
			
		}
		
		//close
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		return vo;
	}

	

}//class
