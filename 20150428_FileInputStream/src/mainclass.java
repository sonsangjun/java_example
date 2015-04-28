import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class mainclass{

	public static void main(String[] args) {
		FileInputStream fileinput;
		try {
			//available()메소드는 남아있는 파일사이즈는 Byte크기로 반환한다. 아예안읽었을경우 크기는 정확히 일치했다.
			//예외처리로는 IO익셉션처리다.
			//테스트한 이미지 파일은 정확히 521981Byte이다. (509KB 디스크 할당크기는 이보다 더크다.)
			fileinput = new FileInputStream("C:\\Users\\sohn\\Documents\\1406723231578.jpeg");
			System.out.println("아직 읽어아햘 크기 : " +fileinput.available()+" Byte");
			fileinput.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일없슴"+e.getMessage());
		} catch (IOException e) {
			System.out.println("남아있는 크기를 알수 없습니다. "+e.getMessage());
		}
	}
}