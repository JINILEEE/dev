package com.kh.app.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.app.board.vo.BoardVo;

@Repository
public class BoardDao {

	//게시글 목록 조회
	public List<BoardVo> getBoardList(SqlSessionTemplate sst) {
	
		return sst.selectList("BoardMapper.getBoardList");
		
	}

}
