package com.spring6.example.service.member;

import javax.servlet.http.HttpSession;

import com.spring6.example.model.member.dto.MemberDTO;

public interface MemberService {
	
	public boolean loginCheck(MemberDTO dto, HttpSession session);
	public void logout(HttpSession session);
}
