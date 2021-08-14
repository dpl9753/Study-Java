package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100); //4����Ʈ
		System.out.println(rf.getFilePointer()); //4
		rf.writeDouble(3.14); //8����Ʈ
		System.out.println(rf.getFilePointer()); //12
		rf.writeUTF("�ȳ��ϼ���"); //3 * 5 + 2 (3����Ʈ 5�� + null character)
		System.out.println(rf.getFilePointer()); //29
		
		rf.seek(0); //���������� ��ġ�� 0���� �ű�
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}
