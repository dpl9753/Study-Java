package binary;

public class BinaryTest {
	
	public static void main(String[] args)
	{
		int num = 10;
		int bNum = 0b1010;	//2진수, 10
		int oNum = 012;		//8진수
		int hNum = 0XA;		//16진수
		
		System.out.println(num);	//다 10진수로 출력됨
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
	}

}
