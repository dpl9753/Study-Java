package generics;

public class TreeDPrinter<T extends Material> { //클래스를 상속받은 것들만 쓸 수 있다

	private T material; //private static T material; 은 불가능하다!

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
	
}
