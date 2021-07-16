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
		Student studentLee = new Student(); //class 생성
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서초구 서초동";
		
		studentLee.showStudentInfo();
	}
	*/
}
