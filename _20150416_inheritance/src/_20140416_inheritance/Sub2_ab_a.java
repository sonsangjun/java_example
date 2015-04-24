package _20140416_inheritance;

abstract public class Sub2_ab_a {
	String s1,s2,s3;
	Sub2_ab_a(String s1, String s2, String s3)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		//생성자는 구현해야하기 때문에 구현이 되고 추상메소드는 안된다.
	}
	
	abstract void print_mes(String mes);
	/*{
		System.out.println("추상 클래스 내 추상 메소드 입니다.");
		//Sub2에 상속될 클래스인데, 추상클래스 내의 추상메소드가 구현이 되어있으면 오류가 걸리는구나... 
	}*/
}
