package generics;

import java.util.ArrayList;

public class TreeDPrinterTest {

	public static void main(String[] args) {

		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
		Powder powder = printer.getMaterial();
		System.out.println(printer);
		
		TreeDPrinter<Plastic> printerPlastic = new TreeDPrinter<Plastic>();
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic = printerPlastic.getMaterial();
		System.out.println(printerPlastic);
		
		/* * * Water�� material�� ��ӹ��� �ʾ����Ƿ� �۵����� ����
		TreeDPrinter<Water> printerWater = new TreeDPrinter<Water>();
		printerWater.setMaterial(new Water());
		System.out.println(printerWater);
		*/
		
		printerPlastic.printing();
		
		ArrayList list = new ArrayList(); //�̷��� ������ �ֱ�� ��(���Ե� �ڷ��� ��� x)
	}	//��� ���߿� ��ȯ���� ���� ���� ����ȯ�� �ؾ���

}
