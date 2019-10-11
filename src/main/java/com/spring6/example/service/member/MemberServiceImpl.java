package com.spring6.example.service.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring6.example.model.member.dao.MemberDAO;
import com.spring6.example.model.member.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO dao;
	 
	@Override
	public boolean loginCheck(MemberDTO dto, HttpSession session) {
		
		MemberDTO member= dao.loginCheck(dto);
		if(member!=null) {
			session.setAttribute("userid", member.getUserid());
			session.setAttribute("name", member.getName());
			return true;
		}else{
			return false;
		}		
	}

	@Override
	public void logout(HttpSession session) {
		session.invalidate();		
	}

}
