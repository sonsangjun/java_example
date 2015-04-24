package _20150420_ToString;

public class GoodsStock {
	String goodsCode;
	int stockNum;
	GoodsStock(String goodsCode, int stockNum)
	{
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}							//Object는 자바가 제공하는 라이브러리 객체의 어미니시다!! 그외 equals()도 오버라이드 가능하시다.
	public String toString()	//오버라이드가 가능한 이유는 이놈의 슈퍼클래스가 Object객체이고 거기에 toString()이 있기 때문이다.
	{
		String str = "상품코드 " + goodsCode + "재고수량 " + stockNum;
		return str;
	}
}
