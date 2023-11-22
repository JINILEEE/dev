package com.kh.app.board.service;

import java.sql.Connection;
import java.util.List;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;
import com.kh.app.db.util.JDBCTemplate;



public class BoardService {

	//게시글 목록 조회
	public List<BoardVo> selectBoardList() throws Exception{

		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//dao
		BoardDao dao = new BoardDao();
		List<BoardVo> boardList = dao.selectBoardList(conn);
		
		//tx
		
		//close
		JDBCTemplate.close(conn);
		return boardList;
		
	}

	public int write(BoardVo vo) throws Exception{

		// conn
		Connection conn = JDBCTemplate.getConnection();
		
		// dao
		BoardDao dao = new BoardDao();
		int result = dao.write(conn,vo);
		
		// tx
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		// close
		JDBCTemplate.close(conn);
		return result;
	
	}

}
