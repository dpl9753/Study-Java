package innerclass;

class OutClass {
	
	private int num = 10;	//instance변수
	private static int sNum = 20;
	private InClass inClass; //내부에서만 사용할거니까 private로 막아놓는 것이 일반적
	
	public OutClass() {
		inClass = new InClass();
	}
	
	private class InClass {
		int inNum = 200;
		//static int sInNum = 100;
		//인스턴스 내부 클래스에서 static 변수를 사용할 수 없다
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
		
		//static void sTest() { }
	}
	
	public void usingInTest() {
		inClass.inTest();
	}
	
	static class InStaticClass { //static inner class
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10; //외부클래스의 인스턴스 변수는 사용할 수 없음
			sNum += 10;
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() {
			System.out.println(sNum);
			//System.out.println(iNum); //못씀!
			System.out.println(sInNum);
		}
	}
}


public class InnerTest {

	public static void main(String[] args) {

		/*
		OutClass outClass = new OutClass();
		outClass.usingInTest();
		*/
		
		/*
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		*/
		OutClass.InStaticClass.sTest();
		
		
	}

}
