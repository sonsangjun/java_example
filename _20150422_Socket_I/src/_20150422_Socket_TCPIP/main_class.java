package _20150422_Socket_TCPIP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClientExample1 Clinet = new ClientExample1();
		//Clinet.mainSocket();
		
		//ServerExample1 Server = new ServerExample1();
		//Server.mainServer();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();
		try{
			str = reader.readLine();
			for(int i = 0 ; i<3; i++)
			{
				System.out.println(str);
				System.out.flush();
			}
		}catch(Exception e)
		{
			System.out.println("예외 발생");
		}
		
	}

}
