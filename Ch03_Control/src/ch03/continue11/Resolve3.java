package ch03.continue11;

import java.util.Scanner;

//while문과 Scanner의 nextLine()메서드를 이용해서
//예금,출금,조회,종료 기능 제공
public class Resolve3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a =1, b=2, c=3;
		
		while(true) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.println();
			System.out.println("선택>");
			
			int stop = sc.nextInt();
			
			
			
		}
		
		
		
	}

}
