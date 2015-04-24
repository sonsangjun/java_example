package _20150420_Thread_II;

import java.util.ArrayList;

public class MultithreadExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedArea obj = new SharedArea();	//객체를 먼저 생성해서 초기화 시켜야 한다. 안그러면 스레드가 미친다.
		CalcThread thread1 = new CalcThread();
		PrintThread thread2 = new PrintThread();
		thread1.sharedArea = obj;		//obj 객체값을 레퍼런스로 넘김( cpp의 레퍼런스 변수 생각하기 )
		thread2.sharedArea = obj;
		
		//스레드 모니터링
		ArrayList<Thread> Threadlist = new ArrayList<Thread>();
		Threadlist.add(thread1);
		Threadlist.add(thread2);
		
		MonitorThread Mthread = new MonitorThread(Threadlist);
		
		thread1.start();
		thread2.start();
		Mthread.start();
		

	}

}
