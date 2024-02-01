package ch08.class09.answer03;
//나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를
//클래스로 설계해서 프로그래밍 하세요
public class Resolve2Seller {
	// 필드 생성
	private int numOfPear;// 배 개수
	private int saleMoney;// 받은 돈
	final int PEAR = 2500; // 배가격 상수
	
	// 가지고있는 배 개수
	public  Resolve2Seller (int numOfPear) {
		this.numOfPear = numOfPear;
	}
	
	// 돈을 받고 그 돈에서 상수를 나누면 배 개수가 나온다/
	// 그 배개수를 리턴해서 저장한다
	public int sellerPear(int money) {
		int num = money/PEAR;
		saleMoney += money;
		numOfPear -= num;
		return num;
	}
	
	public void showPear () {
		System.out.println("판매자 현재 상황");
		System.out.println("현재 가지고 있는 돈 : " + saleMoney);
		System.out.println("현재 가지고 있는 배 : " + numOfPear);

	}
}
