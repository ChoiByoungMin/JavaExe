package ch03.for10;

import java.util.Scanner;

public class Resolve15 {

//	15. 사용자로부터 정수를 입력받습니다.
//	   입력 받은 값을 계속 더합니다
//	   사용자가 0을 입력하면 합을 출력합니다
//	   프로그램을 종료합니다.	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum =0;
		
		while(true){
			System.out.println("정수를 입력하세요 (0입력시 종료)");
			
			int stop = sc.nextInt();
			
			if(stop==0) {
				break;
			}
			
			sum += stop;
		}
		System.out.println("입력된 정수의 합:" + sum);
		sc.close();

	}
/*
 * 		public static void method0() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			System.out.print("정수 입력(0은 합계 출력) >> ");
			int num = sc.nextInt();
			if(num == 0)
				break;
			sum += num;
		}
		System.out.println("누적합은 " + sum);
		 
		sc.close();
	}

	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		boolean isRun = true;
		int sum = 0;
		while(isRun) {
			System.out.print("정수 입력(0은 합계 출력) >> ");
			int num = sc.nextInt();
			if(num == 0)
				isRun = false;
			sum += num;
		}
		System.out.println("누적합은 " + sum);
		 
		sc.close();
	}

	public static void main(String[] args) {
//		method0();
		method1();
 */

}
