package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("exception");
		}
		
		/*
		AutoCloseObj obj = new AutoCloseObj(); //java 9���� �̰ŵ� ��
		try(obj) {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("exception");
		}
		*/
	}

}
