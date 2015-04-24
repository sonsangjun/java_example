package _20140417_polymorphism;

public class IngeritanceExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다형성 테스트 super_a를 상속받은 자는 Sub,Sub2 클래스는 해당 클래스로 객체를 만들어서 super_a 객체에 넣어도 괜찮다
		Sub s_test_1 = new Sub("손상준","광주",100,5);
		Sub2 s_test_2 = new Sub2("김성하","전주",99,1);
		System.out.println("다형성 테스트 \n결과가 올바르게 출력되야한다.");
		print_info(s_test_1);
		print_info(s_test_2);
		System.out.println();
		
		//오 개신기 한데... 메소드 오버라이딩 다형성 짱인듯
		sendMes(s_test_1,"축하합니다.");
		sendMes(s_test_2,"축하합니다.");
		
		
	}
	static void print_info(super_a obj)
	{
		System.out.println("이름은 " + obj.name);
		System.out.println("주소는 " + obj.address);
		System.out.println("점수는 " + obj.score);
	}
	static void sendMes(super_a obj, String mes)
	{
		obj.sendMessage(mes);
	}
}
