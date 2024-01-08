package com.kh.app.gellery.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.kh.app.gallery.vo.GalleryVo;
import com.kh.app.gellery.dao.GalleryDao;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GalleryService {

	private final GalleryDao dao;
	private final SqlSessionTemplate sst;
	
	//작성하기
	public int write(GalleryVo vo) {
		
		String str = vo.getFullPath().replace("/Users/jini/dev/springRepo/springPrj99/src/main/webapp", "http://127.0.0.1:8888/app");
		vo.setFullPath(str);
		
		if(vo.getTitle().length() < 1 ) {
			throw new IllegalStateException();
		}
		
		return dao.write(sst, vo);
	}
	
	//목록조회
	public List<GalleryVo> list(){
		return dao.list(sst);
	}
	
	//단일조회 (+조회수 증가)
	public GalleryVo detail(String no) {
		int result = dao.increaseHit(sst, no);
		if(result != 1) {
			throw new IllegalStateException();
		}
		return dao.detail(sst, no);
		
	}
	
	//수정하기
	public int edit(GalleryVo vo) {
		
		if(vo == null ) {
			throw new IllegalStateException("vo 가 없는데 업데이트를 어케하냐.....");
		}
		if(vo.getTitle() !=null && vo.getTitle().length() < 1) {
			throw new IllegalStateException("제목 너무 짧음...");
		}
		
		return dao.edit(sst, vo);
	}
	
	//삭제하기
	public int delete(String no) {
		return dao.delete(sst, no);
	}
	
	
}//class
