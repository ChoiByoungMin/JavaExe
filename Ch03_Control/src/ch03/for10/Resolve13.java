package ch03.for10;

import java.util.Scanner;

public class Resolve13 {

//	13. 양의 정수 입력받고 그 수만큼 3의 배수 출력하세요
//	   예를 들어 5를 입력받으면 3 6 9 12 15를 출력하면 됩니다
	public static void main(String[] args) {
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요");
		count = sc.nextInt();
		
//			for(int n=1; n<=count;n++) {
//				System.out.println((n*3)+", ");
//			}

//		int n = 1;
//		while(n<=count) {
//			System.out.println((n*3)+", ");
//			n++;
//		}

		int n=1;
		do {
			System.out.println((n*3) + ", ");
			n++;
		}while(n<=count);
	}

}
