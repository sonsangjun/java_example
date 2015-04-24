package _20150416_class_ex;

public class Numbers {
	int num[];
	static int _total = 0;
	static double _average = 0;
	
	Numbers(int num[])
	{
		this.num = num;
	}
	void print_num()
	{
		for(int i : num)
			System.out.printf(i + " ");
		System.out.println();
	}
	
	int getTotal()
	{
		int total = 0;
		for(int cnt : num)
			total += cnt;
		_total += total;
		return total;		
	}
	
	double getAverage()
	{
		int total;
		total = getTotal();
		try{
			double average = (double)total / (double)num.length;	//length를 쓰면 배열의 인덱스 갯수를 반환하는듯
			_average = (_average + average)/2.0;
			return average;
		}catch(java.lang.ArithmeticException e)
		{
			System.out.println("예외 발생");
			return 0;			
		}		
	}
}

//이걸 멀티스레드로 처리할 수 있는 방법을 찾아보자.
