package chapter17;

import java.util.ArrayList;

public class Ex4 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("비어있나요? " + list.isEmpty());
		if(list.isEmpty()) {
			System.out.println("데이터가 없습니다.");
		} else {
			System.out.println("데이터가 있습니다.");
		}
		
		list.add(1);
		if(list.isEmpty()) {
			System.out.println("데이터가 없습니다.");
		} else {
			System.out.println("데이터가 있습니다.");
		}
		
//		list.add(10);
//		list.add(9);
//		list.add(8);
//		
//		System.out.println("초기 : " + list);
//		
//		list.set(0, 7);
//		System.out.println("0번 인덱스에 7 저장 : " + list);
//		
//		int origin = list.set(0, 10);
//		System.out.println("0번 인덱스에 10 저장 : " + list);
//		System.out.println("0번 인덱스에 있던 값 : " + origin);
	}
}
