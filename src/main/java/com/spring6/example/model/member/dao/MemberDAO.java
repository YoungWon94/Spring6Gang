package com.spring6.example.model.member.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.spring6.example.model.member.dto.MemberDTO;

@Repository
public interface MemberDAO {
	
	@Select("select * from member where userid=#{userid} and passwd=#{passwd}")
	public MemberDTO loginCheck(MemberDTO dto);
}
