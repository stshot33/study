package chapter2;

public class Ex12 {
	public static void main(String[] args) {
		// 실수 > 정수 > 문자
		
		char ch = 'A';
		int num1 = 20;
		
		// 문자를 정수로 형 변환
		// int num2 = (int) ch;
		int num2 = ch;
		
		// 정수를 실수로 변환
		// double num3 = (double) num1;
		double num3 = num1;
		
		System.out.println("char -> int / num2 = " + num2);
		System.out.println("int -> double / num3 = " + num3);
	}
}









