package _20140416_inheritance;

public class Sub2 extends Sub2_ab_a{
	Sub2(String s1,String s2, String s3)
	{
		super(s1,s2,s3);
	}
	void print_mes(String mes)
	{
		System.out.println("�����ڿ��� ���� �� \nS1 ["+s1+"] S2 ["+s2+"] S3 ["+s3+"]");
		System.out.printf(mes+"�ȳ��ϼ��� \nSub2�� ��ӵ� �߻�Ŭ������ �޼ҵ�� �մϴ�.");
	}
}
