package com.spring6.example.controller.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring6.example.model.member.dto.MemberDTO;
import com.spring6.example.service.member.MemberService;

@Controller
@RequestMapping("member/*")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("login.do")
	public String loginForm() {
		return "member/login";
	}
	
	@RequestMapping("login_check.do")
	public String loginCheck(MemberDTO dto, HttpSession session, Model model) {
		boolean result=memberService.loginCheck(dto, session);
		if(result) {
			return "home";
		}else {
			model.addAttribute("message", "아이디와 비밀번호를 확인하세요");
			return "member/login";
		}		
	}
	
	@RequestMapping("logout.do")
	public String logout(HttpSession session) {
		memberService.logout(session);
		return "redirect:/";
	}

}
