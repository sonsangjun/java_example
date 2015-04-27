import java.net.*;


public class _ServerTopThread extends Thread {
	int serverTimeOut;
	ServerSocket serversocket = null;
	Socket socket = null;
	_ServerTopShared shared;
	public _ServerTopThread(_ServerTopShared shared ,int serverTimeOut) {
		this.serverTimeOut = serverTimeOut-5000;
		this.shared = shared;	
	}
	
	public void run()
	{
		try {
			System.out.println("서버 작동");
			
			//서버도 그냥 setSoTimeout 이용하면 타임아웃 시간 정할 수 있다. 
			//서버는 응답을 기다리기 때문에 따로 설정을 안하면 무한정 대기한다.
			//서버가 굳이 응답초과시간을 정할 필요는 없지만, 여긴 예제이므로 정해놓는다.
			serversocket = new ServerSocket(9000);
			serversocket.setSoTimeout(serverTimeOut);
			System.out.println("서버 소켓을 열었습니다. 타임아웃은 "+ serversocket.getSoTimeout()/1000+"초 입니다.");
			
			socket = serversocket.accept();
			synchronized (shared) {
				shared.connectionCheck = true;
			}
			System.out.println("연결 성공");
		}catch(Exception e) {
			System.out.println("타임아웃"+e.getMessage());
		}finally{
			try {
				socket.close();
			} catch (Exception e) {
				System.out.println("닫기 실패"+e.getMessage());
			}
		}
	}
}
