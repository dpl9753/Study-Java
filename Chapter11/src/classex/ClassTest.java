package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		//클래스 가져오기! 그런데 보통 마지막 거를 쓴다
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName()); 
		
		Person p2 = (Person) pClass3.newInstance(); //default constructor가 불림
		System.out.println(person);
		System.out.println(p2);
		
	}

}
