package ch09.extends05;

public class Father extends GrandFather{
	
	long money = 1000000000000000000L;
	
	Father(){
	//	private System.out.println("Father 생성자");
	}
	
	Father(int score, long money){
		super(score);	// GrandFather의 매개변수 생성자 호출
		this.money = money;
		System.out.println("Father 매개변수 생정자");
	}
	
	void wealth() {
		System.out.println("돈을 많이 벌었다");
	}

}