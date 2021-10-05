package chapter8;

public class Object2 {
	void func() {
		System.out.println("매개변수가 없는 func");
	}
	
	void func(int num) {
		System.out.println("매개변수가 int 하나인 func");
	}
	
	void func(double num) {
		System.out.println("매개변수가 double 하나인 func");
	}
	
	void func(int num1, int num2) {
		System.out.println("매개변수가 int 두개인 func");
	}
	
	public static void main(String[] args) {
		Object2 obj = new Object2();
		
		// 1. 메서드 이름
		// 2. 매개변수의 개수와 타입
		// 위 두가지를 사용해서 컴퓨터는 메서드를 찾음
		obj.func();
		obj.func(3);
		obj.func(3.14);
		obj.func(1, 1);
	}
}





