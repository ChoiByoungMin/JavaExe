package ch09.extends05;

public class GrandFather {
	int handsomeScore = 10;
	
	GrandFather(){
	//	private System.out.println("GrandFather 생성자");
	}
	
	GrandFather(int score){
		this.handsomeScore = score;
		System.out.println("GrandFather 매개변수 생성자");
	}
	
	void handsome() {
		System.out.println("잘 생겼다~");
	}

}
