package _20150420_Thread_II;

import java.util.ArrayList;

//생성자에서 현재 패키지에서 돌아가는 스레드 목록을 배열리스트로 받아온다.
public class MonitorThread extends Thread {
	ArrayList<Thread> Threadlist = new ArrayList<Thread>();
	MonitorThread(ArrayList<Thread> Threadlist)
	{
		this.Threadlist = Threadlist;
	}
	
	public void run()
	{
		while(true)
		{	//스레드가 완료되면 complete가 true된다.
			boolean complete = false;
			System.out.println("1번 Thread \t 2번Thread");
			for(Thread i : Threadlist)
			{
				Thread.State state = i.getState();	//각 스레드의 상태를 열거상수로 반환
				System.out.print(state+"\t");		//각 스레드의 상태를 표시한다.
				if(state == Thread.State.TERMINATED)//만약 스레드가 끝나면 complete => true 그리고 break;
				{									//근데 for문을 써야 각 스레드 객체를 캐낼수 있을줄 알았는데, Threadlist.get(int index) 함수 이용하면 된다. 이 메소드의 반환값은 E 이다. E는 선언시 적은 클래스
					complete = true;
					break;
				}
			}
			System.out.println();
			
			if(complete == true)
				break;
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
