package _20150418_enum;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test("32191","����Ƽ����",Season.SUMMER);
		System.out.println("��ǰ�ڵ�"+obj.code+" ��ǰ��"+obj.name+" ��������"+obj.season);
		System.out.println(obj.season);
		
		Season son[] = Season.values();
		for(Season i : son)
			System.out.printf(i + " ");
		System.out.println();
		System.out.println(Season.valueOf("SUMMER"));
	}

}
