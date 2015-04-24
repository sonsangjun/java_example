
public class _20150416 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0x8 = 0000 1000
		// 0x9 = 0000 1001
		// 0xA = 0000 1010
		// 0xB = 0000 1011
		// 0xC = 0000 1100
		// 0xD = 0000 1101
		// 0xE = 0000 1110
		// 0xF = 0000 1111
		int num1 = 0xFFFFFFFE;
		int num[] = new int[5];
		for(int i=0; i<num.length; i++)
		{
			num[i] = num1 << 30+i;
			System.out.printf("num["+i+"] = %08X\n",num[i]);
		}
		
	}

}
