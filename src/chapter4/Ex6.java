package chapter4;

import java.util.Arrays;

public class Ex6 {
	public static void main(String[] args) {
		double[] avgArr = {67, 81.3, 54.67, 64.67};
		
		System.out.println("avgArr의 길이 = " + avgArr.length);
		
		System.out.println("avgArr[3] = " + avgArr[3]);
		
		System.out.println("avgArr[4] = " + avgArr[4]);
		
		System.out.println("전 -> " + Arrays.toString(avgArr));
		
		avgArr[3] = avgArr[2];
		avgArr[2] = avgArr[1];
		avgArr[1] = avgArr[0];
		avgArr[0] = 78.99;
		
		System.out.println("후 -> " + Arrays.toString(avgArr));
	}
}
