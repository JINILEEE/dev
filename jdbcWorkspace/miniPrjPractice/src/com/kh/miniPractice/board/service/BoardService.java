package com.kh.miniPractice.board.service;

import java.sql.Connection;
import java.util.List;

import com.kh.jdbc.JDBCTemplate;
import com.kh.miniPractice.board.dao.BoardDao;
import com.kh.miniPractice.board.vo.BoardVo;

public class BoardService {
	
	private BoardDao dao;
	
	// 기본 생성자
	public BoardService() {
		dao = new BoardDao();
	}
	
	// 게시글 작성
	public int write(BoardVo vo) throws Exception {
		
		// conn
		Connection conn = JDBCTemplate.getConnection();
		
		// dao
		int result = dao.write(conn, vo);
		
		// tx
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		// close
		JDBCTemplate.close(conn);
		return result;
		
	}//write end
	
	// 게시글 목록 (최신순)
	public List<BoardVo> boardList() throws Exception {
		
		// conn
		Connection conn = JDBCTemplate.getConnection();
		
		// dao
		List<BoardVo> voList = dao.boardList(conn);
		
		// tx
		
		// close
		JDBCTemplate.close(conn);
		return voList;
		
	}//boardList end

}
