package chapter8;

public class Ex2 {
	void printLines1() {
		System.out.println("printLines1 메서드 호출");
	}
	
	// 매개변수는 이 메서드가 동작하기 위해서 필요한 재료의 개수와 타입을 나열하는 자리
	// 이 메서드가 동작하기 위해서는 재료가 하나 필요하고 그 하나의 재료는 int여야한다.
	// 이 메서드를 호출하려면 int타입의 재료 하나를 반드시 넣어서 호출해야한다 라고 강제하는 것
	// int타입의 재료를 하나 넣어서 메서드를 호출하면
	// 이 메서드는 int타입의 재료를 n 이라는 이름의 변수에 담아서
	// 메서드 안에서 사용하게됨
	void printLines2(int n) {
		System.out.println("printLines2 메서드 호출");
		System.out.println("매개변수 n = " + n);
	}
	
	// printLinse2 메서드의 주석을 참고해서
	// printlinse3 메서드에 주석을 달아보세요.
	// 이 메서드가 동작하기 위해서는 재료가 하나 필요하고 그 하나의 재료는 double이여야한다.
	// double타입의 재료를 하나 넣어서 메서드를 호출하면
	// 이 메서드는 double타입의 재료를 n 이라는 이름의 변수에 담아서
	// 메서드 안에서 사용하게됨
	void printLines3(double n) {
		System.out.println("printLines3 메서드 호출");
		System.out.println("매개변수 n = " + n);
	}
	
	// 이 메서드가 동작하기 위해서는 재료가 두개가 필요하고
	// 두개의 재료 모두 int여야함
	// int타입의 재료 두개를 넣어서 메서드를 호출하면
	// 이메서드 안에서 int타입의 두 재료를 순서에 맞게
	// x, y 변수에 담아서 메서드 안에서 사용하게됨
	void printLines4(int x, int y) {
		System.out.println("printLines4 메서드 호출");
		
		System.out.println("매개변수 x = " + x);
		System.out.println("매개변수 y = " + y);
	}
}



