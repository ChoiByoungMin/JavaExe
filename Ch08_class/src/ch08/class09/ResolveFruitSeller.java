package ch08.class09;

public class ResolveFruitSeller {
	private int numOfApple;			// 사과개수
	private int saleMoney;			// 받은금액
	final int APPLE_PRICE = 1000;	// 사과가격(상수)
	
	public ResolveFruitSeller(int numOfApple) {
		this.numOfApple = numOfApple;
	}
	public int saleApple(ResolveFruitBuyer buyer, int money) {
		int num = money/APPLE_PRICE;
		numOfApple -= num;
		saleMoney += money;
		
		buyer.buyApple(money);
		buyer.receiveApple(num);
		
		return num;

	}
	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + saleMoney);
	}
	
}
