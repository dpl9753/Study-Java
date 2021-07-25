package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	public void washCar() {}
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	
	//final public void run() �� ����
	public final void run() { //�ó�����, ������ ���� template method
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
