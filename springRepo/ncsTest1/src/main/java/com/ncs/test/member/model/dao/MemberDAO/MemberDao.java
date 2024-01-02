package com.ncs.test.member.model.dao.MemberDAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.ncs.test.member.model.vo.Member.MemberVo;

@Repository
public class MemberDao {

	public MemberVo login(SqlSessionTemplate sst, MemberVo memberResultSet) {
		
		return sst.selectOne("MemberMapper.loginMember", memberResultSet);
	}

}
