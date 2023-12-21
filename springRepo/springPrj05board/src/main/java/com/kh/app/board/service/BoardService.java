package com.kh.app.board.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final SqlSessionTemplate sst;		//connection 대신 사용할 것!!!
	private final BoardDao dao;
	
	//게시글 작성
	public int insert(BoardVo vo) {
		
		//conn - SqlSessionTemplate 처리로 끝!
		
		//dao
		return dao.insert(vo, sst);
		
		//tx - 커밋을 자동으로 해준다. 롤백만 따로 처리를 해주면 된다.
		
	}

}//class
