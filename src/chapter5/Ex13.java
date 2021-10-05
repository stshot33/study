package chapter5;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("키 입력 >> ");
		double height = scanf.nextDouble();
		
		System.out.print("몸무게 입력 >> ");
		double weight = scanf.nextDouble();
		
		double BMI = (weight / (height * height)) * 10000;
		
		System.out.println("당신의 BMI 지수는 " + BMI + "입니다.");
		
		if(BMI >= 30) {
			System.out.println("고도 비만입니다.");
		} else if(BMI >= 25) {
			System.out.println("비만입니다.");
		} else if(BMI >= 23) {
			System.out.println("과체중 의심입니다.");
		} else if(BMI >= 18.5) {
			System.out.println("정상입니다.");
		} else if(BMI < 18.5) {
			System.out.println("저체중입니다.");
		}
	}
}





