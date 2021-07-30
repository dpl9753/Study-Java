package collection;

import java.util.Comparator;

//보통 그냥 하나만 구현하면됨
public class Member implements Comparable<Member>, Comparator<Member> {

	private int memberId;
	private String memberName;
	
	public Member() {} //default constructor
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			
			if (this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
	}

	@Override
	public int compareTo(Member member) { //id순
		//음수로 하려면 -1 곱해주면 됨 (내림차순)
		//return (this.memberId - member.memberId); //들어온 값보다 원래 값이 더 컸을때 양수를 반환->오름차순
		//아래는 문자열 비교
		return (this.memberName.compareTo(member.memberName));
	}

	@Override
	public int compare(Member member1, Member member2) {//1이 자기자신, 2가 넘어오는 값

		return (member1.memberId - member2.memberId);
	}
	
	
	
}
