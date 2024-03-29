package ch03.for10;

import java.util.Scanner;

public class Resolve3 {

// 3. 정수 3개를 입력받고 이 3개의 수로 삼각형을 만들 수 있는지를 판별하세요
// 삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 합니다. (조건 연산자를 사용하세요)
	public static void main(String[] args) {
		
		int a =0,b=0,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1번째 정수를 입력하세요");
		a=sc.nextInt();
		System.out.println("2번째 정수를 입력하세요");
		b=sc.nextInt();
		System.out.println("3번째 정수를 입력하세요");
		c=sc.nextInt();

		boolean triangle = (a+b>c) && (b+c>a) &&(a+c>b);
		
		if(triangle)
			System.out.println("삼각형을 만들 수 있습니다.");
		else 
			System.out.println("삼각형을 만들 수 없습니다.");
		
		sc.close();
	
	}
/*
 * 	public static void methodIf() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번째 숫자 입력 >> ");
		int num0 = sc.nextInt();
		System.out.print("2번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("3번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		
		boolean bTriangle = false;
//		if((num0+num1 > num2) && 
//			(num1+num2 > num0) &&
//			(num2+num0 > num1))
//			bTriangle = true;
		
		if(num0+num1 > num2) {
			if(num1+num2 > num0) {
				if(num2+num0 > num1)
					bTriangle = true;
			}
		}
		System.out.println("삼각형의 조건이 " + bTriangle + "입니다");
		
		sc.close();
	}
	
	public static void methodCondOp(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번째 숫자 입력 >> ");
		int num0 = sc.nextInt();
		System.out.print("2번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("3번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		
		boolean bTriangle = false;
		
		boolean cond0 = num0+num1 > num2;
		boolean cond1 = num1+num2 > num0;
		boolean cond2 = num2+num0 > num1;
		
		bTriangle = cond0 ? (cond1 ? (cond2 ? true : false) 
				                   : false) 
				          : false; 				
		

		System.out.println("삼각형의 조건이 " + bTriangle + "입니다");
		
		sc.close();		
	}
	
	public static void main(String[] args) {
//		methodIf();
		methodCondOp();
	}
 */

}
