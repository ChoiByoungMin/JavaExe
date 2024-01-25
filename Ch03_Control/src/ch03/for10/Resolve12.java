package ch03.for10;

import java.util.Scanner;

public class Resolve12 {

//	12. 양의 정수를 입력받고 그 수만큼 "감사합니다"를 출력하세요	
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 >> ");
		a = sc.nextInt();
		
		int i = 1;
		while(i<=a) {
			i++;
			System.out.println("감사합니다");
		}
		
//		for(int i= 1;i<= a; i++) {
//			System.out.println("감사합니다");
//		}

	}
/*
 * 		int i=1;
		
		do {
			System.out.print("감사합니다");
			i++;
			
		}while(i<= a)
 */
}
