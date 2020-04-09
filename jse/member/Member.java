package com.jse.member;

import lombok.Data;

@Data
public class Member {

	private String name;
	private int age;
	private String userid;
	private String passwd;
	
//	public Member(String name, int age, String userid, String passwd) {
//		this.name = name;
//		this.age = age;
//		this.userid = userid;
//		this.passwd = passwd;
//	}
	
	public void setName(String name) {
		this.name = name;
	}	
	public String getName() {
		return name;
	}	
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setUserid(String userid) {
		this.userid=userid;
	}
	public String getUserid() {
		return userid;
	}
	
	public void setPasswd(String passwd) {
		this.passwd=passwd;
	}
	public String getPasswd() {
		return passwd;
	}
	
}
	
	

