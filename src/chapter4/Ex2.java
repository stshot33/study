package chapter4;

import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {
		// 배열의 길이를 직접 써주진 않았지만 데이터를 저장함으로써
		// 컴퓨터가 배열의 길이를 채워서 배열을 만들어줌
		int[] korArr = new int[] {84, 93, 52, 42};
		
		double[] avgArr = {67, 81.3, 54.67, 64.67};
		
		char[] gradeArr = {'B', 'A', 'C', 'B'};
		
		// 배열의 이름을 사용하면 배열의 정보가 출력됨
		System.out.println(korArr);
		
		// 배열의 구조를 시각화 시켜주는 기능
		String arrayToStr = Arrays.toString(korArr);
		System.out.println("korArr = " + arrayToStr);
		
		// 나머지 avgArr, gradeArr 배열의 데이터를 출력해보세요.
		arrayToStr = Arrays.toString(avgArr);
		System.out.println("avgArr = " + arrayToStr);
		
		System.out.println("gradeArr = " + Arrays.toString(gradeArr));
		
//		int[] engArr = {55, 80, 33, 52};
	}
}



