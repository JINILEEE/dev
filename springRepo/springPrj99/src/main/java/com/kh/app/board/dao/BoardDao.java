package com.kh.app.board.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.app.board.vo.BoardVo;
import com.kh.app.pvo.vo.PageVo;

@Repository
public class BoardDao {
	
	// 게시글 작성
	public int insert(SqlSessionTemplate sst, BoardVo vo) {
		return sst.insert("BoardMapper.insert",vo);
	}

	// 게시글 목록
	public List<BoardVo> list(SqlSessionTemplate sst) {
		return sst.selectList("BoardMapper.list");
	}

	// 게시글 상세 조회
	public BoardVo detail(SqlSessionTemplate sst, BoardVo vo) {
		return sst.selectOne("BoardMapper.detail" , vo);
	}

	// 게시글 삭제
	public int delete(SqlSessionTemplate sst, BoardVo vo) {
		return sst.update("BoardMapper.delete", vo);
	}

	// 게시글 수정
	public int edit(SqlSessionTemplate sst, BoardVo vo) {
		return sst.update("BoardMapper.edit" , vo);
	}

}
