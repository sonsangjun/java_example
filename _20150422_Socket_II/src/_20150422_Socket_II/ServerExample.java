package _20150422_Socket_II;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public void mainServer()
	{
		ServerSocket serverSocket = null;
		System.out.println("서버시작");
		try{
			serverSocket = new ServerSocket(9000);
			while(true)
			{
				Socket socket = serverSocket.accept();
				Thread thread = new PerClientThread(socket);
				thread.start();
			}
		}catch(Exception e)
		{
			System.out.println("서버 작동 실패");
		}
		System.out.println("서버정지");
	}
}
