package com.kh.app.board.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;
import com.kh.app.db.util.JDBCTemplate;

public class BoardService {
	
	private BoardDao dao = new BoardDao();

	//게시글 리스트 조회
	public List<BoardVo> selectBoardList() throws Exception{

		//session
		SqlSession ss = JDBCTemplate.getSqlSession();
		
		//dao
		List<BoardVo> voList = dao.selectBoardList(ss);
		
		//tx
		
		//close
		ss.close();
		return voList;
	
	}

	//게시글 작성
	public int insertBoard(BoardVo vo) throws Exception{
		
		//session
		SqlSession ss = JDBCTemplate.getSqlSession();
		
		//dao
		int result = dao.insertBoard(vo, ss);
		
		//tx
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		
		//close
		ss.close();
		return result;
	}

}//class
