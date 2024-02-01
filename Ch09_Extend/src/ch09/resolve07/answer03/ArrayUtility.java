package ch09.resolve07.answer03;

import java.util.Arrays;

public class ArrayUtility {
	// 정수 소스를 받아 더블형으로 변환
	public static double[] intToDouble(int[] source) {
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
	public static int[] doubleToInt(double[] source) {
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
	
	
		
	

}
