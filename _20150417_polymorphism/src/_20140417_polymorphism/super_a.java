package _20140417_polymorphism;

public class super_a {
	String name;
	String address;
	int score;
	super_a(String name,String address, int score)
	{
		this.name = name;
		this.address = address;
		this.score = score;
	}
	void sendMessage(String mes)
	{
		System.out.println(mes);
	}
}
