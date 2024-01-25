package ch03.for10;

import java.util.Scanner;

public class Resolve2 {

//	2. 369게임을 작성합니다.
//	1~99까지의 정수를 입력받고
//	3,6,9중 하나가 있으면 "박수짝"을 출력하고
//	2개가 있으면 "박수짝짝"을 출력하세요
//	예를 들어 13은 "박수짝"
//	36인 경우는 "박수짝짝"을 출력하면 됩니다.
	public static void main(String[] args) {
		
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99까지 정수를 입력하세요");
		i = sc.nextInt();
		
        boolean clap1 = (i % 10 == 3 || i % 10 == 6 || i % 10 == 9);
        boolean clap2 = (i / 10 == 3 || i / 10 == 6 || i / 10 == 9);

		
        if (clap1 && clap2) {
            System.out.println("박수짝짝");
        } else if (clap1 || clap2) {
            System.out.println("박수짝");
        } else {
            System.out.println(i);
        }

        sc.close();
    }
}