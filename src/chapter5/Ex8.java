package chapter5;

public class Ex8 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		// else에는 조건식이 붙지 않다는 점!!
		// 이런 if - else 문을 해석할 때
		// else는 항상 그렇지 않으면 이라고 해석해야함
		if(false) {
			System.out.println("if문이");
			System.out.println("true일 때");
			System.out.println("코드 실행");
		} else {
			System.out.println("if문이");
			System.out.println("false일 때");
			System.out.println("코드 실행");
		}
		
		System.out.println("프로그램 종료");
	}
}
