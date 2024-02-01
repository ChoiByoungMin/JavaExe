package ch09.resolve07.answer01;

public class Add {
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
