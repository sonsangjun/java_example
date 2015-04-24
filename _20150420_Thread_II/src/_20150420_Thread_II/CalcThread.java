package _20150420_Thread_II;

public class CalcThread extends Thread {
	SharedArea sharedArea;
	final int max_value = 1000000000;
	public void run()
	{
		int binary = 1;
		double total = 0.0;
		for(int cnt = 1; cnt < max_value; cnt+=2)
		{
			if(cnt/2 % 2 == 0)
				total += 1.0 / cnt;
			else
				total -= 1.0 / cnt;
			
			if( cnt % (int)(Math.pow(3.0, (double)binary)) == 0 )
			{
				binary++;
				System.out.println(cnt);
			}			
		}
		sharedArea.result = total * 4;
		synchronized(sharedArea)
		{
			sharedArea.notify();
		}
		System.out.println("계산 스레드 끝");
	}
}
