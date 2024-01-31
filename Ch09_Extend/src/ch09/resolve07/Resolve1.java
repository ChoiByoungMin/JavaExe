package ch09.resolve07;

	class Add{
	
		private int a;
		private int b;
		
		public void setValue(int a, int b) {
			this.a = a;
			this.b = b;
		}
		public int calculate() {
			return a+b;
		}
				
	}
	class Sub{
		
		private int a;
		private int b;
		
		public void setValue(int a, int b) {
			this.a =a;
			this.b =b;
		}
		public int calculate() {
			return a-b;
		}
	}
	class Mul{
		
		private int a;
		private int b;
		
		void setValue(int a, int b) {
			this.a=a;
			this.b=b;
			
		}
		int calculate() {
			return a*b;
		}
	}
	class Div{
		private int a;
		private int b;
		
		void setValue(int a, int b) {
			this.a=a;
			this.b=b;
			
		}
		int calculate() {
			return a/b;
		}
	
	public static void main(String[] args) {
		int a=10;
		int b=5;
		
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
	}
}
