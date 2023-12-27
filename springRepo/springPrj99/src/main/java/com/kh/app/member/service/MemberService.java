package com.kh.app.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.kh.app.member.dao.MemberDao;
import com.kh.app.member.vo.MemberVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberDao dao;
	private final SqlSessionTemplate sst;
	
	//회원가입
	public int join(MemberVo vo) throws Exception{
		
		//id 검사 로직
		String id = vo.getId();
		if(id.length() < 4){
			throw new Exception("아이디가 너무 짧음");
		}
		
		//대소문자 상관없이 null체크 안해도 될 검사로 
		if("admin".equalsIgnoreCase(id)) {
			throw new Exception("사용 불가한 아이디");
		}
		
		return dao.join(sst, vo);
	
	}

}//class
