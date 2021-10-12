package chapter17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex7 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
//		Set<String> lyricsSet = new HashSet<>();
//		Scanner scanf = new Scanner(System.in);
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(7);
		System.out.println("초기 상태 : " + set);
		
		// 중복된 데이터 추가X
		set.add(1);
		System.out.println("요소 1 추가 : " + set);
		
		if(set.add(3)) {
			System.out.println("요소 3을 추가함");
		} else {
			System.out.println("요소 3을 추가하지 못함");
		}
		
		set.remove(1);
		System.out.println("요소 1 삭제 : " + set);
		
		// set 안에 들어있는 모든 데이터를 출력하세요.
		// 향상된 for문 활용
		for(Integer number : set) {
			System.out.println(number);
		}
		
		// Iterator 활용
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			Integer number = iterator.next();
			System.out.println(number);
		}
		
		
		
		
//		while(true) {
//			System.out.print("노래 가사를 입력하세요.(종료 : -1) : ");
//			String lyrics = scanf.next();
//			
//			if(lyrics.equals("-1")) {
//				break;
//			}
//			
//			boolean addResult = lyricsSet.add(lyrics);
//			if(!addResult) {
//				System.out.println("이미 입력된 가사입니다. => " + lyrics);
//			}
//			
//			System.out.println();
//		}
	}
}
