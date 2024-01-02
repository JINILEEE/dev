package com.ncs.test.member.model.service.MemberService;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.ncs.test.member.model.dao.MemberDAO.MemberDao;
import com.ncs.test.member.model.vo.Member.MemberVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final SqlSessionTemplate sst;
	private final MemberDao dao;
	
	public MemberVo login(MemberVo memberResultSet) {
		
		return dao.login(sst, memberResultSet);
	}

}
