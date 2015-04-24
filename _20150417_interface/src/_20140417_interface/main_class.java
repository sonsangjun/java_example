package _20140417_interface;

//원래 클래스 첫글자는 대문자로 쓰는게 관례란다. 알아두기 
public class main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// interface 테스트
		String name = "손상준";
		String address = "광주";
		int debt = 100;
		int account = 200;
		sub_a sa = new sub_a(name,address,account);
		sub_b sb = new sub_b(name,address,debt);
		
		print_class(sa,sb);
		sa.debt = (int)(Math.random() * 1000);
		sb.account =(int)(Math.random() * 1000);
		
		print_class(sa,sb);
		
		sa.setName("김상준");
		sb.setAddress("서울");
		
		print_class(sa,sb);
	}
	static void print_class(sub_a obj, sub_b obj2)
	{
		System.out.println("------------");
		System.out.println("name : " + obj.name + " address : " + obj.address + " debt : " + obj.debt);
		System.out.println("name : " + obj2.name + " address : " + obj2.address + " account : " + obj2.account);
	}

}
