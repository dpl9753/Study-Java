package staticex;

public class Student {

	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}
	
	public static int getSerialNum() {
		int i=10; //local variable
		
		i++;
		System.out.println(i);
		
		//static method에서는 member variable는 사용하지 않는다
		//studentName = "홍길동"; //member(instance) variable, new할때 생성이 됨
		
		return serialNum; //static(class) variable
	}
}
