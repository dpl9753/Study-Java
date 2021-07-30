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
			
			treeMap.remove(memberId); //Ű���� memberId�� ��� ����
			return true;
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		
		while (ir.hasNext()) { //���� ��� Ȯ��
			int key = ir.next(); //Ű��
			
			Member member = treeMap.get(key);
			System.out.println(member);
		}
	}
}
