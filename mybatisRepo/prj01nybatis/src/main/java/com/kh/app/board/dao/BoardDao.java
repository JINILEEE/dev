package com.kh.app.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.vo.BoardVo;
import com.kh.app.db.util.JDBCTemplate;


public class BoardDao {

	public List<BoardVo> selectBoardList(SqlSession ss) throws Exception{

		// 앞으로 아래 한줄로 그 밑에 지금까지 작성했던 dao코드들을 의미한다!!!
		return ss.selectList("BoardMapper.selectBoardList");
		
///////////////////////////////////////////////////////////////////////////////		
//		//sql
//		String sql = "SELECT * FROM BOARD_TEMP";
//		PreparedStatement pstmt = ss.prepareStatement(ss);
//		ResultSet rs = pstmt.executeQuery();
//		
//		//rs
//		List<BoardVo> voList = new ArrayList<BoardVo> ();
//		while(rs.next()) {
//			String title = rs.getString("TITLE");
//			String content = rs.getString("CONTENT");
//			String enrollDate = rs.getString("ENROLL_DATE");
//			
//			BoardVo vo = new BoardVo(title, content, enrollDate);
//			voList.add(vo);
//		}
//		
//		//close
//		JDBCTemplate.close(rs);
//		JDBCTemplate.close(pstmt);
//		return voList;
///////////////////////////////////////////////////////////////////////////////		
		
	}

	public int insertBoard(SqlSession ss, BoardVo vo) throws Exception {

		//괄호 안에 두번째 객체를 첫번째 객체에 전달하겠다는 의미
		return ss.insert("BoardMapper.insertBoard", vo);
		
//		//sql
//		String sql = "INSERT INTO BOARD_TEMP (TITLE, CONTENT) VALUES (?, ?)";
//		PreparedStatement pstmt = conn.prepareStatement(sql);
//		pstmt.setString(1, vo.getTitle());
//		pstmt.setString(2, vo.getContent());
//		int result = pstmt.executeUpdate();
//				
//		//rs
//		
//		//close
//		JDBCTemplate.close(pstmt);
//		return result;
	
	}

}//class
