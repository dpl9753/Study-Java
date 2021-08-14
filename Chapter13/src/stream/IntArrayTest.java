package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,};
		
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum();
		System.out.println(sum);
		
		//오류! 스트림이 이미 생성됨
		//int count = (int) stream.count();
		int count = (int) Arrays.stream(arr).count();
		System.out.println(count);
	}

}
