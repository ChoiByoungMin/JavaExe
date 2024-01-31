package ch09.resolve07;


	class Triangle{
		private double under;
		private double height;
		
		public Triangle(double under, double height) {
			this.height=height;
			this.under=under;
		}
		
		public void setUnder(double under) {
			this.under=under;
		}
		public void setHeight(double height) {
			this.height =height;
		}
		
		public double calculateArea() {
			return (under*height)/2;
		}

		public double getUnder() {
			return under;
		}

		public double getHeight() {
			return height;
		}
		
		public static void main(String[] args) {
			Triangle triangle = new Triangle(10.0,4.0);
			
			System.out.println("밑변 :" + triangle.getUnder() );
			System.out.println("높이 :" + triangle.getHeight() );
			System.out.println("넓이 :" + triangle.calculateArea() );
			
		}
		
	
	

}
