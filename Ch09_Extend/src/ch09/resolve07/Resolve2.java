package ch09.resolve07;


	class Triangle{
		// 필드
		private double under;
		private double height;
		
		// 변경 할 수 있는 생성자 정의
		public Triangle(double under, double height) {
			this.height=height;
			this.under=under;
		}
		// 세터 메소드 (정보변경)
		public void setUnder(double under) {
			this.under=under;
		}
		public void setHeight(double height) {
			this.height =height;
		}
		// 넓이 계산 메소드
		public double calculateArea() {
			return (under*height)/2;
		}
		// 게터 메소드
		public double getUnder() {
			return under;
		}

		public double getHeight() {
			return height;
		}
		
		public static void main(String[] args) {
			// 객채 생성
			Triangle triangle = new Triangle(10.0,4.0);
			
			System.out.println("밑변 :" + triangle.getUnder() );
			System.out.println("높이 :" + triangle.getHeight() );
			System.out.println("넓이 :" + triangle.calculateArea() );
			
		}
		
	
	

}
