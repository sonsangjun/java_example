package _20150420_Thread_II;

public class PrintThread extends Thread{
	SharedArea sharedArea;
	public void run()
	{
		synchronized(sharedArea)
		{	
			try {
				sharedArea.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(sharedArea.result);
		}
	}
}
