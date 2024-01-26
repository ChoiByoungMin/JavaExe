package ch05.array04;

import java.util.Scanner;

//3. 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요.
public class Resolve3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]score  = new int[7];
		for(int i =0; i<score.length;i++) {
			System.out.println((i+1)+"번째 점수");
			score[i] = sc.nextInt();
			
		}
		int total =0;
		double avg = 0.;
		for(int i=0;i<score.length;i++) {
			total += score[i];
		}
		avg = total/score.length;
		
		System.out.println("총점"+ total);
		System.out.println("평균"+(double)avg);
		System.out.println();
		
		sc.close();
	}
	
}
