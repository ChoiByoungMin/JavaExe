package ch09.resolve07;

class Add{
		// 필드
		private int a;
		private int b;
		
		// 필드에 저장하는 값을 전달받음
		public void setValue(int a, int b) {
			this.a = a;
			this.b = b;
		}
		// 연산하여 결과값 리턴
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

		//객체 생성
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		add.setValue(100,20);
	}
}
