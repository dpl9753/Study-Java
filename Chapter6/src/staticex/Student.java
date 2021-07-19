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
		
		//static method������ member variable�� ������� �ʴ´�
		//studentName = "ȫ�浿"; //member(instance) variable, new�Ҷ� ������ ��
		
		return serialNum; //static(class) variable
	}
}
