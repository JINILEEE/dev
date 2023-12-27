package com.kh.app.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.app.board.vo.BoardVo;

@Repository
public class BoardDao {

	//게시글 작성하기
	public int write(SqlSessionTemplate sst, BoardVo vo) {
		
		return sst.insert("BoardMapper.write", vo);
	
	}

	//게시글 목록조회
	public List<BoardVo> list(SqlSessionTemplate sst) {
		return sst.selectList("BoardMapper.list");
	}

	//게시글 상세조회
	public BoardVo detail(SqlSessionTemplate sst, String no) {
		return sst.selectOne("BoardMapper.detail", no);
	}
	
	//게시글 수정
	public int edit(SqlSessionTemplate sst, BoardVo vo) {
		return sst.update("BoardMapper.edit", vo);
	}

	//게시글 삭제
	public int delete(SqlSessionTemplate sst, String no) {
		return sst.delete("BoardMapper.delete", no);
	}

}
