package com.kh.app.member.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kh.app.member.dao.MemberDao;
import com.kh.app.member.vo.MemberVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

	private final SqlSessionTemplate sst;
	private final MemberDao dao;
	
	//회원가입
	public int join(MemberVo vo) {
		return dao.join(sst, vo);
	}

	//회원 목록 조회
	public List<MemberVo> list() {
		return dao.list(sst);
	}

	//회원 상세조회
	public MemberVo detail(String no) {
		return dao.detail(sst, no);
	}

	//회원 수정
	public int edit(String no) {
		return dao.edit(sst, no);
	}

	//회원 삭제
	public int delete(String no) {
		return dao.delete(sst, no);
	}

}
