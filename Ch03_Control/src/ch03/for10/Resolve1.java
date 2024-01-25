package ch03.for10;

import java.util.Scanner;

public class Resolve1 {

//1. 돈의 액수를 입금하세요
//	 입금한 돈을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요
//   출력 개수는 단위가 큰 것 순서로 계산합니다
//	 예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.

	public static void main(String[] args) {
		
		int money;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("돈의 액수를 입금하세요.");
		money = sc.nextInt();
		
		int[] denominations = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };
        int[] counts = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            counts[i] = money / denominations[i];
            money %= denominations[i];
        }

        // 변환된 개수 출력
        for (int i = 0; i < denominations.length; i++) {
            if (counts[i] > 0) {
                System.out.println(denominations[i] + "원: " + counts[i] + "개");
            }
        }

        sc.close();
    }
}