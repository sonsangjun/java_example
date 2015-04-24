package _20150418_System_Function;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.currentTimeMillis();
		double total = 0.0;
		for(int cnt = 1; cnt < 1000000000; cnt += 2)
		{
			if(cnt/ 2 % 2 == 0)
				total += 1.0 /cnt;
			else 
				total -= 1.0 / cnt;
		}
		double pi = total * 4;
		long time2 = System.currentTimeMillis();
		System.out.println("result = "+pi);
		System.out.printf("계산에 소요되 시간은 %d ms",time2 - time1);
		
		// new로 새객체를 안만들고, 그냥 객체에 문자열 넣으면 서로 비교는 가능하다.
		String str1 = "자바";
		String str2 = "자바";
		if(str1 == str2)
			System.out.println("같음");
		else
			System.out.println("다름");
		
		//근데 str1, str2를 new를 써서 각각 String 객체를 만들면 비교하는 거 자체가 말이안된다.
	}
}