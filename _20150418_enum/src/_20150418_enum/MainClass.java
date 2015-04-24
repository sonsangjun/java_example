package _20150418_enum;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test("32191","반팔티셔츠",Season.SUMMER);
		System.out.println("상품코드"+obj.code+" 상품명"+obj.name+" 계절구분"+obj.season);
		System.out.println(obj.season);
		
		Season son[] = Season.values();
		for(Season i : son)
			System.out.printf(i + " ");
		System.out.println();
		System.out.println(Season.valueOf("SUMMER"));
	}

}
