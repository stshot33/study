package chapter4;

public class Ex7 {
	public static void main(String[] args) {
		int[] arr1;
		arr1 = new int[2];
		
		// 배열은 변수와 다르게 선언만 하더라도
		// 배열의 데이터 타입에 맞는 기본값이 저장된 상태로
		// 배열의 공간이 만들어짐
		// 정수의 기본값 : 0
		// 실수의 기본값 : 0.0
		// 문자의 기본값 : \0
		// 문자열(참조 데이터 타입)의 기본값 : null
		int[] arr2 = new int[2];
		System.out.println(arr2[0]);
		
		int[] arr3 = {10, 9, 8};
		System.out.println(arr3[0]);
		
		int[] arr4 = new int[3];
		arr4[0] = 10;
		arr4[1] = 9;
		arr4[2] = 8;
	}
}


