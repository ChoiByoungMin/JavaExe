package ch09.resolve14.question02;

import ch09.resolve14.question02.factory01.LgTablet;
import ch09.resolve14.question02.factory01.SamsungTablet;
import ch09.resolve14.question02.factory01.SonyTablet;
import ch09.resolve14.question02.order01.TabletTester;


public class TabletMain {
	public static void main(String[] args) throws InterruptedException {
		TabletTester tabletTester = new TabletTester();
		
		ITablet tabletArr[] = new ITablet[]{
				new LgTablet(), new SamsungTablet(), new SonyTablet()};
		
		int[] score = new int[tabletArr.length];
		
		for(int i=0;i<tabletArr.length;i++) {
			tabletTester.setTablet(tabletArr[i]);
			
			score[i] += tabletTester.movieTest();
			System.out.printf("---movie 테스트 점수는 %d입니다\n",score[i]);
			score[i] += tabletTester.musicTest();
			System.out.printf("---music 테스트 점수는 %d입니다\n",score[i]);
			score[i] += tabletTester.readBookTest();
			System.out.printf("---readBook 테스트 점수는 %d입니다\n",score[i]);
			
			System.out.printf("===>전체 테스트 점수는 %d입니다\n", score[i]);
			System.out.println("-------------------------------------");
			
		}
		int max = score[0];
		int maxIdx = 0;
		for(int i =1;i<score.length;i++) {
			if(max<score[i]) {
				max = score[i];
				maxIdx = i;
			}
		}
		
		
		System.out.printf("가장 높은 점수를 받은 자는 %d번째 차이고 점수는 %d입니다\n"
				,maxIdx+1,max);
		System.out.println(tabletArr[maxIdx].getClass().getName());
	}

}
