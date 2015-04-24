package _20150420_Thread_III;

//¼Û±İ ½º·¹µå ÀÌ¸ù·æ -> ¼ºÃáÇâ
public class TransferThread extends Thread {
	SharedArea sharedArea;
	public TransferThread(SharedArea area) {
		sharedArea = area;
	}
	public void run()
	{
		for(int cnt = 0; cnt < 1500; cnt ++)
		{
			synchronized(sharedArea){
			sharedArea.account1.withdraw(10000);
			System.out.print("ÀÌ¸ù·æ °èÁÂ : 1¸¸¿ø ÀÎÃâ ");
			sharedArea.account2.deposit(10000);
			System.out.println("¼ºÃáÇâ °èÁÂ : 1¸¸¿ø ÀÔ±İ");
			}
		}
	}
}
