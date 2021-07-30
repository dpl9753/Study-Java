package collection.hashset;

import collection.Member;

public class MamberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(101, "ÀÌ¼ø½Å");
		Member memberKim = new Member(102, "±èÀ¯½Å");		
		Member memberShin = new Member(103, "½Å»çÀÓ´ç");
		
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberShin);
		
		memberHashSet.showAll();
		
		Member memberLee2 = new Member(101, "ÀÌ¸ù·æ");
		
		memberHashSet.addMember(memberLee2);
		
		memberHashSet.showAll();
	}

}
