package _20150420_ToString;

public class GoodsStock {
	String goodsCode;
	int stockNum;
	GoodsStock(String goodsCode, int stockNum)
	{
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}							//Object�� �ڹٰ� �����ϴ� ���̺귯�� ��ü�� ��̴Ͻô�!! �׿� equals()�� �������̵� �����Ͻô�.
	public String toString()	//�������̵尡 ������ ������ �̳��� ����Ŭ������ Object��ü�̰� �ű⿡ toString()�� �ֱ� �����̴�.
	{
		String str = "��ǰ�ڵ� " + goodsCode + "������ " + stockNum;
		return str;
	}
}
