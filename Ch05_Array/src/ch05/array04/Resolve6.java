package ch05.array04;

import java.util.Scanner;

//6. 5명의 학생의 이름과 점수를 입력받고
//해당학생의 이름과 학점이 A, B, C, D, F로 출력되도록 하세요
//A : 90이상, B : 80이상, C : 70이상, D : 60이상, F : 60미만
public class Resolve6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] names = new String[5];
		int[] scores = new int[5];
		
		for(int i=0;i<5;i++) {
			System.out.print("학생"+(i+1)+"의 이름을 입력하세요");
			names[i]=sc.next();
			System.out.print("학생"+(i+1)+"의 점수를 입력하세요");
			scores[i]=sc.nextInt();
		
		}
		for(int i=0; i<scores.length;i++) {
		if(scores[i] >=90) 
			System.out.println("A");
		else if(scores[i]>=80)
			System.out.println("B");
		else if(scores[i]>=70)
			System.out.println("C");
		else if(scores[i]>=60)
			System.out.println("D");
		else 
			System.out.println("F");
								
		System.out.println(names[i]+"학점"+ scores[i]);
		System.out.println();
		}
		sc.close();
				
	}

}

//
// 		String[] nameArr = new String[5];
//		int[] scoreArr = new int[5];
//		char[] chScoreArr = new char[5];
//		
//		Scanner sc = new Scanner(System.in);
//		
//		/* 5명의 학생 이름과 점수 입력*/
//		for(int i=0;i<nameArr.length;i++) {
//			System.out.print((i+1) + "번째 학생 이름 >> ");
//			String name = sc.nextLine();
//			System.out.print((i+1) + "번째 학생 점수 >> ");
//			String strScore = sc.nextLine();
//			int score = Integer.parseInt(strScore);
//			
//			nameArr[i] = name;
//			scoreArr[i] = score;
//		}
//		
//		/*점수를 학점으로 변환*/
//		for(int i=0;i<scoreArr.length;i++) {
//			char chScore;
//			int score = scoreArr[i];
//			if(score >= 90)
//				chScore = 'A';
//			else if(score >= 80)
//				chScore = 'B';
//			else if(score >= 70)
//				chScore = 'C';
//			else if(score >= 60)
//				chScore = 'D';
//			else
//				chScore = 'F';
//			
//			chScoreArr[i] = chScore;
//		}
//		
//		/*학생 이름과 학점 출력*/
//		for(int i=0;i<nameArr.length;i++) {
//			System.out.printf("%d %s:%c\n", 
//							(i+1), nameArr[i], chScoreArr[i]);
