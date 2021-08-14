package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {

		byte[] bs = new byte[26];
		byte data = 65;
		for (int i=0; i<bs.length; i++) {
			bs[i] = data++;
		}
		
		try (FileOutputStream fos = new FileOutputStream("output3.txt")) {//true�� append (�̾ ��), default�� false (���)
			fos.write(bs, 2, 10); //C ~ L����
			/*
			fos.write(65);
			fos.write(66); //�ƽ�Ű ���� �����Ǵ� ���ڸ� �����
			fos.write(67);
			*/
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
