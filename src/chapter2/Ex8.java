package chapter2;

public class Ex8 {
	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "Hello\tWorld";	// 우리가 방금 탭키를 누른것처럼 \t는 탭이라는 단위만큼 공백을 띄워라
		String str3 = "Hello\nWorld";	// \n 은 줄을 바꿔라 라는 명령
		String str4 = "Hello\"World";	// \" 은 "(쌍따옴표)를 출력해라
		String str5 = "Hello\'World";	// \' 는 '(홑따옴표)를 출력해라
		String str6 = "Hello\\World";	// \\ 는 \ 를 출력해라
		
		String str7 = "철수가 \\안녕하세요\\라고 말했습니다";
		
		System.out.println(str6);
	}
}
