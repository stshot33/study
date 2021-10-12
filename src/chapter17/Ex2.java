package chapter17;

import java.util.ArrayList;

public class Ex2 {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
//		intList.add(1);
		
		for(int i=1; i<=10; i++) {
			intList.add(i);
		}
		
		System.out.println("intList 내 데이터 : " + intList);
		
		intList.remove(1);
		intList.remove(8);
		
		System.out.println("intList 내 데이터 : " + intList);
		
		// 배열의 마지막 인덱스에서 추가하거나 제거할 때 사용하기 적합하다.
		
		for(int i=0; i<intList.size(); i++) {
			System.out.println(i + "번 인덱스 : " + intList.get(i));
		}
		
		// 향상된 for문
		// 단점 : n번째 데이터가 무엇인지 알 수 없음
		int index = 0;	// 따로 변수를 통해 인덱스를 저장해주어야 한다.
		for(Integer data : intList) {
			System.out.println(index + "번 인덱스 : " + data);
			index++;
		}
		
	}
}