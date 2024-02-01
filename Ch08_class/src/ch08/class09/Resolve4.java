package ch08.class09;
//Rectangle클래스를 작성하세요
//int타입의 x1, y1, x2, y2 : 사각형을 구성하는 두 점의 좌표
//void set(int x1, int y1, int x2, int y2) : 좌표 설정
//int square() : 사각형 넓이 리턴
//void show() : 좌표와 넓이 등 직사각형 정보의 화면 출력
//boolean equals(Rectangle r) : 
//	인자로 전달된 객체 r과 현 객체가 동일한 좌표의 직사각형이면 true 리턴
public class Resolve4 {
	int x1;
	int y1;
	int x2;
	int y2;
	
	public void set(int x1, int y1, int x2, int y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	public int square() {
		int base = Math.abs(x1 - x2);
		int height = Math.abs(y1 - y2);
		
		return base*height;
	}
	public void show() {
		int leftX = x1 < x2 ? x1 : x2;
		int topY = y1 < y2 ? y1 : y2;
		int rightX = x1 > x2 ? x1 : x2;
		int bottomY = y1 > y2 ? y1 : y2;
		System.out.println("좌상단 x1 = " + leftX);
		System.out.println("좌상단 y1 = " + topY);
		System.out.println("우하단 x2 = " + rightX);		
		System.out.println("우하단 y2 = " + bottomY);
		System.out.println("넓이 = " + square());
	}
	public boolean equals(Resolve4 r) {
		if(this.x1 == r.x1 &&
		   this.y1 == r.y1 &&
		   this.x2 == r.x2 &&
		   this.y2 == r.y2)
			return true;
		
		return false;
	}
	public static void main(String[] args) {
		Resolve4 rc0 = new Resolve4();
		rc0.set(10, 10, 30, 30);
		
		Resolve4 rc1 = new Resolve4();
		rc1.set(10, 10, 30, 30);
		
		Resolve4 rc2 = new Resolve4();
		rc2.set(20, 20, 50, 50);
		
		rc0.show();
		rc1.show();
		rc2.show();
		
		if(rc0.equals(rc1))
			System.out.println("rc0과 rc1은 같습니다.");
		else
			System.out.println("rc0과 rc1은 다릅니다.");
		
		if(rc0.equals(rc2))
			System.out.println("rc0과 rc2은 같습니다.");
		else
			System.out.println("rc0과 rc2은 다릅니다.");
	}

}
