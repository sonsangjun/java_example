package _20150419_FileDump;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일을 바이트 단위로 읽어들임 그리고 int num 에 뭐가 들어가는지 확인해 봐야 겠다.
		//  read가 읽어들인 버퍼의 크기를 반환한다. (배열 크기만큼 읽으니 배열크기를 반환한다. 자세한건  http://docs.oracle.com/javase/7/docs/api/index.html Fileinputstream의 read return 참고)
		FileInputStream in = null;
		try
		{
			in = new FileInputStream("C:\\Users\\sohn\\OneDrive\\Java\\_20150419_FileIO\\readme.txt");
			byte arr[] = new byte[16];
			while(true)
			{
				int num = in.read(arr);
				if(num < 0)
					break;
				System.out.println("예시 : 16진수 num값");
				for(int cnt = 0; cnt < num; cnt ++)
				{
					System.out.printf("%02X %d ",arr[cnt],num);
					System.out.println(" "+arr);	//이건 그냥 메모리 주소인듯
				}
				System.out.println("\n-----");
			}
			
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("파일 엄듬");
		}
		catch(IOException ioe)
		{
			System.out.println("파일 못 읽음");
		}
		
		try{
			in.close();
		}
		catch(Exception e)
		{
			
		}

	}

}
