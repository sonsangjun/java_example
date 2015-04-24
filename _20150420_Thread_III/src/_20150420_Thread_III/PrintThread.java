package _20150420_Thread_III;

//계좌 잔액합을 계속 출력하는 스레드
public class PrintThread extends Thread{
	
	SharedArea sharedArea;
	public PrintThread(SharedArea area) {
		sharedArea = area;
	}
	public void run()
	{
		for(int cnt = 0; cnt < 1500; cnt ++)
		{
			int sum = sharedArea.getTotal();
			System.out.println("계좌 잔액 합계" + sum);
			/*
			synchronized(sharedArea){
				int sum = sharedArea.account1.balance + sharedArea.account2.balance;	//스레드간 제어권이 언제넘어갈지 몰라 발생하는 문제는 아래 기술했당.
				System.out.println("계좌 잔액 합계 " + sum );	//문제가 sum 계산후 표시하는 동안 송금 스레드가 성춘향에게 송금하기 전에 출력되면 계좌 총합이 틀려진다는 문제가 발생
			*/
			try										//전문용어로 critical section 이라 한다. 이 문제는 어떻게 해결을 봐야할지
			{										//해결법은 공유객체를 쓰는 부분을 sychronized하는것이다. 동기화 할땐, 저 명령문이 다른 스레드가 괄호한 공유객체 접근을 막아준다.
				Thread.sleep(1);
			}catch (InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
