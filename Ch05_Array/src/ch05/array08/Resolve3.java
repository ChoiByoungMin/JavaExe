
package ch05.array08;

import java.util.Arrays;

//3.정수배열 5개를 할당하고
//  System.out.println(Arrays.toString(numArr));
//  로 배열을 출력했을 때 거꾸로 출력되도록
//  배열의 값을 거꾸로 저장하세요.
public class Resolve3 {
	public static void main(String[] args) {
		int[] numArr = {7,5,3,1,0};
		
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0;i<numArr.length;i++) {
			int temp =0;
			for(int j=1; j<numArr.length; j++)
				if(numArr[j-1]>numArr[j]) {
					temp = numArr[j-1];
					numArr[j-1] = numArr[j];
					numArr[j] = temp;
		
				}
		}
//		int temp =0;
//		
//		temp = numArr[0];
//		numArr[0]=numArr[4];
//		numArr[4]=temp;
//		
//		temp = numArr[1];
//		numArr[1]=numArr[3];
//		numArr[3]=temp;
		
		System.out.println(Arrays.toString(numArr));
		
	}

}
