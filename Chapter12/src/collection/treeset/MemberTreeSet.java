package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> iterator = treeSet.iterator();
		while (iterator.hasNext()) { //다음 값이 없으면 null을 반환하여 반복문 탈출
			Member member = iterator.next(); 
			
			int tempId = member.getMemberId();
			if (memberId == tempId) {
				treeSet.remove(member); //index랑 Object 두가지
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		
		for (Member member: treeSet) {
			System.out.println(member);
		}
		System.out.println();
		
		//System.out.println(treeSet);
	}
}
