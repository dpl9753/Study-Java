package binary;

public class ExplicitConversion {

	public static void main(String[] args) {
		int iNum = 1000;
		//byte bNum = iNum; //Error
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum); //소숫점 이하는 사라진다.
		
		float fNum = 0.9F;
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		
		System.out.println(num1);
		System.out.println(num2); //두 값이 다르다
	}

}
