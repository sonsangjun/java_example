
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class _Server {
	final int portNum = 9000;
	final int byte_size = 1024;	//1Kbyte
	ServerSocket __server = null;
	Socket __serverSocket = null;
	FileInputStream inputFile = null;
	BufferedOutputStream fileSender = null;
	
	public void serverStart()
	{
		try {
			//서버가 연결을 기다리고 있음
			System.out.println("파일 입출력 서버 테스트");
			System.out.println("서버가 동작합니다.");
			__server = new ServerSocket(portNum);
			__serverSocket = __server.accept();
			
			System.out.println("클라이언트와 연결되었습니다.");
			
			fileSender = new BufferedOutputStream(__serverSocket.getOutputStream());
			System.out.println("버퍼 아웃스트림과 연결되었습니다. 네트워크 파일전송시 여기로 출력됩니다." );
			
		} catch (Exception e) {
			System.out.println("소켓 생성실패. JVM_Bind 오류시 다른 자바가상머신이 이미 동작중인지 확인하세요." + e.getMessage());
		}
		try {
				inputFile = new FileInputStream("Default.txt");
		}catch (Exception e) {
				System.out.println("파일 열기 실패  "+e.getMessage());
		}
		byte[] temp = new byte[byte_size];
		int temp_size = 0;
		while(true)
			{
				try {
					temp_size = inputFile.read(temp);	//파일 끝에 도달하면 -1 반환
					if(temp_size < 0)
						break;
				} catch (Exception e) {
					System.out.println("파일 읽기 실패 "+e.getMessage());
				}
				try {
					fileSender.write(temp);
					fileSender.flush();
				} catch (Exception e) {
					System.out.println("버퍼 쓰기 실패 "+e.getMessage());
				}	
			}
		try {
			inputFile.close();
			__serverSocket.close();
		} catch (Exception e) {
			System.out.println("마무리 실패 "+e.getMessage());
		}
	}
}
