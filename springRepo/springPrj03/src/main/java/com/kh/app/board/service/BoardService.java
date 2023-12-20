package com.kh.app.board.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;

@Service
public class BoardService {
	
	@Autowired
	private BoardDao dao;
	
	@Autowired
	private SqlSessionTemplate sst;
	
	//게시글 목록 조회
	public List<BoardVo> getBoardList() {
		
		//dao
		return dao.getBoardList(sst);
		
		//tx
		
		//close
		//sst.close();   //예외를 바로 던지는 close다.
		
	}
	
	//게시글 작성

}
