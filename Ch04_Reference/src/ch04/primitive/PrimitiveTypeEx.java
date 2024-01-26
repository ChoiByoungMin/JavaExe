package ch04.primitive;

public class PrimitiveTypeEx {
	public static void main(String[] args) {
		// 아래 변수는 Stack에 생성되었다가
		// main의 영역을 벗어나면 Stack에서 사라진다.
		// 지역변수
		byte b = 10;
		char ch = 'A';
		short s = 10000;
		int i = 99999999;
		long l = 999999999999999L;
		float f = 3.14f;
		double d = 3.14;
		System.out.printf("byte size : %d\n", Byte.SIZE);
		System.out.printf("char size : %d\n", Character.SIZE);
		System.out.printf("short size : %d\n", Short.SIZE);
		System.out.printf("int size : %d\n", Integer.SIZE);
		System.out.printf("long size : %d\n", Long.SIZE);
		System.out.printf("float size : %d\n", Float.SIZE);
		System.out.printf("double size : %d\n", Double.SIZE);
	}

}
