package _20150420_Data_Structure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("����");
		list.add("����");
		list.add("�丶��");
		for(int i=0 ; i<list.size(); i++)
			System.out.println(list.get(i));
		
		list.remove("����");
		list.remove(1);
		list.add(0, "����");
		
		System.out.println("----------\n�̰� �� �ٸ��� �ɶ��...");
		for(String str : list)
			System.out.println(str);
		
		//�ε��� �˻�
		System.out.println("�ε��� �˻� -1�� ���ٴ� �ǹ��Դϴ�.");
		System.out.println("���� " + list.indexOf("����"));
		System.out.println("���� " + list.indexOf("����"));
		
		//LinkedList �� ArrayList�� �ٸ� �۵������ ������ �ִ�. �ڼ��Ѱ� ���ͳ� ���� ArrayList�� �迭�� �۵������ ����ϴ�.
		//�ٵ� ����� �Ѵ� ����. �ܺο��� ���̴� ���� ������, ���� �۵� ����� �ٸ���
		
		System.out.println("----------LinkedList");
		LinkedList<String> list_II = new LinkedList<String>();
		list_II.add("����");
		list_II.add("����");
		list_II.add("����");
		list_II_print(list_II);
		
		list_II.add(2,"Ű��");
		list_II_print(list_II);
				
		list_II.set(0,"����");
		list_II_print(list_II);
		
		list_II.remove(1);
		list_II_print(list_II);
		
		list_II.remove("Ű��");
		list_II_print(list_II);
		
		//Iterator �̿��� �ٷ�� next() ó�� ȣ��� ù ��° ������ ȣ��
		//hasnext()�� �ڷᱸ������ ������ ������ true ������ false ��ȯ�Ѵ�.
		Iterator<String> iter = list_II.iterator();
		System.out.println("iterator ��� next() �޼ҵ� ȣ��");
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
	
	static void list_II_print(LinkedList<String> list)
	{
		for(String i : list)
			System.out.print(i + " ");
		System.out.println();
	}

}
