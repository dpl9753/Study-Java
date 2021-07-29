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
		
		/* * * Water가 material을 상속받지 않았으므로 작동하지 않음
		TreeDPrinter<Water> printerWater = new TreeDPrinter<Water>();
		printerWater.setMaterial(new Water());
		System.out.println(printerWater);
		*/
		
		printerPlastic.printing();
		
		ArrayList list = new ArrayList(); //이렇게 쓸수도 있기는 함(대입된 자료형 명시 x)
	}	//대신 나중에 반환형에 따라 강제 형변환을 해야함

}
