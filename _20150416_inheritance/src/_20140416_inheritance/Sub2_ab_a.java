package _20140416_inheritance;

abstract public class Sub2_ab_a {
	String s1,s2,s3;
	Sub2_ab_a(String s1, String s2, String s3)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		//�����ڴ� �����ؾ��ϱ� ������ ������ �ǰ� �߻�޼ҵ�� �ȵȴ�.
	}
	
	abstract void print_mes(String mes);
	/*{
		System.out.println("�߻� Ŭ���� �� �߻� �޼ҵ� �Դϴ�.");
		//Sub2�� ��ӵ� Ŭ�����ε�, �߻�Ŭ���� ���� �߻�޼ҵ尡 ������ �Ǿ������� ������ �ɸ��±���... 
	}*/
}
