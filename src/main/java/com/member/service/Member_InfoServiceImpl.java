package com.member.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.member.dao.Member_InfoDao;
import com.member.vo.Member_InfoVo;
@Service("member_infoService")
public class Member_InfoServiceImpl implements Member_InfoService {
	@Autowired
	@Resource(name="member_infoDao")
	protected Member_InfoDao member_infoDao; 
	
	// 회원가입
	@Override
	public int memberJoin(Member_InfoVo mi) {
		return member_infoDao.memberJoin(mi);
	}

}
