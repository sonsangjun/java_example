package _20140417_interface;

//���� Ŭ���� ù���ڴ� �빮�ڷ� ���°� ���ʶ���. �˾Ƶα� 
public class main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// interface �׽�Ʈ
		String name = "�ջ���";
		String address = "����";
		int debt = 100;
		int account = 200;
		sub_a sa = new sub_a(name,address,account);
		sub_b sb = new sub_b(name,address,debt);
		
		print_class(sa,sb);
		sa.debt = (int)(Math.random() * 1000);
		sb.account =(int)(Math.random() * 1000);
		
		print_class(sa,sb);
		
		sa.setName("�����");
		sb.setAddress("����");
		
		print_class(sa,sb);
	}
	static void print_class(sub_a obj, sub_b obj2)
	{
		System.out.println("------------");
		System.out.println("name : " + obj.name + " address : " + obj.address + " debt : " + obj.debt);
		System.out.println("name : " + obj2.name + " address : " + obj2.address + " account : " + obj2.account);
	}

}
