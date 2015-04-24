package _20140417_polymorphism;

public class Sub extends super_a {
	int _class_;
	Sub(String name, String address, int id, int _class_)
	{
		super(name,address,id);
		this._class_ = _class_;
	}
	void sendMessage(String mes){
		System.out.println("Sub에 의해 오버라이드 됨.");
		System.out.println(mes);
		
	}
}
