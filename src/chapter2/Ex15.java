package chapter2;

public class Ex15 {
	public static void main(String[] args) {
		// 변수를 상수화할 때는 기준이 되는 값을 설정할 때 사용함
		// 기준이 되는 값의 예
		// - 시간을 계산할 때 사용하는 하루 24시
		// - 시간을 계산할 때 사용하는 초
		
		// 원 둘레를 구하는 프로그램
		
		final double PI = 3.14;	// 원주율
		int radius = 10;	// 반지름
		
		double circumference = 2 * PI * radius;
		
		System.out.println("반지름 = " + radius);
		System.out.println("원 둘레 = " + circumference);
		
		// ...
		
		radius = 10;	// 반지름
		
		circumference = 2 * PI * radius;
		
		System.out.println("반지름 = " + radius);
		System.out.println("원 둘레 = " + circumference);
	}
}
