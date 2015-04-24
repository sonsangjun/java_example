package _20150420_Thread_III;

//공유 데이터 부분
public class SharedArea {
	Account account1;
	Account account2;
	
	//메소드 내의 코드가 모두 동기화가 필요하면 메소드 앞에 동기화를 써줘도 된다.
	//동기화 블록 끼리만 동기화가 되고 나머지 블록은 동기화가 되지 않는다.
	//유의해야한다. 원하는 데이터를 얻고 싶다면, 동기화 겍체나 데이터가 포함되는 부분은 빠짐없이 sychronized를 써줄것
	synchronized int getTotal()
	{
		return account1.balance + account2.balance;
	}
}
