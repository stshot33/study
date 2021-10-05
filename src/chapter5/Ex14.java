package chapter5;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("태어난 연도 >> ");
		int age = scanf.nextInt();
		
		age = 2021 - age;
		
		if(age >= 1 && age <= 7) {
			System.out.println("미취학 유아동입니다.");
		} else if(age >= 8 && age <= 13) {
			System.out.println("초등학생입니다.");
		}

	}
}
