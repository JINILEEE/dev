package com.kh.app.board.dao;

import java.util.List;

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

	//게시글 목록 조회
	public List<BoardVo> getBoardList(SqlSessionTemplate sst) {

		return sst.selectList("BoardMapper.getBoardList");
		
	}

	//게시글 상세 조회
	public BoardVo getBoardByNo(String no, SqlSessionTemplate sst) {
		return sst.selectOne("BoardMapper.getBoardByNo", no);
	}

	//게시글 삭제
	public int delete(SqlSessionTemplate sst, String no) {
		return sst.delete("BoardMapper.deleteBoardByNo", no);
	}

	//게시글 수정
	public int edit(SqlSessionTemplate sst, BoardVo vo) {
		return sst.update("BoardMapper.setBoardByNo", vo);
	}

}
