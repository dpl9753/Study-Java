package generics;

public class TreeDPrinter<T extends Material> { //Ŭ������ ��ӹ��� �͵鸸 �� �� �ִ�

	private T material; //private static T material; �� �Ұ����ϴ�!

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
