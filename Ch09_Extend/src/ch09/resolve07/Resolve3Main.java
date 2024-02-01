package ch09.resolve07;


import java.util.Arrays;

import ch09.resolve07.answer03.ArrayUtility;

public class Resolve3Main {

	
	public static void main(String[] args) {
		int[] intArray = {10,2,55,4,12};
		double[] doubleArray = {1.5, 2.3, 15.1, 17.7, 22.3};
		
		int[] intResult = ArrayUtility.doubleToInt(doubleArray);
		double[] doubleResult = ArrayUtility.intToDouble(intArray);
		
		System.out.println(Arrays.toString(intArray));//오리지널 인트형
		System.out.println(Arrays.toString(doubleArray));//오리지널 더블형
		System.out.println(Arrays.toString(intResult));//더블에서 인트로
		System.out.println(Arrays.toString(doubleResult));//인트에서 더블로
		
	}

}
