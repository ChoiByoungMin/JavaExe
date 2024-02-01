package ch08.class09;

import ch08.class09.answer05.Resolve4;

//Rectangle클래스를 작성하세요
//int타입의 x1, y1, x2, y2 : 사각형을 구성하는 두 점의 좌표
//void set(int x1, int y1, int x2, int y2) : 좌표 설정
//int square() : 사각형 넓이 리턴
//void show() : 좌표와 넓이 등 직사각형 정보의 화면 출력
//boolean equals(Rectangle r) : 
//	인자로 전달된 객체 r과 현 객체가 동일한 좌표의 직사각형이면 true 리턴

public class Resolve4Main {
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

		if (rc0.equals(rc1))
			System.out.println("rc0과 rc1은 같습니다.");
		else 
			System.out.println("rc0과 rc1은 다릅니다.");
		
		if (rc0.equals(rc2)) 
			System.out.println("rc0과 rc2은 같습니다.");
		else 
			System.out.println("rc0과 rc2은 다릅니다.");
		
	}
}