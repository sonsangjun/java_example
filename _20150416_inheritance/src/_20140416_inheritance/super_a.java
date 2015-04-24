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
		System.out.println("super_a에서 오버라이딩 했다.");
		System.out.println("그래서 오버라이드 된 메소드안에서 옛날 그놈을 호출할것이다.");
		super.printf_a_b();
	}
}
