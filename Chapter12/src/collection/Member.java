package collection;

import java.util.Comparator;

//���� �׳� �ϳ��� �����ϸ��
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
		return memberName + "ȸ������ ���̵�� " + memberId + "�Դϴ�.";
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
	public int compareTo(Member member) { //id��
		//������ �Ϸ��� -1 �����ָ� �� (��������)
		//return (this.memberId - member.memberId); //���� ������ ���� ���� �� ������ ����� ��ȯ->��������
		//�Ʒ��� ���ڿ� ��
		return (this.memberName.compareTo(member.memberName));
	}

	@Override
	public int compare(Member member1, Member member2) {//1�� �ڱ��ڽ�, 2�� �Ѿ���� ��

		return (member1.memberId - member2.memberId);
	}
	
	
	
}
