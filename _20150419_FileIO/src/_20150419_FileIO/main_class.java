package _20150419_FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ���ű�
		FileReader reader = null;
		try{
			reader = new FileReader("C:\\Users\\sohn\\OneDrive\\Java\\_20150419_FileIO\\readme.txt");
			while(true)
			{
				int data = reader.read();
				if(data == -1)
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("���Ͼ���");
		}
		catch(IOException ioe)
		{
			System.out.println("���� ������ ����");
		}
		try
		{
			reader.close();
		}
		catch(Exception e)
		{
			
		}
	}

}
