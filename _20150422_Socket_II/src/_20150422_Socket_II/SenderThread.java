package _20150422_Socket_II;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread{
	Socket socket;
	String name;
	
	public SenderThread(Socket socket, String name) {
		this.socket = socket;
		this.name = name;
	}
	
	public void run()
	{
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			writer.println(name);
			writer.flush();
			
			while(true)
			{
				String str = reader.readLine();
				if(str.equals("bye"))
					break;
				writer.println(str);
				writer.flush();
			}
		}catch(Exception e)
		{
			System.out.println("채팅 예외발생 "+e.getMessage());
		}
		try{socket.close();}catch(Exception e ){}
	}
}

