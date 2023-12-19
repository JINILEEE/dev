package com.kh.app.board.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.vo.BoardVo;

public class BoardDao {

	//게시글 조회
	public List<BoardVo> selectBoardList(SqlSession ss) throws Exception{

		return ss.selectList("BoardMapper.selectBoardList");
		
	}

	//게시글 작성
	public int insertBoard(BoardVo vo, SqlSession ss) {

		return ss.insert("BoardMapper.insertBoard", vo);
		
	}

}//class
