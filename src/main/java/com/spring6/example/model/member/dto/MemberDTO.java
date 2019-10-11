package com.spring6.example.model.member.dto;

import java.util.Date;

public class MemberDTO {
	private String userid;
	private String passwd;
	private String name;
	private String eamil;
	private Date join_date;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEamil() {
		return eamil;
	}
	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	public Date getJoin_date() {
		return join_date;
	}
	@Override
	public String toString() {
		return "MemberDTO [userid=" + userid + ", passwd=" + passwd + ", name=" + name + ", eamil=" + eamil
				+ ", join_date=" + join_date + "]";
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	
	
}
