package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		
		if (len == 0) {
			System.out.println("ť�� ������ϴ�.");
			return null;
		}
		
		return arrayQueue.remove(len - 1);
	}
}



public class QueueTest {

	public static void main(String[] args) {

		MyQueue queue = new MyQueue();
		
		queue.enQueue("a");
		queue.enQueue("b");
		queue.enQueue("c");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());	
		System.out.println(queue.deQueue()); //underflow
	}

}
