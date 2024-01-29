package ch06.merhod01;

import java.util.Scanner;

//4. gugudan(3);
//
//구구단 메서드를 void 리턴형으로 제작하세요.
//3을 입력하면 3단이 출력됩니다.
public class Resolve4 {
	public static void gugudan(int num) {
		
		for(int i =1;i<=9;i++)
			System.out.println(num+"x"+i+"="+(num*i));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		gugudan(num);
		sc.close();
	}
	
}
