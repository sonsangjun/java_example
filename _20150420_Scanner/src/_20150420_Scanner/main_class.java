package _20150420_Scanner;

import java.util.Scanner;

public class main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String();
		int num = 0;
		Scanner scan = new Scanner(System.in);
		try{
			System.out.println("���ڸ� �Է��ϼ���.");
			num = scan.nextInt();
		}catch(java.util.InputMismatchException ime) {
			System.out.println("�߸��� �Է��Դϴ�.");
			String temp = scan.nextLine();	//�߸��Է½� �Է��� ���� ���ۿ��� ���� ������ �־� �ؽ�Ʈ������ �߰����� ���ۿ� �־����
			System.out.println("���ۿ� �����ִ��� " + temp);
			
		}
		
		try{
				System.out.println("���ڿ��� �Է��ϼ���.");
		str = scan.next();
		}catch(java.util.InputMismatchException ime) {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		
		System.out.println("���ڴ� : "+num+" ���ڴ� "+str);
	}

}
