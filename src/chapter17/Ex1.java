package chapter17;

import java.util.ArrayList;

public class Ex1 {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		
		strList.add("A");
		strList.add("B");
		
		System.out.println("A와 B 문자열 저장 : " + strList);
		
		// add 할 때는 동작 원리를 잘 파악해서 ArrayList가 적합하지 않은 상황도 있음 
		strList.add("D");
		System.out.println("문자열 D 저장 : " + strList);
		
		strList.add(2, "C");
		System.out.println("2번 인덱스에 문자열 C 저장 : " + strList);
		
		String str = strList.get(0);
		System.out.println("0번 인덱스의 데이터 : " + str);
		
		// remove 할 때는 동작 원리를 잘 파악해서 ArrayList가 적합하지 않은 상황도 있음
		strList.remove(2);
		System.out.println("2번 인덱스의 데이터 삭제 : " + strList);
	}
}
