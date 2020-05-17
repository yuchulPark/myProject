package com.member.controller;

import java.net.http.HttpResponse;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.member.service.Member_InfoService;
import com.member.vo.Member_InfoVo;

@RestController
public class Member_InfoController {
	@Resource(name="member_infoService")
	private Member_InfoService member_infoService;
	
	// 회원가입
	@GetMapping("/insertMemberJoin.do")
	public void memberJoinForm() {
	}
	@PostMapping("/insertMemberJoin.do")
	public String memberJoinSubmit(Member_InfoVo mi, Model model) {
		System.out.println("회원가입 컨트롤러 동작");
		int re = member_infoService.memberJoin(mi);
		model.addAttribute("re",re);
		return "ok";
	}
	
	// id 중복 체크
	@RequestMapping("/checkId.do")
	public String checkId(String member_id, Model model) {
		System.out.println("id 중복 체크 컨트롤러 동작");
		int re = member_infoService.checkId(member_id);
		model.addAttribute("re", re);
		return "ok";
	}
	
	// email 중복 체크
	@RequestMapping("/checkEmail.do")
	public String checkEmail(String member_email, Model model) {
		System.out.println("email 중복 체크 컨트롤러 동작");
		int re = member_infoService.checkEmail(member_email);
		model.addAttribute("re", re);
		return "ok";
	}
	
	// 닉네임 중복 체크
	@RequestMapping("/checkNickname.do")
	public String checkNickname(String member_nickname, Model model) {
		System.out.println("nickname 중복 체크 컨트롤러 동작");
		int re = member_infoService.checkNickname(member_nickname);
		model.addAttribute("re", re);
		return "ok";
	}
	
	// 로그인 (미완성)
	@GetMapping("/login.do")
	public void login() {
	}
	@PostMapping("/loginOK.do")
	public String loginOK(Member_InfoVo mi, HttpResponse response, Model model) {
		System.out.println("로그인 컨트롤러 동작");
		Member_InfoVo vo = member_infoService.Login(mi);
		return "ok";
	}
	
	// 비밀번호 찾기
	@RequestMapping("/findPwd.do")
	public String findPwd(Member_InfoVo mi, Model model) {
		System.out.println("비밀번호 찾기 컨트롤러 동작");
		int re = member_infoService.findPwd(mi);
		model.addAttribute("re", re);
		return "ok";
	}
	
	// 회원 수정
	@RequestMapping("/updateInfo.do")
	public String updateInfo(Member_InfoVo mi, Model model) {
		System.out.println("회원 수정 컨트롤러 동작");
		int re = member_infoService.updateInfo(mi);
		model.addAttribute("re", re);
		return "ok";
	}
	
	// 회원 탈퇴
	@RequestMapping("/deleteInfo.do")
	public String deleteInfo(Member_InfoVo mi, Model model) {
		System.out.println("회원 탈퇴 컨트롤러 동작");
		int re = member_infoService.deleteInfo(mi);
		model.addAttribute("re", re);
		return "ok";
	}
	@RequestMapping("/naverLogin")
	public String isComplete(HttpSession session) {
		return "/naverLogin";
	}
	
}
