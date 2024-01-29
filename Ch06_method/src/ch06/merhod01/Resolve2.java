package ch06.merhod01;

import java.util.Scanner;

//2. 두 개의 정수를 받아서, 두 수의 차의 절대값을 계산하여 출력하는 메서드를 만들고
//사용해보세요. 메서드 호출 시 전달되는 값의 순서와 상관없이
//절대값이 계산되어서 출력되어야 합니다
public class Resolve2 {
	public static int aCal(int a,int b) {
		int result = 0;
		
		if(a>b) {
			result = a-b;
			System.out.println("두수의 차의 절대값" + result);
		}else if(a<b) {
			result = b-a;
			System.out.println("두수의 차의 절대값" + result);
		}else
			System.out.println(0);
		
		return(result);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a정수 입력");
		int a = sc.nextInt();
		System.out.println("b정수 입력");
		int b = sc.nextInt();
		
		int result = aCal(a,b);
		sc.close();
	}

}
