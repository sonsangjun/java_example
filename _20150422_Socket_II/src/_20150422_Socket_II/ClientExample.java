package _20150422_Socket_II;

import java.net.Socket;
import java.util.Scanner;

public class ClientExample {
	public void mainClient()
	{
		System.out.println("사용자 진입.");
		Scanner yourName = new Scanner(System.in);
		String name = yourName.nextLine();
		
		try{
			Socket socket = new Socket("192.168.0.3",9000);
			Thread thread1 = new SenderThread(socket, name);
			Thread thread2 = new ReceiverThread(socket);
			thread1.start();
			thread2.start();
			
		}catch(Exception e){
			
		}
		
	}
}
