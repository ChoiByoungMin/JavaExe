
package ch05.array08;

import java.util.Arrays;

//4. 정수 배열 5개를 할당하고
//Arrays.sort를 사용하지 말고
//배열을 오름차순으로 정렬하도록 저장하세요.
//그리고 출력하세요.
public class Resolve4 {
	public static void main(String[] args) {
		int[]numArr = {141,34,77,2,99};
			
		for(int i=0;i<numArr.length;i++) {
			for(int j=1;j<numArr.length;j++) {
				int temp =0;
				if(numArr[j-1] > numArr[j]) {
					temp = numArr[j-1];
					numArr[j-1]=numArr[j];
					numArr[j]=temp;
				}
			}	
		}
		System.out.println(Arrays.toString(numArr));
	}
	

}
