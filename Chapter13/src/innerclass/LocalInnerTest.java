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
		//지역 내부 클래스
		int localNum = 100; //지역변수
		
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
				
				//localNum += 100; //오류
				//i += 200; //오류
				outNum += 10; //인스턴스변수라 됨
				
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				System.out.println(i); //출력은 문제없음
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
