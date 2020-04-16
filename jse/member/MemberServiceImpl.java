package com.jse.member;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int count;
	public MemberServiceImpl() {
		members = new Member[5];
		count =0;
	}

	
	@Override
	public void add(Member member) {
		System.out.println("서비스로 들어온 맴버");
		System.out.println(member);
		members[count] = member;
		count++;
	}

//length는 여기에서 구성되있는 최대의 값을 표현하는것이고, count는 지금 사용하고 있는 수만 표현하는 것;
	@Override
	public Member[] list() {
		return members;
	}
	@Override
	public Member[] searchByName(String name) {
		Member[] returnMembers = null;
		int searchCount = count(name);
		if(searchCount != 0) {
			returnMembers =new Member[searchCount];
		int j = 0;
		for(int i=0;i<count;i++) {
			if(name.equals(members[i].getName())) {
				returnMembers[i] = members[i];
				j++;
					if(searchCount == j);
					break;
			}
		}
	}
		return returnMembers;
	}
	@Override
	public Member login(Member member) {
//			//왜? While을 안쓰는가? = 와일은 무한대로 돌기떄문에.s
//			//for문은 자신이 설정한 반복횟수로 검색을한다.
//			//parameter는 반드시 객체로 이동한다(보안상)
		//범인 몽타주 예를 기억하자, 기준을 하나 두고, 범위를 비교한다.
		Member returnMember = null;
		for(int i=0; i<count; i++) {//여기서는 검색으로 말한다 
			if(member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())){
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
	public int count() {
		return count;
	}
	@Override
	public int count(String name) {
		int returnCount = 0;
		for(int i=0;i<count;i++) {
			if(name.equals(members[i].getName())) {
				returnCount++;
			}
		}
		return returnCount;
	}
	
	@Override
	public Member[] searchByGender(String gender) {
			return null;
	}
	@Override
	public Member detail(String userid) {
		Member returnMember = null;
		for(int i=0;i<count;i++) {
			if(userid.equals(members[i].getUserid())) {
				returnMember = members[i];
				break;
			}
		}
		return returnMember;
	}
	@Override
	public void update(Member member) {
		for(int i=0;i<count;i++) {
			if(member.getUserid().equals(members[i].getUserid())) {
				members[i].setPasswd(member.getPasswd());
				break;
			}
		}
	}
	@Override
	public void delete(Member member) {
		for(int i=0; i<count; i++) {
			if(member.getUserid().equals(members[i].getUserid())
					&&  
					member.getPasswd().equals(members[i].getPasswd())) {
				members[i] = members[count-1];
				members[count-1] = null;
				count --;
				
			}
		}
	}
}
