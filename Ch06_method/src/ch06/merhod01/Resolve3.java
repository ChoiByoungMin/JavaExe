package ch06.merhod01;

import java.util.Scanner;

//3. int result = total(10, 100);
//위처럼 사용하면 result에는 10부터 100까지의 누적합이 저장되어야 합니다
//total메서드를 작성하고 사용해보세요.
public class Resolve3 {
	public static int sumNumber(int a,int b) {
		int result =0;
		
		for(int i=a;i<=b;i++) {
			result += i;
			System.out.println(i+"합:"+result);
		}
		return(result);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 a를 입력하세요");
		int a = sc.nextInt();
		System.out.println("정수 b를 입력하세요");
		int b = sc.nextInt();
		
		int result = sumNumber(a,b);
		sc.close();
	}

}
