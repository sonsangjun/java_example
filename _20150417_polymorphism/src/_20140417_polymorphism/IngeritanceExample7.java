package _20140417_polymorphism;

public class IngeritanceExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �׽�Ʈ super_a�� ��ӹ��� �ڴ� Sub,Sub2 Ŭ������ �ش� Ŭ������ ��ü�� ���� super_a ��ü�� �־ ������
		Sub s_test_1 = new Sub("�ջ���","����",100,5);
		Sub2 s_test_2 = new Sub2("�輺��","����",99,1);
		System.out.println("������ �׽�Ʈ \n����� �ùٸ��� ��µǾ��Ѵ�.");
		print_info(s_test_1);
		print_info(s_test_2);
		System.out.println();
		
		//�� ���ű� �ѵ�... �޼ҵ� �������̵� ������ ¯�ε�
		sendMes(s_test_1,"�����մϴ�.");
		sendMes(s_test_2,"�����մϴ�.");
		
		
	}
	static void print_info(super_a obj)
	{
		System.out.println("�̸��� " + obj.name);
		System.out.println("�ּҴ� " + obj.address);
		System.out.println("������ " + obj.score);
	}
	static void sendMes(super_a obj, String mes)
	{
		obj.sendMessage(mes);
	}
}
