package com.member.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.member.vo.Member_InfoVo;

@Repository("member_infoDao")
public class Member_InfoDaoImpl implements Member_InfoDao {
	@Autowired
	protected SqlSessionTemplate sqlSessionTemplate;
	
	// 회원가입
	@Override
	public int memberJoin(Member_InfoVo mi) {
		return sqlSessionTemplate.insert("member_info.insert", mi);
	}
	
}
