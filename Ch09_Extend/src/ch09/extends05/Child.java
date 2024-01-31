package ch09.extends05;

public class Child extends Father{
	
	float day = 365 + 1.0F/4;
	
	Child(){
	//	private System.out.println("Child 생성자");
	}
	
	Child(int score, long money, float day){
		super(score, money);	// Father의 매개변수 생성자 호출
		this.day = day;
		System.out.println("Child 매개변수 생정자");
	}
	void play() {
		System.out.println("인생이 즐겁다");
	}

}
