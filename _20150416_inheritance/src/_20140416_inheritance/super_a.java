package _20140416_inheritance;

public class super_a extends super_ab {
	super_a(int _a, int _b) {
		super(_a,_b);		
	}
	void set_aa(int _a)
	{
		aa = _a;
	}
	void set_bb(int _b)
	{
		bb = _b;
	}
	
	void printf_a_b()
	{
		System.out.println("super_a���� �������̵� �ߴ�.");
		System.out.println("�׷��� �������̵� �� �޼ҵ�ȿ��� ���� �׳��� ȣ���Ұ��̴�.");
		super.printf_a_b();
	}
}
