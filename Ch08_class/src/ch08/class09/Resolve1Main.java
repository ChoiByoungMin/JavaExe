package ch08.class09;

import java.util.Scanner;

import ch08.class09.answer02.Resolve1;

public class Resolve1Main {
	public static void main(String[] args) {
		
		
		Scanner sc = null;
		Resolve1 ans = new Resolve1(sc, new String[] {"짜장면",
				"짬뽕","탕수육","칠리새우","유산슬","유린기","깐풍기","볶음밥"},"마라후");
		ans.viewMenu();
		ans.selecMenu();
		ans.delFood();
		
	}

}
