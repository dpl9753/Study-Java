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
		
		try (FileOutputStream fos = new FileOutputStream("output3.txt")) {//true면 append (이어서 씀), default는 false (덮어씀)
			fos.write(bs, 2, 10); //C ~ L까지
			/*
			fos.write(65);
			fos.write(66); //아스키 값에 대응되는 문자를 출력함
			fos.write(67);
			*/
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
