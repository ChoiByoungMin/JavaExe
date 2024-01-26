package ch05.array08;

import java.util.Arrays;

//2.정수배열 5개를 할당하고
//Arrays.sort를 사용하지 말고 최소값과 최대값을 얻으세요
public class Resolve2 {
	public static void main(String[] args) {
		
	
	int[] num = {1542151,232,436,23,13};
	
	Arrays.parallelSort(num);
	
	System.out.println(Arrays.toString(num));
	
	}

}
