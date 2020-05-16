package com.member.dao;

import com.member.vo.Member_InfoVo;

public interface Member_InfoDao {
	// 회원가입
	int memberJoin(Member_InfoVo mi);
	
}
