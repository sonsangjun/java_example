package _20140416_inheritance;

public class Sub2 extends Sub2_ab_a{
	Sub2(String s1,String s2, String s3)
	{
		super(s1,s2,s3);
	}
	void print_mes(String mes)
	{
		System.out.println("생성자에서 받은 값 \nS1 ["+s1+"] S2 ["+s2+"] S3 ["+s3+"]");
		System.out.printf(mes+"안녕하세요 \nSub2에 상속된 추상클래스의 메소드라 합니다.");
	}
}
