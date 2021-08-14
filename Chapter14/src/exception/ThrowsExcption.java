package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExcption {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {

		ThrowsExcption ex = new ThrowsExcption();
		try {
			ex.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) { //모든 익셉션을 핸들할수있음. Exception이 상위클래스니까!!
			System.out.println(e); //Exception 클래스를 맨 위에 쓰면 모든 오류가 들어가기때문에 맨 밑에 써준다.
		}
		System.out.println("end");
	}

}
