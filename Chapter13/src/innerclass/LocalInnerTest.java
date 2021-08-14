package innerclass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
	
	
	Runnable runnable = new Runnable() { //anonymous inner class
		
		@Override
		public void run() {
			System.out.println("runnable");
		}
	};
	
	
	public Runnable getRunnable(int i) { //Runnable : interface
		//���� ���� Ŭ����
		int localNum = 100; //��������
		
		return new Runnable() {

			@Override
			public void run() {
				outNum += 10;
				
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				System.out.println(i);
			}
			
		};
		
		
		
		/*
		class MyRunnable implements Runnable {

			@Override
			public void run() {
				
				//localNum += 100; //����
				//i += 200; //����
				outNum += 10; //�ν��Ͻ������� ��
				
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				System.out.println(i); //����� ��������
			}
			
		}
		
		return new MyRunnable();
		*/
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {

		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(20);
		runnable.run();
		
		outer.runnable.run();
	}

}
