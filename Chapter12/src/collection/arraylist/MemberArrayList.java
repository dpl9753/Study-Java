package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		/*
		for (int i=0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if (memberId == tempId) {
				arrayList.remove(i);
				return true;
			}
		}
		*/
		
		Iterator<Member> iterator = arrayList.iterator();
		while (iterator.hasNext()) { //다음 값이 없으면 null을 반환하여 반복문 탈출
			Member member = iterator.next(); 
			
			int tempId = member.getMemberId();
			if (memberId == tempId) {
				arrayList.remove(member); //index랑 Object 두가지
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		
		for (Member member: arrayList) {
			System.out.println(member);
		}
		System.out.println();
		
		//System.out.println(arrayList);
	}
}
