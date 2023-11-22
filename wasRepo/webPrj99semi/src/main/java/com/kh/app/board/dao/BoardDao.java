package com.kh.app.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.kh.app.board.vo.BoardVo;

import test.JDBCTemplate;

public class BoardDao {

	public List<BoardVo> selectBoardList(Connection conn) throws Exception{

		//sql
		String sql = "SELECT B.NO ,B.CATEGORY_NO ,B.TITLE ,B.CONTENT ,B.WRITER_NO ,B.HIT ,B.ENROLL_DATE ,B.MODIFY_DATE ,B.STATUS ,M.NICK AS WRITER_NICK FROM BOARD B JOIN MEMBER M ON (B.WRITER_NO = M.NO) WHERE B.STATUS = 'O' ORDER BY B.NO DESC";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		//rs
		List<BoardVo> boardVoList = new ArrayList<BoardVo>();
		while(rs.next()) {
			String no = rs.getString("NO");
			String categoryNo = rs.getString("CATEGORY_NO");
			String title = rs.getString("TITLE");
			String content = rs.getString("CONTENT");
			String writerNo = rs.getString("WRITER_NO");
			String writerNick = rs.getString("WRITER_NICK");
			String hit = rs.getString("HIT");
			String enrollDate = rs.getString("ENROLL_DATE");
			String modifyDate = rs.getString("MODIFY_DATE");
			String status = rs.getString("STATUS");
			
			BoardVo vo = new BoardVo();
			vo.setNo(no);
			vo.setCategoryNo(categoryNo);
			vo.setTitle(title);
			vo.setContent(content);
			vo.setWriterNo(writerNo);
			vo.setWriterNick(writerNick);
			vo.setHit(hit);
			vo.setEnrollDate(enrollDate);
			vo.setModifyDate(modifyDate);
			vo.setStatus(status);
			
			boardVoList.add(vo);
		}
		
		//close
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		return boardVoList;
		
	}

	public int write(Connection conn, BoardVo vo) throws Exception{

		//sql
		String sql = "INSERT INTO BOARD(NO, CATEGORY_NO, TITLE, CONTENT, WRITER_NO) VALUES (SEQ_BOARD_NO.NEXTVAL , ?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getCategoryNo());
		pstmt.setString(2, vo.getTitle());
		pstmt.setString(3, vo.getContent());
		pstmt.setString(4, vo.getWriterNo());
		int result = pstmt.executeUpdate();
		
		//rs
		
		//close
		JDBCTemplate.close(pstmt);
		return result;
	
	}

}
