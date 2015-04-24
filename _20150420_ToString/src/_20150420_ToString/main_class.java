package _20150420_ToString;

public class main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsStock obj = new GoodsStock("57293",100);
		String str = obj.toString();	//오버라이드를 하지 않을경우 _20150420_ToString.GoodsStock@659e0bfd
										//이런 씨레기 값이 나온다.
		System.out.println();
		System.out.println(str);
	}

}
