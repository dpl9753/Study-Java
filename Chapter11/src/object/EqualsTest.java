package object;

class Student {
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (studentID == std.studentID)
				return true;
			else
				return false;
		}
		return false;
	}
	
	public int hashCode() {
		return studentID;
	}
	
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2); //address를 체크
		System.out.println(str1.equals(str2)); //문자열 내용이 같은지 확인
		
		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");
		
		System.out.println(std1 == std2); //false
		System.out.println(std1.equals(std2)); //false -> 재정의로 true
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());

		System.out.println(System.identityHashCode(std2));
		 
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
		//왜 같게 나올까???
		//논리적으로 동일함을 위해 equals() 메서드를 재정의했다면, hashCode() 메서드로 재정의하여 동일한 값이 반환되도록 함
		System.out.println(str1.hashCode()); 
		System.out.println(str2.hashCode()); 
	}

}
