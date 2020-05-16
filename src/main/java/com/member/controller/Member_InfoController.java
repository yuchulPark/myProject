package com.member.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.member.service.Member_InfoService;
import com.member.vo.Member_InfoVo;

@Controller
public class Member_InfoController {
	@Resource(name="member_infoService")
	private Member_InfoService member_infoService;
	
	// 회원가입
	@GetMapping("/insertMemberJoin.do")
	public void memberJoinForm() {
	}
	@PostMapping("/insertMemberJoin.do")
	public ModelAndView memberJoinSubmit(Member_InfoVo mi) {
		ModelAndView m = new ModelAndView();
		int re = member_infoService.memberJoin(mi);
		System.out.println(re);
		return m;
	}
}
