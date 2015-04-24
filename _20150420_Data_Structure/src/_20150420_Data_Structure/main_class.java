package _20150420_Data_Structure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("포도");
		list.add("딸기");
		list.add("토마토");
		for(int i=0 ; i<list.size(); i++)
			System.out.println(list.get(i));
		
		list.remove("포도");
		list.remove(1);
		list.add(0, "감자");
		
		System.out.println("----------\n이건 좀 다른것 될라니...");
		for(String str : list)
			System.out.println(str);
		
		//인덱스 검색
		System.out.println("인덱스 검색 -1은 없다는 의미입니다.");
		System.out.println("포도 " + list.indexOf("포도"));
		System.out.println("감자 " + list.indexOf("감자"));
		
		//LinkedList 는 ArrayList와 다른 작동방식을 가지고 있다. 자세한건 인터넷 참고 ArrayList는 배열과 작동방식이 비슷하다.
		//근데 기능은 둘다 같다. 외부에서 보이는 것은 같지만, 내부 작동 방식이 다를뿐
		
		System.out.println("----------LinkedList");
		LinkedList<String> list_II = new LinkedList<String>();
		list_II.add("포도");
		list_II.add("딸기");
		list_II.add("복숭");
		list_II_print(list_II);
		
		list_II.add(2,"키위");
		list_II_print(list_II);
				
		list_II.set(0,"오렌");
		list_II_print(list_II);
		
		list_II.remove(1);
		list_II_print(list_II);
		
		list_II.remove("키위");
		list_II_print(list_II);
		
		//Iterator 이용해 다루기 next() 처음 호출시 첫 번째 데이터 호출
		//hasnext()는 자료구조에서 읽을게 있으면 true 없으면 false 반환한다.
		Iterator<String> iter = list_II.iterator();
		System.out.println("iterator 사용 next() 메소드 호출");
		
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
