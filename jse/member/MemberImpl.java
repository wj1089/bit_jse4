package com.jse.member;

public class MemberImpl implements MemberService {
	private Member[] members;
	public MemberImpl() {
		members = new Member[10];
	}
	@Override
	public void setName(String name) {
		this.name = name;

	}
	@Override
	public void setAge(int age) {
		this.age=age;
	}
	@Override
	public void setUserid(String userid) {
		this.userid=userid;

	}
	@Override
	public void setPasswd(String passwd) {
		this.passwd=passwd;

	}

}
