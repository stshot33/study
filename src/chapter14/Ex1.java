package chapter14;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("분자 >> ");
		int val1 = scanf.nextInt();
		
		System.out.print("분모 >> ");
		int val2 = scanf.nextInt();
		
		// 분모를 0으로 넣으면 예외가 발생
		// 예외가 발생하면 console(결과)창에 영어 문장이 나옴
		// 영어문장을 분석했을 때 Exception으로 시작하면
		// 예외가 발생했으니까 이 메세지를 참고해서 예외가 발생하지 않도록
		// 코드를 수정해라 라는 의미
		if(val2 == 0) {
			System.out.println("분모는 0일 수 없습니다.");
		} else {
			int result = val1 / val2;
			System.out.println("result = " + result);
		}
		
		System.out.println("프로그램 종료");
	}
}
