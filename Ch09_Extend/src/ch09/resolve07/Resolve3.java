package ch09.resolve07;

import java.util.Arrays;

public class Resolve3 {
	// 정수 소스를 받아 더블형으로 변환
	static double[] intToDouble(int[] source) {
		if(source == null) {
			return null;
		}
		// 필드 생성 배열 생성
		int length = source.length;
		double[] result = new double[length]; // 객채생성
		
		// for문을 활용하여 source 배열을 더블형으로 변환시켜 저장
		for(int i=0;i<length;i++) {
			result[i] = (double)source[i];
		}
		
		return result;
	}
	// 실수 소스를 받아 정수형으로 변환
	static int[] doubleToInt(double[] source) {
		if(source == null) {
			return null;
		}
		
		int length = source.length;
		int [] result = new int[length];
		
		for(int i=0;i<length;i++) {
			result[i] = (int)source[i];
		}
		return result; 
	}
	
	public static void main(String[] args) {
		int[] intArray = {10,2,55,4,12};
		double[] doubleArray = {1.5, 2.3, 15.1, 17.7, 22.3};
		
		int[] intResult = Resolve3.doubleToInt(doubleArray);
		double[] doubleResult = Resolve3.intToDouble(intArray);
		
		System.out.println(Arrays.toString(intArray));//오리지널 인트형
		System.out.println(Arrays.toString(doubleArray));//오리지널 더블형
		System.out.println(Arrays.toString(intResult));//더블에서 인트로
		System.out.println(Arrays.toString(doubleResult));//인트에서 더블로
		
	}

}
