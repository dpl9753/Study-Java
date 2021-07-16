package classpart;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {}
	
	public Student(int id, String name)
	{
		studentID = id;
		studentName = name;
	}
	
	public void showStudentInfo()
	{
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	
	public void setStudentName(String name)
	{
		studentName = name;
	}
	
	/*
	public static void main(String[] args)
	{
		Student studentLee = new Student(); //class ����
		studentLee.studentName = "�̼���";
		studentLee.address = "����� ���ʱ� ���ʵ�";
		
		studentLee.showStudentInfo();
	}
	*/
}
