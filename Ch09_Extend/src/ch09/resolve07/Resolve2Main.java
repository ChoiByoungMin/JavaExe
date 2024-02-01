package ch09.resolve07;

import ch09.resolve07.answer02.Triangle;

public	class Resolve2Main{
		
		
		public static void main(String[] args) {
			// 객채 생성
			Triangle tri = new Triangle(4, 5);
			System.out.printf("밑변이 %d, 높이가 %d인 삼각형의 넓이는 %d\n",
					4, 5, tri.area());
			
			tri.setBase(7);
			tri.setHeight(12);
			System.out.printf("밑변이 %d, 높이가 %d인 삼각형의 넓이는 %d\n",
					7, 12, tri.area());
			
		}
		
	
	

}
