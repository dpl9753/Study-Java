package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		try (FileWriter fw = new FileWriter("writer.txt")) {
			
			fw.write("A");
			char[] cbuf = {'B', 'C', 'D'};
			fw.write(cbuf);
			fw.write("�ȳ��ϼ���");
			fw.write(cbuf, 1, 2);//ù��°���� �ΰ�
			fw.write("123");
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
