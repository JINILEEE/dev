package com.kh.app.board.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final SqlSessionTemplate sst;
	private final BoardDao dao;
	
	//게시글 작성
	public int write(BoardVo vo) {
		
		return dao.write(sst, vo);
		
	}

	//게시글 조회
	public List<BoardVo> list() {
		return dao.list(sst);
	}

	//게시글 상세조회
	public BoardVo detail(String no) {
		return dao.detail(sst, no);
	}

	//게시글 수정
	public int edit(BoardVo vo) {
		return dao.edit(sst, vo);
	}

	//게시글 삭제
	public int delete(String no) {
		return dao.delete(sst, no);
	}

	
	
}
