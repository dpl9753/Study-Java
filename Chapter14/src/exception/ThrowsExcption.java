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
		} catch (Exception e) { //��� �ͼ����� �ڵ��Ҽ�����. Exception�� ����Ŭ�����ϱ�!!
			System.out.println(e); //Exception Ŭ������ �� ���� ���� ��� ������ ���⶧���� �� �ؿ� ���ش�.
		}
		System.out.println("end");
	}

}
