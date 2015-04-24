package _20150420_Thread_III;

//���� �ܾ����� ��� ����ϴ� ������
public class PrintThread extends Thread{
	
	SharedArea sharedArea;
	public PrintThread(SharedArea area) {
		sharedArea = area;
	}
	public void run()
	{
		for(int cnt = 0; cnt < 1500; cnt ++)
		{
			int sum = sharedArea.getTotal();
			System.out.println("���� �ܾ� �հ�" + sum);
			/*
			synchronized(sharedArea){
				int sum = sharedArea.account1.balance + sharedArea.account2.balance;	//�����尣 ������� �����Ѿ�� ���� �߻��ϴ� ������ �Ʒ� ����ߴ�.
				System.out.println("���� �ܾ� �հ� " + sum );	//������ sum ����� ǥ���ϴ� ���� �۱� �����尡 �����⿡�� �۱��ϱ� ���� ��µǸ� ���� ������ Ʋ�����ٴ� ������ �߻�
			*/
			try										//�������� critical section �̶� �Ѵ�. �� ������ ��� �ذ��� ��������
			{										//�ذ���� ������ü�� ���� �κ��� sychronized�ϴ°��̴�. ����ȭ �Ҷ�, �� ��ɹ��� �ٸ� �����尡 ��ȣ�� ������ü ������ �����ش�.
				Thread.sleep(1);
			}catch (InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
