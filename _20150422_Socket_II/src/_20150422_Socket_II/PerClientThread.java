package _20150422_Socket_II;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;

public class PerClientThread extends Thread{
	static List<PrintWriter> list=
			Collections.synchronizedList(new ArrayList<PrintWriter>());
	
	Socket socket;
	PrintWriter writer;
	PerClientThread(Socket socket) {
		this.socket = socket;
		try{
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);
		}catch(Exception e)
		{
			System.out.println("소켓 열기 실패");
		}
	}
	
	public void run()
	{
		String name = null;
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			name = reader.readLine();
			sendAll("#"+name+" 님이 방에 들어옴.");
			while(true)
			{
				String str = reader.readLine();
				if(str == null)
					break;
				sendAll(name+">"+str);
			}		
		}catch(Exception e)
		{
			System.out.println("서버 송수신단 에러");
			System.out.println(e.getMessage());
		}
		
		list.remove(writer);
		sendAll("#"+name+"나감");
		try
		{
			socket.close();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("소켓 닫힘 예외 발생");
		}
	}
	
	private void sendAll(String str)
	{
		for(PrintWriter writer : list)
		{
			writer.println(str);
			writer.flush();
		}
	}
}
