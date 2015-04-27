import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class _ServerTest {
	ServerSocket serversocket = null;
	Socket socket = null;
	
	public void mainServer()
	{
		try {
			System.out.println("서버 작동");
			serversocket = new ServerSocket(9000);
			socket = serversocket.accept();
			System.out.println("연결 성공");
		}catch(Exception e) {
			System.out.println("연결 대기 실패"+e.getMessage());
		}finally{
			try {
				socket.close();
			} catch (Exception e) {
				System.out.println("닫기 실패"+e.getMessage());
			}
		}
	}
}
