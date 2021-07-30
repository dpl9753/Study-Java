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
		while (iterator.hasNext()) { //다음 값이 없으면 null을 반환하여 반복문 탈출
			Member member = iterator.next(); 
			
			int tempId = member.getMemberId();
			if (memberId == tempId) {
				hashSet.remove(member); //index랑 Object 두가지
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
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
