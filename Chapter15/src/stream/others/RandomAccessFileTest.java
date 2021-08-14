package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100); //4바이트
		System.out.println(rf.getFilePointer()); //4
		rf.writeDouble(3.14); //8바이트
		System.out.println(rf.getFilePointer()); //12
		rf.writeUTF("안녕하세요"); //3 * 5 + 2 (3바이트 5개 + null character)
		System.out.println(rf.getFilePointer()); //29
		
		rf.seek(0); //파일포인터 위치를 0으로 옮김
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}
