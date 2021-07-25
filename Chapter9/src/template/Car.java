package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	public void washCar() {}
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	//final public void run() 도 가능
	public final void run() { //시나리오, 순서를 정함 template method
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
