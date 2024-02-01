package ch09.resolve07;

import ch09.resolve07.answer05.Child;

/* 클래스 설계에서 접근권한 설정
 * 1) 필드 -> private
 *    메서드 -> public
 * 2) 메서드 중에 내부에서만 사용하는 메서드 -> private  
 * 
 */
public class Resolve5Main {
	
	public static void main(String[] args) {
		Child alex = new Child(15);
		Child james = new Child(9);
		
		alex.get(james, 2);
		james.get(alex, 7);
		
		System.out.println("alex의 구슬 수=" + alex.getBallCnt());
		System.out.println("james의 구슬 수=" + james.getBallCnt());
	}
	

}
