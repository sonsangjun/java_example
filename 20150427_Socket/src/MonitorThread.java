import java.util.ArrayList;


public class MonitorThread extends Thread{
	ArrayList<Thread> threadList = new ArrayList<Thread>();	//작동중인 스레드 목록
	int interval;
	public MonitorThread(ArrayList<Thread> threadList,int interval)
	{
		this.threadList = threadList;
		this.interval = interval;
	}
	
	public void run()
	{
		int ThreadSize = threadList.size();
		int No = 0;
		int counter = 0;
		boolean flag = true;
		while(flag)
		{
			for(Thread i : threadList)
			{
				if(i.getState() == Thread.State.TERMINATED)
					counter++;
				
				if(No == 0) {System.out.println("0번 스레드 : "+i.getState()); No++;}
				else {System.out.println("1번 스레드 : "+i.getState()); No = 0;}
			}
			if(counter >= ThreadSize)
				flag=false;
			else
				counter=0;
			
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				System.out.println("스레드 잠자기 실패 (사유 :"+e.getMessage()+")");
			}
		}
		System.out.println("스레드 모니터링을 종료합니다.");
	}
}
