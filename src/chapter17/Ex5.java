package chapter17;

import java.util.ArrayList;

public class Ex5 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		
		Person p1 = new Person("홍길동", 32);
		Person p2 = new Person("고영희", 27);
		Person p3 = new Person("김영수", 22);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println("삭제 전 : " + list);
		
		Person target = new Person("고영희", 27);
		if(list.remove(target)) {
			System.out.println("삭제 함");
		} else { 
			System.out.println("삭제하지 못함");
		}
		
		System.out.println("삭제 후 : " + list);
		
//		Person wanted = new Person("고영희", 27);
//		if(list.contains(wanted)) {
//			System.out.println("고영희의 정보가 들어있음");
//		} else {
//			System.out.println("고영희의 정보가 들어있지 않음");
//		}
		
		
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		
//		System.out.println("1이 들어있나요? " + list.contains(1));
//		
//		int findData = 4;
//		if(list.contains(findData)) {
//			System.out.println("ArrayList 내 " + findData + "가 있습니다.");
//		} else {
//			System.out.println("ArrayList 내 " + findData + "가 없습니다.");
//		}
	}
}
