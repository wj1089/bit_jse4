package com.jse.member;

public interface MemberService  {
//	public void setMembers(Member[] members);
//	public Member[] getMembers();
//	public void setCount(int count); //불필요함!
	
	public void add(Member member);
	public Member[] list();
	public Member detail(Member member);
	public int count();
	public Member login(Member member);
	public void update(Member member); 
	public void delete(Member member);
	//비즈니스로직으로 변환!(CRUD)
}
