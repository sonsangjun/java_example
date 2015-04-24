package _20150420_Thread_II;

import java.util.ArrayList;

public class MultithreadExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedArea obj = new SharedArea();	//��ü�� ���� �����ؼ� �ʱ�ȭ ���Ѿ� �Ѵ�. �ȱ׷��� �����尡 ��ģ��.
		CalcThread thread1 = new CalcThread();
		PrintThread thread2 = new PrintThread();
		thread1.sharedArea = obj;		//obj ��ü���� ���۷����� �ѱ�( cpp�� ���۷��� ���� �����ϱ� )
		thread2.sharedArea = obj;
		
		//������ ����͸�
		ArrayList<Thread> Threadlist = new ArrayList<Thread>();
		Threadlist.add(thread1);
		Threadlist.add(thread2);
		
		MonitorThread Mthread = new MonitorThread(Threadlist);
		
		thread1.start();
		thread2.start();
		Mthread.start();
		

	}

}
