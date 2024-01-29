package ch06.merhod01;

import java.util.Scanner;

//1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
//작은 값을 반환하는 메서드를 작성하고 사용하세요


public class Resolve {
	public static int numComp(int num0,int num1, String cp) {
		
		int result = 0;
		
		switch(cp) {
		case("큰값"):
			if(num0 > num1)
				result = num0;
		break;
		}
		System.out.println("큰값" + result);
		return result;
		
		
	}
	
public static int comp(int num0,int num1,String cp) {
		
		int result1 = 0;
		
		switch(cp) {
		case("작은값"):
			if(num0 < num1)
				result1 = num0;
		break;
		}
		System.out.println("작은값" + result1);
		return result1;

}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 >> ");
		int num0 = sc.nextInt();
		System.out.println("정수를 입력하세요 >>");
		int num1 = sc.nextInt();
		System.out.println("큰값 , 작은값");
		String cp = sc.next();
		
		int result = numComp(num0,num1,cp);
		int result1 = comp(num0,num1,cp);

		
	}


}
