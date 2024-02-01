package ch08.class09.answer02;

import java.util.Scanner;

// 중화요리집을 임의대로 클래스로 만드세요
public class Resolve1 {
//	private String [] chiRestaurant = {"짜장면","짬뽕","볶음밥","탕수육",
//									"칠리새우","팔보채","잡채밥","중국냉면"};
	
	private String [] foods;
	// 번호를 입력받는다.
	private int selecNum;
	private Scanner sc;
	private String name;
	
	
	public Resolve1 (Scanner sc, String[] foods, String name) {
		this.foods = foods;
		this.name = name;
		this.sc = sc;
		
		System.out.println(this.name+"식당을 청소한다");
		System.out.println(this.name+"재료를 준비한다");
	
	}
		
	//메뉴를 불러온다.
	public void viewMenu() {
		System.out.println("["+this.name +"]");
		for(int i=0;i<foods.length;i++) {
			System.out.println(i+". "+"메뉴 :"+foods[i]);
		}
	}
	//선택한다.
	public void selecMenu() {
		System.out.println("["+this.name +"]");
		System.out.print("어떤 음식을 선택하겠습니까>> ");
		selecNum = sc.nextInt();
	}
	//음식 나온다.
	public void delFood() {
		System.out.println("["+this.name +"]");
		String food = foods[selecNum];
		System.out.println("주문하신"+ food +"나왔습니다");
		System.out.println("맛있게 드세요");
	}


}
