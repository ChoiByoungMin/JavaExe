package ch08.class09.answer03;
//나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를
//클래스로 설계해서 프로그래밍 하세요
public class Resolve2Buy {
	
	private int money;// 지불한 돈
	private int numOfPear;// 구매한 배 개수
	
	// 가지고 있는돈, 가지고 있는 배 개수 변경 가능한 생성자 생성
	public Resolve2Buy(int money) {
		this.money = money;
		this.numOfPear = 0;
	}
	// sellerPear 리턴한 값을 가져와서 가지고 있는 배 개수에 더한다.
	public void buyerPear (Resolve2Seller seller, int money) {
		this.numOfPear += seller.sellerPear(money);
		this.money -= money;
	}
	
	public void showPear () {
		System.out.println("구매자 현재 상황");
		System.out.println("현재 가지고 있는 돈 : " + money);
		System.out.println("현재 가지고 있는 배 : " + numOfPear);
	}


}
