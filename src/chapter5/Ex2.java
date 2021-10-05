package chapter5;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("<< 입력 시작 >>");
		
		System.out.println("정수 입력 -> ");
		int num1 = scanf.nextInt();
		
		System.out.println("실수 입력 -> ");
		double num2 = scanf.nextDouble();
		
		System.out.println("문자 입력 -> ");
		char num3 = scanf.next().charAt(0);
		
		System.out.println("문자열 입력 -> ");
		String num4 = scanf.next();
		
		System.out.println("<< 입력 종료 >>");
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);
	}
}





