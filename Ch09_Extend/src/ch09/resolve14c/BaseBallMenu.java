package ch09.resolve14c;

import java.util.Scanner;

// 배열을 통해서 비교하면 풀수 있을것같은데... + Employee 참고
public class BaseBallMenu {
	private int num1;
	private int num2;
	private int num3;
	private Scanner sc = new Scanner(System.in);
	
	
	
	public void viewMenu() {
		System.out.print("첫번째 숫자 입력 >> ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 >> ");
		num2 = sc.nextInt();
		System.out.print("세번째 숫자 입력 >> ");
		num3 = sc.nextInt();
	}
	

}
