package _20140416_inheritance;

abstract public class super_ab{
	int aa;
	int bb;
	super_ab(int _a, int _b)
	{
		aa = _a;
		bb = _b;
	}
	void super_b_print()
	{
		System.out.println("���� B���� Ȱ���ϴ� �Լ���.");
	}
	void printf_a_b()
	{
		System.out.println(" a is " + aa + " b is "+ bb	);
	}
}
