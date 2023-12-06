package edu.kh.test.user.model.service;

import java.sql.Connection;

import edu.kh.test.user.model.dao.UserDAO;
import edu.kh.test.user.model.vo.UserDTO;
import edu.kh.test.user.util.JDBCTemplate;

public class UserService {

	public UserDTO selectUserByNo(String no) throws Exception{

		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//dao
		UserDAO dao = new UserDAO();
		UserDTO vo = dao.selectUserByNo(conn,no);
		
		//close
		JDBCTemplate.close(conn);
		return vo;
	
	}

}//class
