package com.kh.app.gallery.service;

import java.sql.Connection;
import java.util.List;

import com.kh.app.db.util.JDBCTemplate;
import com.kh.app.gallery.dao.GalleryDao;
import com.kh.app.gallery.vo.GalleryVo;

public class GalleryService {
	
	//갤러리 리스트
	public List<GalleryVo> getGalleryList() throws Exception {
		
		// conn
		Connection conn = JDBCTemplate.getConnection();
		
		// DAO
		GalleryDao dao = new GalleryDao();
		List<GalleryVo> galleryVoList = dao.getGalleryList(conn);
		
		// close
		JDBCTemplate.close(conn);
		
		return galleryVoList;
	}

}



