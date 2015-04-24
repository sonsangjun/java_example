package _20150420_Scanner;

import java.util.Scanner;

public class main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String();
		int num = 0;
		Scanner scan = new Scanner(System.in);
		try{
			System.out.println("숫자를 입력하세요.");
			num = scan.nextInt();
		}catch(java.util.InputMismatchException ime) {
			System.out.println("잘못된 입력입니다.");
			String temp = scan.nextLine();	//잘못입력시 입력한 값이 버퍼에는 남는 문제가 있어 넥스트라인을 추가시켜 버퍼에 넣어버림
			System.out.println("버퍼에 남아있던값 " + temp);
			
		}
		
		try{
				System.out.println("문자열을 입력하세요.");
		str = scan.next();
		}catch(java.util.InputMismatchException ime) {
			System.out.println("잘못된 입력입니다.");
		}
		
		System.out.println("숫자는 : "+num+" 문자는 "+str);
	}

}
