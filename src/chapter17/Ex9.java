package chapter17;

import java.util.HashMap;
import java.util.Map;

public class Ex9 {
	public static void main(String[] args) {
//		 Map
//		
//		
		Map<String, Integer> classOneKor = new HashMap<>();
				
		classOneKor.put("홍길동", 95);
		classOneKor.put("김철수", 86);
		classOneKor.put("고영희", 35);
		
		System.out.println("초기 상태 : " + classOneKor);
		
		classOneKor.put("홍길동", 11);
		System.out.println("홍길동 키에 데이터 11 저장 : " + classOneKor);
		
		System.out.println("홍길동 : " + classOneKor.get("홍길동"));
		
		Integer kor = classOneKor.get("고영희");
		System.out.println("고영희 : " + kor);
		
		int i_kor = classOneKor.get("고영희");
		System.out.println("고영희 : " + i_kor);
		
		classOneKor.remove("김철수");
		System.out.println("김철수 키 삭제 : " + classOneKor);
	}
}
