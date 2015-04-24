package _20150420_Thread_II;

import java.util.ArrayList;

//�����ڿ��� ���� ��Ű������ ���ư��� ������ ����� �迭����Ʈ�� �޾ƿ´�.
public class MonitorThread extends Thread {
	ArrayList<Thread> Threadlist = new ArrayList<Thread>();
	MonitorThread(ArrayList<Thread> Threadlist)
	{
		this.Threadlist = Threadlist;
	}
	
	public void run()
	{
		while(true)
		{	//�����尡 �Ϸ�Ǹ� complete�� true�ȴ�.
			boolean complete = false;
			System.out.println("1�� Thread \t 2��Thread");
			for(Thread i : Threadlist)
			{
				Thread.State state = i.getState();	//�� �������� ���¸� ���Ż���� ��ȯ
				System.out.print(state+"\t");		//�� �������� ���¸� ǥ���Ѵ�.
				if(state == Thread.State.TERMINATED)//���� �����尡 ������ complete => true �׸��� break;
				{									//�ٵ� for���� ��� �� ������ ��ü�� ĳ���� ������ �˾Ҵµ�, Threadlist.get(int index) �Լ� �̿��ϸ� �ȴ�. �� �޼ҵ��� ��ȯ���� E �̴�. E�� ����� ���� Ŭ����
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
