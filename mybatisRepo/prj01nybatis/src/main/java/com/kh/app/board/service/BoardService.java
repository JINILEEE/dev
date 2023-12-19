package com.kh.app.board.service;

import java.io.InputStream;
import java.sql.Connection;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;
import com.kh.app.db.util.JDBCTemplate;



public class BoardService {

	// 앞으로 서비스에 있는 메소드에서 매번 객체 사용할 필요가 없도록 미리 만들어줌
	private BoardDao dao = new BoardDao();
	
	public List<BoardVo> selectBoardList() throws Exception {

//		//conn
//		Connection conn = JDBCTemplate.getConnection();
		
		//앞으로 db와의 연결을 session으로 진행할 것이다.
//		//session
//		String resource = "/config.xml";   //이름이 중요한건 아니라 아무 이름으로 만들어도 된다.
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		//위 3줄은 공식문서에서 가져옴
//
//		//이후 아래 코드를 추가하여, 우리가 진짜 필요로 하는 session 객체를 얻어옴
//		SqlSession ss = sqlSessionFactory.openSession();
		
		//session
		SqlSession ss = JDBCTemplate.getSqlSession();
		
		//dao
		List<BoardVo> voList = dao.selectBoardList(ss);
		
		//tx
		
		//close
		ss.close();
		return voList;
		
	}//selectBoardList

	public int insertBoard(BoardVo vo) throws Exception{
		
//		//conn
//		Connection conn = JDBCTemplate.getConnection();
		
		//ss
		SqlSession ss = JDBCTemplate.getSqlSession();
		
		//dao
		int result = dao.insertBoard(ss, vo);
		
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
