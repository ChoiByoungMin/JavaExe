package ch08.class09;
//나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를
//클래스로 설계해서 프로그래밍 하세요
public class Resolve2Main {
	public static void main(String[] args) {
		
		Resolve2Seller seller = new Resolve2Seller(10);
		Resolve2Buy buyer = new Resolve2Buy(10000);
		
		buyer.showPear();
		seller.showPear();
		
		buyer.buyerPear(seller, 5000);
		
		buyer.showPear();
		seller.showPear();
		
	}

}
