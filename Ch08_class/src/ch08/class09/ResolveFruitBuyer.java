package ch08.class09;

public class ResolveFruitBuyer {
	private int money;
	private int numOfApple;
	
	public ResolveFruitBuyer(int money) {
		this.money = money;
		this.numOfApple = 0;
			
	}
	// 판매자가 2000원을 받았다 = money
	// 구매자는 가지고 있는 돈 getmoney 에서 money를 뺀다 
	// 구매자가 현재 가지고 있는 개수를 구하려면
	// 구매자에게서 받은 돈에서/가격상수를 하면 개수가 나온다
	// 그 개수 를 가져온다
	// 개수를 해결하는 방법
	public void buyApple(int money) {
		this.money  -= money;
	}
	public void receiveApple(int num) {
		this.numOfApple += num;
	}
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 : " + money);
		System.out.println("사과 개수 : " + numOfApple);
	}

}
