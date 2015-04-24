package _20140416_inheritance;

public class main_class{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main이 있는 클래스에서 main 함수를 쓰고 싶다면 모두 스테틱 밖에 안되는군.
	super_a a = new super_a(1,2);
	a.super_b_print();
	a.printf_a_b();
	
	Sub2 s2 = new Sub2("가","나","다");
	s2.print_mes("SSJ");
	

	}
	
}
