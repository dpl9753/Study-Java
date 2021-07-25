package interfaceex;

public interface Calc {
	//interface���� ������ variable�� ������ �������� constant�� ��ȯ��
	double PI = 3.14; //== public static final
	int ERROR = -999999999;

	//interface���� ������ method�� ������ �������� abstract method�� ��ȯ��
	int add(int num1, int num2); //== public abstract int ~~~~
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
	}
	
	static int total(int[] arr) {
		int total = 0;
		for (int i: arr) {
			total += i;
		}
		return total;
	}
}
