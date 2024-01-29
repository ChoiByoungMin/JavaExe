package ch06.merhod01;

import java.util.Scanner;

//1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
//작은 값을 반환하는 메서드를 작성하고 사용하세요


public class Resolve {
	
	public static int compare1(int num0, int num1) {
		int result = 0;
		
		result = num0>num1 ? num0:num1;

		return(result);
	}
	
	
	public static int compare2(int num0, int num1) {
		
		int result = 0;
		
		result = num0<num1 ? num0:num1;
		return(result);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 >> ");
		int num0 = sc.nextInt();
		System.out.print("정수를 입력하세요 >>");
		int num1 = sc.nextInt();
		System.out.println("큰/작은 >>");
		String choi = sc.next();
		
		if("큰".equals(choi)) {
			System.out.println("큰값"+ compare1(num0,num1));
		}else if("작은".equals(choi)) {
			System.out.println("작은값"+ compare2(num0,num1));
		}else
			System.out.println("잘못된 입력입니다.");
		
		sc.close();

	}


}
