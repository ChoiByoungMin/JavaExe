package ch14.exception01.ch11.sec05;

public class TrowsExample1 {
	public static void main(String[] args) {
		try {
			findClass();
		}catch (ClassNotFoundException e) {
			System.out.println("예외 처리: " + e.toString());
		}
	}
										// vv 예외처리를 부모에게 던져줘서 부모가 예외를 모아 한번에 처리하기도 한다.
	public static void findClass()throws ClassNotFoundException	{
		Class.forName("java.lang.String2");
	}

}
