package ch08.class09;
//1.FruitMain클래스에		
//	현재는 buyer.buyApple(seller, 2000); 처럼 프로그래밍되어
//	있습니다.
//	아래처럼 seller를 중심으로 수정하세요.
//	seller.saleApple(buyer, 2000);
public class ReloveFluitMain {
	public static void main(String[] args) {
		ResolveFruitSeller seller = new ResolveFruitSeller(20);
		ResolveFruitBuyer buyer = new ResolveFruitBuyer(10000);
		
		buyer.showBuyResult();
		seller.showSaleResult();
			
		seller.saleApple(buyer, 2000); // 과일 구매자의 현재 상황 해결 필요
		
		buyer.showBuyResult();
		seller.showSaleResult();
		
		
	}

}
