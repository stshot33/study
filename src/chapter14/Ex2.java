package chapter14;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
//		System.out.println("프로그램 시작");
//
		Scanner scanf = new Scanner(System.in);
//
//		System.out.print("분자 >> ");
//		int val1 = scanf.nextInt();
//
//		System.out.print("분모 >> ");
//		int val2 = scanf.nextInt();
//
//		try {
//			// try의 안에는 기본적으로 예외가 발생할 가능서이 있는 코드를 넣어주지만
//			// 프로그램의 흐름에 따라서는 예외가 발생할 가능성이 전혀 없는 코드도 들어오기도 함
//			int result = val1 / val2;
//
//			System.out.println("result = " + result);
//		} catch (ArithmeticException e) {
//			System.out.println("분모는 0이 될 수 없습니다.");
//		}

		System.out.println("프로그램 종료");

		int[] arr = { 3, 2, 1 };

		System.out.print("인덱스 번호 >> ");
		int index = scanf.nextInt();

		try {
		System.out.println("arr[" + index + "] = " + arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 번호가 잘못되었습니다.");
		}
		
		}
	}
