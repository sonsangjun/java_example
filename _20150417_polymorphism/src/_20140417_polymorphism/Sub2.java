package _20140417_polymorphism;

public class Sub2 extends super_a {
	int id;
	Sub2(String name,String address, int score, int id)
	{
		super(name,address,score);
		this.id = id;		
	}
	void sendMessage(String mes){
		System.out.println("Sub2에 의해 오버라이드 됨");
		System.out.println(mes);
	}
}
