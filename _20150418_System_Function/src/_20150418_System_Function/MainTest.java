package _20150418_System_Function;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.currentTimeMillis();
		double total = 0.0;
		for(int cnt = 1; cnt < 1000000000; cnt += 2)
		{
			if(cnt/ 2 % 2 == 0)
				total += 1.0 /cnt;
			else 
				total -= 1.0 / cnt;
		}
		double pi = total * 4;
		long time2 = System.currentTimeMillis();
		System.out.println("result = "+pi);
		System.out.printf("��꿡 �ҿ�� �ð��� %d ms",time2 - time1);
		
		// new�� ����ü�� �ȸ����, �׳� ��ü�� ���ڿ� ������ ���� �񱳴� �����ϴ�.
		String str1 = "�ڹ�";
		String str2 = "�ڹ�";
		if(str1 == str2)
			System.out.println("����");
		else
			System.out.println("�ٸ�");
		
		//�ٵ� str1, str2�� new�� �Ἥ ���� String ��ü�� ����� ���ϴ� �� ��ü�� ���̾ȵȴ�.
	}
}