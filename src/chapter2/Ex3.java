package chapter2;

// 코드를 먼저 입력하신분은 이 프로그램의 동작원리를 파악해보세요.

public class Ex3 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = num1;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		num2 = 20;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
}
