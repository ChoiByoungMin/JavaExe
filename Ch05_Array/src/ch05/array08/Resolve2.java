
package ch05.array08;

import java.util.Arrays;

//2.정수배열 5개를 할당하고
//Arrays.sort를 사용하지 말고 최소값과 최대값을 얻으세요
public class Resolve2 {
	public static void main(String[] args) {
		
	
	int[] num = {1200,400,300,500,100};
		
	System.out.println(Arrays.toString(num));
	
	int min, max;
	
	min = max = num[0];
	
	for(int i =1;i<num.length;i++) {
		if(min > num[i])
			min = num[i];
		
		if(max<num[i])
			max=num[i];
	}
	System.out.println("최소값"+min);
	System.out.println("최대값"+ max);
	}

}
