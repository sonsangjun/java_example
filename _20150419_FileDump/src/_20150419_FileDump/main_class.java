package _20150419_FileDump;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ����Ʈ ������ �о���� �׸��� int num �� ���� ������ Ȯ���� ���� �ڴ�.
		//  read�� �о���� ������ ũ�⸦ ��ȯ�Ѵ�. (�迭 ũ�⸸ŭ ������ �迭ũ�⸦ ��ȯ�Ѵ�. �ڼ��Ѱ�  http://docs.oracle.com/javase/7/docs/api/index.html Fileinputstream�� read return ����)
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
				System.out.println("���� : 16���� num��");
				for(int cnt = 0; cnt < num; cnt ++)
				{
					System.out.printf("%02X %d ",arr[cnt],num);
					System.out.println(" "+arr);	//�̰� �׳� �޸� �ּ��ε�
				}
				System.out.println("\n-----");
			}
			
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("���� ����");
		}
		catch(IOException ioe)
		{
			System.out.println("���� �� ����");
		}
		
		try{
			in.close();
		}
		catch(Exception e)
		{
			
		}

	}

}
