package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "�̼���"); //class ����
		studentLee.address = "����� ���ʱ� ���ʵ�";
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "�̱� ��ȣ��";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
