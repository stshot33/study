package chapter5;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("<< 회원 가입 >>");
		
		System.out.print("1. 아이디 : ");
		String id = scanf.next();
		
		System.out.print("2. 비밀번호 : ");
		String pw = scanf.next();
		
		System.out.print("3. 이름 : ");
		String name = scanf.next();
		
		System.out.print("4. 나이 : ");
		int age = scanf.nextInt();
		
		System.out.print("5. 키 : ");
		double height = scanf.nextDouble();
		
		System.out.println("회원 가입을 진행합니다...");
	}
}


