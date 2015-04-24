
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
	final int byte_size = 16;	//16byte
	ServerSocket __server = null;
	Socket __serverSocket = null;
	FileInputStream inputFile = null;
	BufferedOutputStream fileSender = null;
	
	public void serverStart()
	{
		try {
			//서버가 연결을 기다리고 있음
			__server = new ServerSocket(portNum);
			__serverSocket = __server.accept();
			fileSender = new BufferedOutputStream(__serverSocket.getOutputStream());
			
		} catch (Exception e) {
			System.out.println("소켓 생성실패 " + e.getMessage());
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
					temp_size = inputFile.read(temp);
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
