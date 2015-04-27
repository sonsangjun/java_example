import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerThread extends Thread{
	int portNum;
	ServerSocket serversocket = null;
	Socket socket = null;
	
	public ServerThread(ServerSocket serversocket,int portNum) {
		this.serversocket = serversocket;	
		this.portNum = portNum;
	}
	public void run()
	{
		while(true)
		{
			try {
				System.out.println("서버 시작합니다.");
				serversocket.accept();
				System.out.println("서버 클라이언트 연결되었습니다.");
			} catch (IOException e) {
				System.out.println("서버 연결 대기 실패 "+ e.getMessage());
				break;
			}
		}	
	}
}
