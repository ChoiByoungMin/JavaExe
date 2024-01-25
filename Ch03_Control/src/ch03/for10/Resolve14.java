package ch03.for10;

import java.util.Scanner;

public class Resolve14 {

//	14. 입력받은 숫자의 구구단을 출력하세요
//	   예를 들어 3을 입력하면 
//	   3 x 1 = 3
//	   3 x 2 = 6
//	   ...
//	   3 x 9 = 27	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		n = sc.nextInt();
		
//			for(int m = 1;m<=9;m++) {
//				System.out.println(n +"x"+m+"="+ (n*m));
//			}

//		int m =1;
//		while(m<=9) {
//			System.out.println(n+"x"+m +"="+(n*m));
//			m++;
//		}

		int m=1;
		do {
			System.out.println(n +"x"+m+"="+ (n*m));
			m++;
		}while(m<=9);
		
	}

}
