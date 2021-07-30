package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		
		if (treeMap.containsKey(memberId)) {
			
			treeMap.remove(memberId); //키값이 memberId인 요소 제거
			return true;
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		
		while (ir.hasNext()) { //다음 요소 확인
			int key = ir.next(); //키값
			
			Member member = treeMap.get(key);
			System.out.println(member);
		}
	}
}
