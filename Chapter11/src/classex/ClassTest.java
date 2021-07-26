package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		//Ŭ���� ��������! �׷��� ���� ������ �Ÿ� ����
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName()); 
		
		Person p2 = (Person) pClass3.newInstance(); //default constructor�� �Ҹ�
		System.out.println(person);
		System.out.println(p2);
		
	}

}
