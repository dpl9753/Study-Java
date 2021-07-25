package scheduler;

import java.io.IOException;
import java.sql.Connection;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		//Connection

		//R, L, P
		System.out.println("��ȭ ��� ��й���� �����ϼ���, R, L, P");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if (ch=='R' || ch=='r') {
			scheduler = new RoundRobin();
		}
		
		else if (ch=='L' || ch=='l') {
			scheduler = new LeastJob();
		}
		
		else if(ch=='P' || ch=='p') {
			scheduler = new PriorityAllocation();
		}
		
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
