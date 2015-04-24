package _20150414;

public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HelloWorld"	);
		int[] anb = new int[100];
		//배열 선언시 자동으로 초기화가 된다. JAVA는 그렇다.
		System.out.println(anb[1]+anb[2]);
		
		System.out.println("sum = "+sum());
			
		int i = 1;
		int j = 0;
		int k;
		try {k = i / j;}
		catch( java.lang.ArithmeticException e)
		{
			System.out.println("예외 발생");
		}
		anb[0] = 1;
		anb[1] = 2;
		anb[2] = 3;
		System.out.println(total_sum(anb));
		
		for(int _i:anb)
			System.out.println(_i);
		//헐... 값 복사가아니라 레퍼런스로 넘기네 얕은 복사 오류 걸리겠군...
		System.out.println("0.0/0.0 = "+ (0.0/0.0));
		float _float = 12.34f;
		System.out.println(_float);
			
	}
	
	
	static int sum()
	{
		//배열이 아닌경우는 초기화해야하네. 안하면 오류
		int temp=0;
		for(int i=0; i<100; i++)
			temp += i;
		return temp;
	}
	static int total_sum(int i[])
	{
		i[1] = 4;
		int total=0;
		for(int j : i)
			total+=j;
		return total;
			
	}

}
