public class main_class {

	public static void main(String[] args) {
		//master_I으로 바뀜
		//테스트 해보니 accept()는 죽지 않는다. 즉, while무한루프를 생각하면 된다. 강제로 종료전까지 안죽네.
		//그렇다면 서버를 죽일수 있는 방법은 없을까...? Ctrl+C말고, Bye 이런것.
		//클라이언트 단 Socket연결은 일정시간이 지나면 죽는다. 
		//_Server serverT = new _Server();
		//serverT.serverStart();
		
		//_Client client = new _Client();
		//client.mainClient();
		
		_ServerTop serverTop = new _ServerTop();
		serverTop.mainServerTop();
	}
}
