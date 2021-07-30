package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {

	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> iterator = hashSet.iterator();
		while (iterator.hasNext()) { //���� ���� ������ null�� ��ȯ�Ͽ� �ݺ��� Ż��
			Member member = iterator.next(); 
			
			int tempId = member.getMemberId();
			if (memberId == tempId) {
				hashSet.remove(member); //index�� Object �ΰ���
				return true;
			}
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAll() {
		
		for (Member member: hashSet) {
			System.out.println(member);
		}
		System.out.println();
		
		//System.out.println(hashSet);
	}
}
