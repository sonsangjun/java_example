package _20150420_Thread_III;

//�۱� ������ �̸��� -> ������
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
			System.out.print("�̸��� ���� : 1���� ���� ");
			sharedArea.account2.deposit(10000);
			System.out.println("������ ���� : 1���� �Ա�");
			}
		}
	}
}
