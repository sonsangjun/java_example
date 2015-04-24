package _20150422_Socket_TCPIP;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample1 {
	public void mainSocket()
	{
		Socket socket = null;
		
		try{
			socket = new Socket("192.168.0.3",9000);
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			String str = "Hello, Server";
			out.write(str.getBytes());
			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("연결되지 않았습니다.");
		}
		try{
			socket.close();
		}catch(Exception e)
		{
			System.out.println("닫을 소켓이 없습니다.");			
		}
		
	}

}
