package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		
		if (hashMap.containsKey(memberId)) {
			
			hashMap.remove(memberId); //키값이 memberId인 요소 제거
			return true;
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while (ir.hasNext()) { //다음 요소 확인
			int key = ir.next(); //키값
			
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
}
