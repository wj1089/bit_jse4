package com.jse.member;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int count;
	boolean ok;
	public MemberServiceImpl() {
		members = new Member[5];
	}

	
	@Override
	public void add(Member member) {
		System.out.println("서비스로 들어온 맴버");
		System.out.println(member);
		members[count] = member;
		count++;
	}

	@Override
	public Member login(Member member) {
//			//왜? While을 안쓰는가? = 와일은 무한대로 돌기떄문에.s
//			//for문은 자신이 설정한 반복횟수로 검색을한다.
//			//parameter는 반드시 객체로 이동한다(보안상)
		//범인 몽타주 예를 기억하자, 기준을 하나 두고, 범위를 비교한다.
		Member returnMember = null;
		for(int i=0; i<members.length; i++) {//여기서는 검색으로 말한다 
			if(member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())){
				returnMember = new Member();
				returnMember = members[i];
				break;
				}
			}
		return returnMember;
		// 지금 외부에서 맴버타입에 맴버를 받았고, 로그인이라는 공간을 주고, 
		// 입력한 아이디와 비밀번호는 비교하면서, 참인지 거짓인지 판별, 
		// 그리고 로그인에 맴버라는 파라미터값을 줌으로 써, 마지막 리턴값(결과)으로 반환.
	}


	@Override
	public Member[] list() {
		return null;
	}
	@Override
	public Member detail(Member member) {
		return null;
	}
	@Override
	public int count() {
		return 0;
	}
	@Override
	public void update(Member member) {
	}
	@Override
	public void delete(Member member) {
	}
}
