package _20150420_Thread_III;

//���� ������ �κ�
public class SharedArea {
	Account account1;
	Account account2;
	
	//�޼ҵ� ���� �ڵ尡 ��� ����ȭ�� �ʿ��ϸ� �޼ҵ� �տ� ����ȭ�� ���൵ �ȴ�.
	//����ȭ ��� ������ ����ȭ�� �ǰ� ������ ����� ����ȭ�� ���� �ʴ´�.
	//�����ؾ��Ѵ�. ���ϴ� �����͸� ��� �ʹٸ�, ����ȭ ��ü�� �����Ͱ� ���ԵǴ� �κ��� �������� sychronized�� ���ٰ�
	synchronized int getTotal()
	{
		return account1.balance + account2.balance;
	}
}
