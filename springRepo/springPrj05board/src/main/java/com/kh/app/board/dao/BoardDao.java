package com.kh.app.board.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.app.board.vo.BoardVo;

@Repository
public class BoardDao {

	//게시글 작성
	public int insert(BoardVo vo, SqlSessionTemplate sst) {

		//sql
//		return sst.insert("네임스페이스.쿼리아이디", 쿼리에전달할데이터);
		return sst.insert("BoardMapper.insertBoard", vo);
		
		//rs - 마이바티스가 알아서함
		
		//close - 스프링이 알아서함
	
	}

}
