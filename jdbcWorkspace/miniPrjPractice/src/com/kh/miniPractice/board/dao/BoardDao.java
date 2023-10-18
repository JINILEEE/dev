package com.kh.miniPractice.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.kh.jdbc.JDBCTemplate;
import com.kh.miniPractice.board.vo.BoardVo;
import com.kh.miniPractice.main.Main;

public class BoardDao {
	
	// 작성하기
	public int write(Connection conn, BoardVo vo) throws Exception {
		
		// sql
		String sql = "INSERT INTO BOARD (NO,TITLE,CONTENT,WRITER_NO) VALUES(SEQ_BOARD_NO.NEXTVAL,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getTitle());
		pstmt.setString(2, vo.getContent());
		pstmt.setString(3, Main.loginMember.getNo());
		int result = pstmt.executeUpdate();
		
		// rs
		
		// close
		JDBCTemplate.close(pstmt);
		return result;
		
	}//write end
	
	// 게시글 조회 (최신순)
	public List<BoardVo> boardList(Connection conn) throws Exception {
		
		// sql
		String sql = "SELECT B.NO AS NO , B.TITLE AS TITLE , M.NICK AS WRITERNICK , B.HIT AS HIT , TO_CHAR(B.ENROLL_DATE, 'YYYY\"년\"MM\"월\"DD\"일\"') AS ENROLL_DATE FROM BOARD B JOIN MEMBER M ON B.WRITER_NO = M.NO WHERE B.DEL_YN = 'N' ORDER BY B.NO DESC"; 
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		// rs
		List<BoardVo> voList = new ArrayList<BoardVo>();
		while(rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String writerNick = rs.getString("WRITER_NICK");
			String hit = rs.getString("HIT");
			String enrollDate = rs.getString("ENROLL_DATE");
			
			BoardVo vo = new BoardVo();
			vo.setNo(no);
			vo.setTitle(title);
			vo.setWriterNick(writerNick);
			vo.setHit(hit);
			vo.setEnrollDate(enrollDate);
			
			voList.add(vo);
		}
		
		// close
		JDBCTemplate.close(rs);
		JDBCTemplate.close(pstmt);
		
		return voList;
		
	}// boardList end

}
