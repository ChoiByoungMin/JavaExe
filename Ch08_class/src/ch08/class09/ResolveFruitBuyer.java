package ch08.class09;

public class ResolveFruitBuyer {
	private int money;
	private int numOfApple;
	
	public ResolveFruitBuyer(int money) {
		this.money = money;
		this.numOfApple = 0;
			
	}
	public void buyApple(ResolveFruitSeller seller, int money) {
		int num = money/seller.APPLE_PRICE;
		numOfApple += num;
		this.money  -= money;
	}
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + money);
		System.out.println("사과 개수 : " + numOfApple);
	}

}
