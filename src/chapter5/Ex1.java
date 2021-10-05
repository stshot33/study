package chapter5;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		// 내 프로그램에서 입력과 관련된 기능 꾸러미를 사용하기 위해서
		// 기능 꾸러미(Scanner) 를 생성
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("철수의 국어점수를 입력하세요 -> ");
		// scanf. 기능 꾸러미 안에 있는 여러 기능들을 사용할 수 있음
		// scanf.nextInt() -> 입력과 관련된 기능 꾸러미 안에서 정수를 입력할 수 있는 기능을 사용
		// scanf.nextInt() 의 동작 순서
		//  1. 입력이 끝날때까지 기다림
		//  2. 입력이 끝나면 입력한 값을 프로그램 안으로 가져옴
		int kor = scanf.nextInt();	// 철수의 국어점수
		
		
		System.out.println("철수의 국어점수 = " + kor);
	}
}




