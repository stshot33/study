package chapter6;

public class Ex9 {
	public static void main(String[] args) {
		
		String str = "apple";
		
		System.out.println("이 문자열의 길이는 " + str.length() + " 입니다.");
		
		char ch = str.charAt(1);
		System.out.println("ch = " + ch);
		
		System.out.println("str 문자열 내 모든 문자를 Sysout으로 출력하세요.");
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}


